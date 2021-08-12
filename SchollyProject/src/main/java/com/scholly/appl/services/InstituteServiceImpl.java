package com.scholly.appl.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.scholly.appl.beans.Institute;
import com.scholly.appl.dao.InstituteDaoImpl;
import com.scholly.appl.exp.InstException;

@Service("instService")
public class InstituteServiceImpl implements InstituteService{

	@Autowired
	InstituteDaoImpl instDao; 
	
	@Override
	public String registerInstitute(Institute inst) {
		return instDao.registerInstitute(inst);
	}

	@Override
	public Boolean loginInstitute(Long inst_code, String pwd) {
		return instDao.loginInstitute(inst_code, pwd);
	}

	@Override
	public Institute getInstituteDets(Long inst_code) {
		return instDao.getInstituteDets(inst_code);
	}

	@Override
	public String updatePassword(Long inst_code, String old_pwd, String new_pwd) throws InstException {
		return instDao.updatePassword(inst_code, old_pwd, new_pwd);
	}

	@Override
	public String updatePrincipalName(Long inst_code, String new_princi_name) {
		return instDao.updatePrincipalName(inst_code, new_princi_name);
	}

	@Override
	public String updatePhoneNo(Long inst_code, String new_phone_no) {
		return instDao.updatePhoneNo(inst_code, new_phone_no);
	}

	@Override
	public List<Institute> displayAllInstitutes() {
		return instDao.displayAllInstitutes();
	}
	
}
