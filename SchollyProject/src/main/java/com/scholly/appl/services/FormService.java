package com.scholly.appl.services;

import java.util.List;

import com.scholly.appl.beans.Form;

public interface FormService {
	public int saveForm(Form form);
	public List<Form> displayAll();
}
