package com.scholly.appl.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.scholly.appl.beans.Form;

@Repository("formDao")
public class FormDaoImpl implements FormDao {

	@PersistenceContext
	private EntityManager em;
	
	@Override
	@Transactional
	public int saveForm(Form form) {
		em.persist(form);
		return 1;
	}

	@Override
	@Transactional
	public List<Form> displayAll() {
		String sql = "SELECT f from Form f";
		System.out.println("Dao layer -->");
		Query query = em.createQuery(sql);
		
		List<Form> detailsList = query.getResultList();
		return detailsList;
	}

}
