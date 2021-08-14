package com.scholly.appl.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.scholly.appl.beans.Form;
import com.scholly.appl.services.FormServiceImpl;

@RestController
@RequestMapping("/form")
@CrossOrigin(origins="*")
public class FormController {
	
	@Autowired
	private FormServiceImpl formService;
	
	@PostMapping("/add-form")
	public int saveForm(@RequestBody Form form) {
		 return formService.saveForm(form);
	}
	
	@GetMapping("/get-details")
	public List<Form> displayAll(){
		System.out.println("inside controller");
		List<Form> detailsList = formService.displayAll();
		return detailsList;
	}

}