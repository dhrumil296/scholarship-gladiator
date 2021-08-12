package com.scholly.appl.dao;

import java.util.List;

import com.scholly.appl.beans.Form;
import com.scholly.appl.beans.Student;
import com.scholly.appl.exp.StudException;

public interface StudentDao {

	public Boolean registerStudent(Student stud);
	public Boolean loginStudent(Long stud_id,String stud_pwd);
	public Student getStudentDets(Long stud_id);  
	public String updatePassword(Long stud_id, String old_pwd, String new_pwd) throws StudException;
	public List<Student> getAllStudents();
	public List<Form> getAppliedForms(); //to be implemented

}
