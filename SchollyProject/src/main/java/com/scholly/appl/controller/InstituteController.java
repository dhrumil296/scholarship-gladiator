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

import com.scholly.appl.beans.Institute;
import com.scholly.appl.beans.Student;
import com.scholly.appl.services.InstituteServiceImpl;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/institute")
public class InstituteController {

	@Autowired
	private InstituteServiceImpl instService;

	// http://localhost:8090/institute/register-institute
	@PostMapping("/add-institute")
	public void registerInstitute(@RequestBody Institute inst) {
		instService.registerInstitute(inst);
	}
	
	// http://localhost:8090/institute/id}
	@GetMapping("/{id}")
	public Institute getInstituteDets(@PathVariable(value="id") Long instCode) {
		return instService.getInstituteDets(instCode);
	}
	
	// http://localhost:8090/institute/login-institute
		@PostMapping("/login-institute")
		public Boolean loginInstitute(@RequestBody Institute inst) {
			return instService.loginInstitute(inst.getInstCode(), inst.getInstPwd());
		}
		
		@GetMapping("/institutes")
		public List<Institute> displayAllInstitutes() {
			System.out.println(instService.displayAllInstitutes());
			return instService.displayAllInstitutes();
		}
}
