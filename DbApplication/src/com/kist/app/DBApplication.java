package com.kist.app;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.Date;

import com.kist.service.StudentService;
import com.kist.service.StudentServiceImpl;
import com.kist.util.DbUtil;


public class DBApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentService studentService = new StudentServiceImpl();
		try {
			//create student
			studentService.createStudent();
			
			//update student
			studentService.updateStudent();
			
			//select student
			studentService.getStudent();
			
		} catch (ClassNotFoundException |SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
