package connection;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
	public static Connection driverConnection() {
		Connection conn = null;
		try {
			// driver name -> forName responsible to load driver into project
			Class.forName("com.mysql.cj.jdbc.Driver");
			// connectivity URL
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/project", "root", "");

		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	}
}
