package saveDate;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.Date;

public class Calc {
	private static final String DRIVER = "com.mysql.jdbc.Driver";
	private static final String URL = "jdbc:mysql://localhost:3306/save_date?user=user01&password=password01&useSSL=false";
	private static final String SQL = "select stamping from stampings where id = ?";
	public AtWork today = new AtWork();

	public AtWork stamps() throws ClassNotFoundException {

		try {
			Class.forName(DRIVER);
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
			throw e;
		}

		try (Connection connection = DriverManager.getConnection(URL);
				PreparedStatement statement1 = connection.prepareStatement(SQL);
				PreparedStatement statement2 = connection.prepareStatement(SQL)) {
			statement1.setLong(1, 1L);
			statement2.setLong(1, 2L);

			statement1.execute();
			statement2.execute();

			ResultSet rs1 = statement1.getResultSet();
			ResultSet rs2 = statement2.getResultSet();

			// Date Date1 = new Date(rs1.getTime());
			// Date Date2 = new Date(rs2.getTime());

		} catch (SQLException e) {
			e.printStackTrace();
		}

		// today.start = ;
		// today.leave = ;
		return today;
	}
}
