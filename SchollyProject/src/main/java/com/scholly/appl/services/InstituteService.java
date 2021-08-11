package com.scholly.appl.services;

import com.scholly.appl.beans.Institute;
import com.scholly.appl.exp.InstException;

public interface InstituteService {

	public String registerInstitute(Institute inst);
	public Institute loginInstitute(String inst_code, String pwd);
	public Institute instituteShowDetails(String inst_code);  
	public String updatePassword(String inst_code, String old_pwd, String new_pwd) throws InstException;
	public String updatePrincipalName(String inst_code, String new_princi_name);
	public String updatePhoneNo(String inst_code, String new_phone_no);
}