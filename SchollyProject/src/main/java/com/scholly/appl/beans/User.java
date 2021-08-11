package com.scholly.appl.beans;

import java.util.Scanner;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.scholly.appl.exp.InstException;
import com.scholly.appl.services.InstituteService;
import com.scholly.appl.services.InstituteServiceImpl;
import com.scholly.appl.services.StudentService;
import com.scholly.appl.services.StudentServiceImpl;

public class User {

	public static void main(String[] args) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-config.xml");

		InstituteService instService = ctx.getBean("instService", InstituteServiceImpl.class);

//		Institute inst = new Institute("10205", "Thadomal","B","Mah","5678","proof","aff_Mum","Mah","Mumcity","blah","Thor","67890","TRUE");

//	System.out.println(instService.registerInstitute(inst));

//		System.out.println(instService.loginInstitute(4003, "5678"));

//		System.out.println(instService.instituteShowDetails(4002));

//		try {
//			System.out.println(instService.updatePassword(4003, "1234", "123"));
//		} catch (InstException e) {
//			e.getStackTrace();
//		}

		
		StudentService studService = ctx.getBean("studService", StudentServiceImpl.class);
//	
//		Student stud = new Student("2","Vijay","07-02-1997","M","497284","ajay@gmail.com","123","Maharashtra","Mumbai Suburban","14","11");
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter code: ");
//		String code = sc.next();
//		System.out.println(studService.registerStudent(stud, code));
		
		Student stud = new Student();
		stud.setStud_id("2");
		stud.setStud_pwd("123");

		System.out.println(studService.loginStudent("2","123"));
	}

}