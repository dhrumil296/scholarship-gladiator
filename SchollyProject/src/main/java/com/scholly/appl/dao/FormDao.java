package com.scholly.appl.dao;

import java.util.List;

import com.scholly.appl.beans.Form;

public interface FormDao {
	public int saveForm(Form form);
	public List<Form> displayAll();
}
