package saveDate;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Leave {
	private static final String DRIVER = "com.mysql.jdbc.Driver";

	private static final String URL = "jdbc:mysql://localhost:3306/save_date?user=user01&password=password01&useSSL=false";

	private static final String SQL = "insert into stampings (stamping_classification) values (?)";

	public static void main(String[] args) throws ClassNotFoundException {

		try {
			Class.forName(DRIVER);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			throw e;
		}

		try (Connection connection = DriverManager.getConnection(URL);
				PreparedStatement statement = connection.prepareStatement(SQL)) {
			statement.setInt(1, 1);
			statement.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
