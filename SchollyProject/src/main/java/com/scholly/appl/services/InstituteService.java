package com.scholly.appl.services;

import java.util.List;

import com.scholly.appl.beans.Institute;
import com.scholly.appl.exp.InstException;

public interface InstituteService {

	public String registerInstitute(Institute inst);
	public Boolean loginInstitute(Long inst_code, String pwd);
	public Institute getInstituteDets(Long inst_code);  
	public String updatePassword(Long inst_code, String old_pwd, String new_pwd) throws InstException;
	public String updatePrincipalName(Long inst_code, String new_princi_name);
	public String updatePhoneNo(Long inst_code, String new_phone_no);
	public List<Institute> displayAllInstitutes();
}