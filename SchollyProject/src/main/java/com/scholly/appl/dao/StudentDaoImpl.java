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
	public Boolean loginStudent(Long studId, String studPwd) {
		System.out.println(studId + " " + studPwd);
		String sql = "From Student where studId= :studId and studPwd= :studPwd";
		TypedQuery<Student> tq = em.createQuery(sql, Student.class);
		tq.setParameter("studId", studId);
		tq.setParameter("studPwd", studPwd);
		Student stud = tq.getSingleResult();
		if (stud == null)
			return false;
		return true;
	}

	@Override
	@Transactional
	public Student getStudentDets(Long studId) {
		String sql = "From Student where studId= :studId";
		TypedQuery<Student> tq = em.createQuery(sql, Student.class);
		tq.setParameter("studId", studId);
		Student stud = tq.getSingleResult();
		return stud;
	}

	@Override
	@Transactional
	public String updatePassword(Long studId, String oldPwd, String newPwd) throws StudException {

		Student stud = em.find(Student.class, studId);
		if (!oldPwd.equals(stud.getStudId()))
			return "Password mismatch";
		else {
			String sql = "update Student set studPwd= :newPwd where studId = :studId";
			Query qry = em.createQuery(sql);
			qry.setParameter("studId", studId);
			qry.setParameter("newPwd", newPwd);
			int status = qry.executeUpdate();
			System.out.println(status);
		}
		return "Password Updated";
	}

	@Override
	@Transactional
	public List<Student> getAllStudents() {
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
