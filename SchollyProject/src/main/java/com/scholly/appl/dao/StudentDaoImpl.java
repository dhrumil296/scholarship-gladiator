package com.scholly.appl.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.scholly.appl.beans.Form;
import com.scholly.appl.beans.Student;
import com.scholly.appl.exp.StudException;
import com.scholly.appl.services.InstituteService;

@Repository("studDao")
public class StudentDaoImpl implements StudentDao {

	@PersistenceContext
	private EntityManager em;

	@Autowired
	InstituteService instService;
	
	@Override
	@Transactional
	public Boolean registerStudent(Student stud) {
		em.persist(stud);
		return true;
	}

	@Override
	@Transactional
	public Boolean loginStudent(Long stud_id, String stud_pwd) {
		System.out.println(stud_id + " " + stud_pwd);
		String sql = "From Student where stud_id= :stud_id and stud_pwd= :stud_pwd";
		TypedQuery<Student> tq = em.createQuery(sql, Student.class);
		tq.setParameter("stud_id", stud_id);
		tq.setParameter("stud_pwd", stud_pwd);
		Student stud = tq.getSingleResult();
		if(stud==null)
			return false;
		return true;
	}

	@Override
	@Transactional
	public Student getStudentDets(Long stud_id) {
		String sql = "From Student where stud_id= :stud_id";
		TypedQuery<Student> tq = em.createQuery(sql, Student.class);
		tq.setParameter("stud_id", stud_id);
		Student stud = tq.getSingleResult();
		return stud;
	}

	@Override
	@Transactional
	public String updatePassword(Long stud_id, String old_pwd, String new_pwd) throws StudException {

		Student stud = em.find(Student.class, stud_id);
		if (!old_pwd.equals(stud.getStud_id()))
			return "Password mismatch";
		else {
			String sql = "update Student set stud_pwd= :new_pwd where stud_id = :stud_id";
			Query qry = em.createQuery(sql);
			qry.setParameter("stud_id", stud_id);
			qry.setParameter("new_pwd", new_pwd);
			int status = qry.executeUpdate();
			System.out.println(status);
		}
		return "Password Updated";
	}
	
	@Override
	@Transactional
	public List<Student> getAllStudents(){
		String sql = "From Student";
		TypedQuery<Student> tq = em.createQuery(sql, Student.class);
		List<Student> studList = tq.getResultList();
		return studList;
	}

	@Override
	@Transactional
	public List<Form> getAppliedForms() {
		// TODO Auto-generated method stub
		return null;
	}

}
