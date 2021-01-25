package saveDate;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.Date;

public class Access {

	private static final String DRIVER = "com.mysql.jdbc.Driver";
	private static final String URL = "jdbc:mysql://localhost:3306/save_date?user=user01&password=password01&useSSL=false";
	private static final String SQL = "select stamping from stampings where id = ?";

	public AtWork today;

	public Access() {
		today = new AtWork();
	}
	public PreparedStatement statement1;
	public PreparedStatement statement2;
	public Date Date1;
	public Date Date2;

	public AtWork stamps(){

		try {
			Class.forName(DRIVER);
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
		}

		try (Connection connection = DriverManager.getConnection(URL);
				) {
			statement1 = connection.prepareStatement(SQL);
			statement2 = connection.prepareStatement(SQL);

			statement1.setLong(1, 1L);
			statement2.setLong(1, 2L);

			statement1.execute();
			statement2.execute();

			ResultSet rs1 = statement1.getResultSet();
			ResultSet rs2 = statement2.getResultSet();

			while (rs1.next() && rs2.next()) {
				Timestamp ts1 = rs1.getTimestamp("stamping");
				Timestamp ts2 = rs2.getTimestamp("stamping");
				Date1 = new Date(ts1.getTime());
				Date2 = new Date(ts2.getTime());
			}


		} catch (SQLException e) {
			e.printStackTrace();
		}

		today.start = Date1;
		today.leave = Date2;
		return today;

	}

}
