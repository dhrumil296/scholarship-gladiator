package com.scholly.appl.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.scholly.appl.beans.Form;
import com.scholly.appl.beans.Scheme;
import com.scholly.appl.beans.Student;

@Repository("formDao")
public class FormDaoImpl implements FormDao {

	private final String waiting = "Waiting for approval";
	private final String approved = "Approved";
	private final String declined = "Declined";

	@PersistenceContext
	private EntityManager em;

	@Override
	@Transactional
	public int saveForm(Form form) {
		em.persist(form);
		return 1;
	}

	@Override
	public Form getFormDetails(int formId) {
		String sql = "From Form where formId= :formId";
		TypedQuery<Form> tq = em.createQuery(sql, Form.class);
		tq.setParameter("formId", formId);
		Form form = tq.getSingleResult();
		return form;
	}

	@Override
	public boolean validateGender(int formId) {
		
		Form form = em.find(Form.class, formId);
		
		String sql = "SELECT sc from Form f,Scheme sc where f.formId = " + form.getFormId()
				+ " and f.schemeId = sc.schemeId";
		TypedQuery<Scheme> tq = em.createQuery(sql, Scheme.class);
		Scheme genderFromScheme = tq.getSingleResult();

		if (genderFromScheme.getApplicableGender().equalsIgnoreCase("U"))
			return true;

		sql = "SELECT s from Form f,Student s where f.formId =" + form.getFormId()
				+ " and f.aadharNo = s.studId";
		TypedQuery<Student> tq1 = em.createQuery(sql, Student.class);
		Student genderFromStud = tq1.getSingleResult();

		if (genderFromScheme.getApplicableGender().equalsIgnoreCase(genderFromStud.getGender()))
			return true;
		return false;
	}

	@Override
	@Transactional
	public boolean validatePercentage(int formId) {
		
		Form form = em.find(Form.class, formId);
		
		String sql = "SELECT sc from Form f,Scheme sc where f.formId = "
				+ form.getFormId() + " and f.schemeId = sc.schemeId";
		TypedQuery<Scheme> tq = em.createQuery(sql, Scheme.class);
		Scheme percInScheme = tq.getSingleResult();

		if (form.getSscPercentage() >= percInScheme.getSscPercentage()
				&& form.getHscPercentage() >= percInScheme.getHscPercentage())
			return true;
		return false;
	}

	@Override
	public List<Form> waitingForAppFormStud(Long studId) {
		String sql = "SELECT f from Form f where f.aadharNo=" + studId+ " and f.formStatus=:waiting";
		TypedQuery<Form> tq = em.createQuery(sql, Form.class);
		tq.setParameter("waiting", waiting);
		List<Form> formList = tq.getResultList();
		return formList;
	}

	@Override
	public List<Form> approvedFormStud(Long studId) {
		String sql = "SELECT f from Form f, Student s, Institute i where f.aadharNo=s.studId and f.aadharNo=" + studId
				+ " and f.formStatus= :approved";
		TypedQuery<Form> tq = em.createQuery(sql, Form.class);
		tq.setParameter("approved", approved);
		List<Form> formList = tq.getResultList();
		return formList;
	}

	@Override
	public List<Form> declinedFormStud(Long studId) {
		String sql = "SELECT f from Form f, Student s, Institute i where f.aadharNo=s.studId and f.aadharNo=" + studId
				+ " and f.formStatus= :declined";
		TypedQuery<Form> tq = em.createQuery(sql, Form.class);
		tq.setParameter("declined", declined);
		List<Form> formList = tq.getResultList();
		return formList;
	}

	@Override
	public List<Form> waitingForAppFormInst(Long instCode) {
		String sql = "SELECT f from Form f, Student s, Institute i where f.aadharNo=s.studId and s.instCode=i.instCode and i.instCode="
				+ instCode + " and f.formStatus= :waiting";
		TypedQuery<Form> tq = em.createQuery(sql, Form.class);
		tq.setParameter("waiting", waiting);
		List<Form> formList = tq.getResultList();
		return formList;
	}

	@Override
	public List<Form> approvedFormInst(Long instCode) {
		String sql = "SELECT f from Form f, Student s, Institute i where f.aadharNo=s.studId and s.instCode=i.instCode and i.instCode="
				+ instCode + " and f.formStatus= :approved";
		TypedQuery<Form> tq = em.createQuery(sql, Form.class);
		tq.setParameter("approved", approved);
		List<Form> formList = tq.getResultList();
		return formList;
	}

	@Override
	public List<Form> declinedFormInst(Long instCode) {
		String sql = "SELECT f from Form f, Student s, Institute i where f.aadharNo=s.studId and s.instCode=i.instCode and i.instCode="
				+ instCode + " and f.formStatus= :declined";
		TypedQuery<Form> tq = em.createQuery(sql, Form.class);
		tq.setParameter("declined", declined);
		List<Form> formList = tq.getResultList();
		return formList;
	}

	@Override
	@Transactional
	public boolean approveForm(Form form) {
		form.setFormStatus(approved);
		em.merge(form);
		return true;
	}

	@Override
	@Transactional
	public boolean declineForm(Form form) {
		form.setFormStatus(declined);
		em.merge(form);
		return true;
	}

}
