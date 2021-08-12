package com.scholly.appl.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.scholly.appl.beans.Form;
import com.scholly.appl.beans.Student;
import com.scholly.appl.dao.StudentDao;
import com.scholly.appl.exp.StudException;

@Service("studService")
public class StudentServiceImpl implements StudentService{

	@Autowired
	StudentDao studDao;
	
	@Override
	public Boolean registerStudent(Student stud) {
		return studDao.registerStudent(stud);
	}
	
	@Override
	public Boolean loginStudent(Long stud_id, String stud_pwd) {
		return studDao.loginStudent(stud_id, stud_pwd);
	}


	@Override
	public String updatePassword(Long stud_id, String old_pwd, String new_pwd) throws StudException {
		return studDao.updatePassword(stud_id, old_pwd, new_pwd);
	}

	@Override
	public Student getStudentDets(Long stud_id) {
		return studDao.getStudentDets(stud_id);
	}

	@Override
	public List<Student> getAllStudents() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Form> getAppliedForms() {
		// TODO Auto-generated method stub
		return null;
	}

}
