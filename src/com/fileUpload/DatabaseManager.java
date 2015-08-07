package com.fileUpload;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseManager {
	
	private static Connection conn;
	
	public static Connection getConnection() throws SQLException, ClassNotFoundException {
		if (conn == null) {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://47.168.150.224:3306/wvm224", "emrahs", "My5q!Mgr");
		}
		return conn;
	}

}
