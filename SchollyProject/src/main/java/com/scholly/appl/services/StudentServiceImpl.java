package com.scholly.appl.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.scholly.appl.beans.Student;
import com.scholly.appl.dao.StudentDao;
import com.scholly.appl.exp.StudException;

@Service("studService")
public class StudentServiceImpl implements StudentService{

	@Autowired
	StudentDao studDao;
	
	@Override
	public String registerStudent(Student stud, String code) {
		return studDao.registerStudent(stud, code);
	}

//	@Override
//	public String registerStudent(Student stud) {
//		return studDao.registerStudent(stud);
//	}
	
	@Override
	public Student loginStudent(String stud_id, String stud_pwd) {
		return studDao.loginStudent(stud_id, stud_pwd);
	}

	@Override
	public Student showStudentDetails(String stud_id) {
		return studDao.showStudentDetails(stud_id);
	}

	@Override
	public String updatePassword(String stud_id, String old_pwd, String new_pwd) throws StudException {
		return studDao.updatePassword(stud_id, old_pwd, new_pwd);
	}

}
