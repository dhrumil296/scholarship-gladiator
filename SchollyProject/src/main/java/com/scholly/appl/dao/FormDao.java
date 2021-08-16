package com.scholly.appl.dao;

import java.util.List;

import com.scholly.appl.beans.Form;

public interface FormDao {
	public int saveForm(Form form);
	public Form getFormDetails(int formId);
	public boolean validateGender(int formId);
	public boolean validatePercentage(int formId);
	
	public List<Form> waitingForAppFormStud(Long studId);
	public List<Form> approvedFormStud(Long studId);
	public List<Form> declinedFormStud(Long studId);
	
	public List<Form> waitingForAppFormInst(Long instCode);
	public List<Form> approvedFormInst(Long instCode);
	public List<Form> declinedFormInst(Long instCode);
	
	public boolean approveForm(Form form);
	public boolean declineForm(Form form);
}
