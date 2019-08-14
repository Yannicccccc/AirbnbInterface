package airbnb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
 
public class JDBCTest {
	
	private static final String driverUrl = "oracle.jdbc.driver.OracleDriver";
 
	private static final String url = "jdbc:oracle:thin:@cs322-db.epfl.ch:1521:ORCLCDB";
	
	private static final String username = "C##DB2019_G24";
	
	private static final String password = "DB2019_G24";
	
	public static Connection getConnection(){
		Connection connection = null;
		try {
			Class.forName(driverUrl);
			connection = DriverManager.getConnection(url, username, password);
			connection.close();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return connection;
	}
	
	// 测试Oracle连接是否成功
	public static void main(String[] args) {
		Connection connection = JDBCTest.getConnection();
		System.out.println("连接成功："+connection);
	}
	
}