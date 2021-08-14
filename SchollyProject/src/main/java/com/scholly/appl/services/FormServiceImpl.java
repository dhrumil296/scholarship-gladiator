package com.scholly.appl.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.scholly.appl.beans.Form;
import com.scholly.appl.dao.FormDaoImpl;

@Service("formService")
public class FormServiceImpl implements FormService{

	@Autowired
	FormDaoImpl formDao;
	
	@Override
	public int saveForm(Form form) {
		return formDao.saveForm(form);
	}

	@Override
	public List<Form> displayAll() {
		return formDao.displayAll();
	}

}
