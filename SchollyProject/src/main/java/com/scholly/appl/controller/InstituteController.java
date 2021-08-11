package com.scholly.appl.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.scholly.appl.beans.Institute;
import com.scholly.appl.services.InstituteServiceImpl;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/scholarship/institute")
public class InstituteController {

	@Autowired
	private InstituteServiceImpl instService;

	// http://localhost:8090//scholarship/institute/register-institute
	@PostMapping("/register-institute")
	public void registerInstitute(@RequestBody Institute inst) {
		instService.registerInstitute(inst);
	}
	
	@GetMapping("/show-inst-dets")
	public Institute instituteShowDetails(@RequestBody String inst_code) {
		return instService.instituteShowDetails(inst_code);
	}
}
