package com.kist.service;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.Date;

import com.kist.util.DbUtil;

public class StudentServiceImpl implements StudentService {

	@Override
	public void createStudent() throws ClassNotFoundException, SQLException {

		String insertqueary = "INSERT into student(firstname,lastname,email,ph_no,faculty,updated_ts,created_ts)"
				+ "values(?,?,?,?,?,?,?)";

		PreparedStatement preparedStatement = DbUtil.getConnection()
				.prepareStatement(insertqueary);
		preparedStatement.setString(1, "Jack");
		preparedStatement.setString(2, "Black");
		preparedStatement.setString(3, "Jack_black@gmail.com");
		preparedStatement.setString(4, "76324576327");
		preparedStatement.setString(5, "Bim");
		preparedStatement.setTimestamp(6, new Timestamp(new Date().getTime()));
		preparedStatement.setTimestamp(7, new Timestamp(new Date().getTime()));

		preparedStatement.execute();

	}

	@Override
	public void updateStudent() throws ClassNotFoundException, SQLException {
		// update quary
		String updateQuary = "UPDATE student SET firstname=? where id=? ";
		PreparedStatement preparedStatement1 = DbUtil.getConnection()
				.prepareStatement(updateQuary);
		preparedStatement1.setString(1, "Suraz");
		preparedStatement1.setString(2, "1");
		preparedStatement1.execute();

	}

	@Override
	public void deleteStudent() throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		String deleteQuery = "Delete * from student where id=?";
		PreparedStatement preparedStatement = DbUtil.getConnection()
				.prepareStatement(deleteQuery);
		preparedStatement.setInt(1, 2);
		preparedStatement.execute();

	}

	@Override
	public void getStudent() throws ClassNotFoundException, SQLException {

		// select query
		java.sql.Statement stmt = DbUtil.getConnection().createStatement();
		ResultSet rs = stmt.executeQuery("select * from student");
		while (rs.next()) {
			System.out.println(rs.getString("firstname"));
			System.out.println(rs.getString("lastname"));
			System.out.println(rs.getString("email"));
			System.out.println(rs.getString("ph_no"));
			System.out.println(rs.getString("faculty"));
			System.out.println(rs.getString("updated_ts"));
			System.out.println(rs.getString("created_ts"));

		}
	}

	@Override
	public void getStudentList() {
		// TODO Auto-generated method stub

	}

}
