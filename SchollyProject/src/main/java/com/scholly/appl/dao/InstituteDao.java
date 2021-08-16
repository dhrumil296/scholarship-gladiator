package com.scholly.appl.dao;

import java.util.List;

import com.scholly.appl.beans.Institute;
import com.scholly.appl.exp.InstException;

public interface InstituteDao {
	public String registerInstitute(Institute inst);
	public Boolean loginInstitute(Long instCode, String pwd);
	public Institute getInstituteDets(Long instCode);  
	public String updatePassword(Long instCode, String oldPwd, String newPwd) throws InstException;
	public String updatePrincipalName(Long instCode, String newPrinciName);
	public String updatePhoneNo(Long instCode, String newPhoneNo);
	public List<Institute> displayAllInstitutes();
}
