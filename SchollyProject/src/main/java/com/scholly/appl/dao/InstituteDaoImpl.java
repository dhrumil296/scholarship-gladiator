package com.scholly.appl.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.scholly.appl.beans.Institute;
import com.scholly.appl.exp.InstException;

@Repository("instDao")
public class InstituteDaoImpl implements InstituteDao {

	@PersistenceContext
	private EntityManager em;

	@Override
	@Transactional
	public String registerInstitute(Institute inst) {
		em.persist(inst);
		return "Successfully added";
	}

	@Override
	public Boolean loginInstitute(Long instCode, String pwd) {

		String sql = "From Institute where instCode= :instCode and instPwd= :pwd";
		TypedQuery<Institute> tq = em.createQuery(sql, Institute.class);
		tq.setParameter("instCode", instCode);
		tq.setParameter("pwd", pwd);
		Institute inst = tq.getSingleResult();
		if (inst == null)
			return false;
		return true;
	}

	@Override
	@Transactional
	public Institute getInstituteDets(Long instCode) {
		Institute inst = em.find(Institute.class, instCode);
		return inst;
	}

	@Override
	@Transactional
	public String updatePassword(Long instCode, String oldPwd, String newPwd) throws InstException {

		Institute inst = em.find(Institute.class, instCode);

		if (!oldPwd.equals(inst.getInstPwd()))
			return "Password mismatch";
		else {
			String sql = "update Institute set instPwd= :newPwd where instCode = :instCode";
			Query qry = em.createQuery(sql);
			qry.setParameter("instCode", instCode);
			qry.setParameter("newPwd", newPwd);
			int status = qry.executeUpdate();
			System.out.println(status);
		}
		return "Password Updated";
	}

	@Override
	public String updatePrincipalName(Long instCode, String newPrinciName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String updatePhoneNo(Long instCode, String newPhoneNo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Institute> displayAllInstitutes() {
		String sql = "From Institute";
		TypedQuery<Institute> qry = em.createQuery(sql, Institute.class);
		List<Institute> instList = qry.getResultList();
		return instList;
	}

}
