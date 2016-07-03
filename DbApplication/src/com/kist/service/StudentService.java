package com.kist.service;

import java.sql.SQLException;

public interface StudentService {
	
	//this service will interact with student table in the database 
	// so we will include all the method we need to interact with the student table

	public void createStudent() throws ClassNotFoundException, SQLException;
	public void updateStudent() throws ClassNotFoundException, SQLException;
	public void deleteStudent() throws ClassNotFoundException, SQLException;
	public void getStudent() throws ClassNotFoundException, SQLException;
	public void getStudentList() throws ClassNotFoundException, SQLException;
	
}
