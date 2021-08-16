package com.scholly.appl.dao;

import java.util.List;

import com.scholly.appl.beans.Form;
import com.scholly.appl.beans.Student;
import com.scholly.appl.exp.StudException;

public interface StudentDao {

	public Boolean registerStudent(Student stud);
	public Boolean loginStudent(Long studId,String studPwd);
	public Student getStudentDets(Long studId);  
	public String updatePassword(Long studId, String oldPwd, String newPwd) throws StudException;
	public List<Student> getAllStudents();
	public List<Form> getAppliedForms(); //to be implemented

}
