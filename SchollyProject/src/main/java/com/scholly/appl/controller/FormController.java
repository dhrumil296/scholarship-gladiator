package com.scholly.appl.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.scholly.appl.beans.Form;
import com.scholly.appl.services.FormServiceImpl;

@RestController
@RequestMapping("/form")
@CrossOrigin(origins = "*")
public class FormController {

	@Autowired
	private FormServiceImpl formService;

	@PostMapping("/add-form")
	public int saveForm(@RequestBody Form form) {
		return formService.saveForm(form);
	}

	@GetMapping("/student/{id}")
	public List<Form> displayStudRelatedForms(@PathVariable(value = "id") Long studId) {
		List<Form> detailsList = formService.waitingForAppFormStud(studId);
		return detailsList;
	}

	@GetMapping("/student-forms/{id}")
	public List<Form> displayInstRelatedForms(@PathVariable(value = "id") Long instCode) {
		List<Form> detailsList = formService.waitingForAppFormInst(instCode);
		return detailsList;
	}

	@GetMapping("/get-form-details/{id}")
	public Form formDetails(@PathVariable(value = "id") int formId) {
		System.out.println(formService.getFormDetails(formId));
		return formService.getFormDetails(formId);
	}
	
	@GetMapping("/validate-gender/{id}")
	public boolean validateGender(@PathVariable(value = "id") int formId) {
		System.out.println(formService.validateGender(formId));
		return formService.validateGender(formId);
	}
	
	@GetMapping("/validate-percentage/{id}")
	public boolean validatePercentage(@PathVariable(value = "id") int formId) {
		System.out.println(formService.validatePercentage(formId));
		return formService.validatePercentage(formId);
	}
	
	@PostMapping("/approve-form")
	public boolean approveForm(@RequestBody Form form) {
		System.out.println(formService.approveForm(form));
		return formService.approveForm(form);
	}
	
	@PostMapping("/decline-form")
	public boolean declineForm(@RequestBody Form form) {
		System.out.println(formService.declineForm(form));
		return formService.declineForm(form);
	}

}