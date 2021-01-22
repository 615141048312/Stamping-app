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

	private static final String SQL = "select * from stampings where id = ?";

	public static void main (String[] args) throws ClassNotFoundException {

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

			Timestamp ts1 = rs1.getTimestamp("stamping");
			Timestamp ts2 = rs2.getTimestamp("stamping");

			Date start = new Date(ts1.getTime());
			Date leave = new Date(ts2.getTime());

			// if(rs1.next() && rs2.next()) {
				// System.out.println("----------------------");
				// System.out.println(rs1.getTimestamp("stamping"));
				// System.out.println(rs2.getTimestamp("stamping"));
			// }


		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
}
