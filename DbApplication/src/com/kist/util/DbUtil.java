package com.kist.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbUtil {

	public static Connection getConnection() throws ClassNotFoundException,
			SQLException {
		Connection con = null;
		if (con==null){
			Class.forName("com.mysql.jdbc.Driver");
			 con = DriverManager.getConnection("jdbc:mysql://localhost:3306/kist", "root", "Susikhaj");
			
		}
		return con;
		
	}
}
