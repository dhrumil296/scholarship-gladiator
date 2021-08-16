package com.scholly.appl.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.scholly.appl.beans.Form;
import com.scholly.appl.dao.FormDaoImpl;

@Service("formService")
public class FormServiceImpl implements FormService {

	@Autowired
	FormDaoImpl formDao;

	@Override
	public int saveForm(Form form) {
		return formDao.saveForm(form);
	}

	@Override
	public Form getFormDetails(int formId) {
		return formDao.getFormDetails(formId);
	}

	@Override
	public boolean validateGender(int formId) {
		return formDao.validateGender(formId);
	}

	@Override
	public boolean validatePercentage(int formId) {
		return formDao.validatePercentage(formId);
	}

	@Override
	public List<Form> waitingForAppFormStud(Long stud_id) {
		return formDao.waitingForAppFormStud(stud_id);
	}

	@Override
	public List<Form> approvedFormStud(Long studId) {
		return formDao.approvedFormStud(studId);
	}

	@Override
	public List<Form> declinedFormStud(Long studId) {
		return formDao.declinedFormStud(studId);
	}

	@Override
	public List<Form> waitingForAppFormInst(Long instCode) {
		return formDao.waitingForAppFormInst(instCode);
	}

	@Override
	public List<Form> approvedFormInst(Long instCode) {
		return formDao.approvedFormInst(instCode);
	}

	@Override
	public List<Form> declinedFormInst(Long instCode) {
		return formDao.declinedFormInst(instCode);
	}

	@Override
	public boolean approveForm(Form form) {
		return formDao.approveForm(form);
	}

	@Override
	public boolean declineForm(Form form) {
		return formDao.declineForm(form);
	}

}
