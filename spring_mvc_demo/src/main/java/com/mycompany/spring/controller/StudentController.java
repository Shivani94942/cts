package com.mycompany.spring.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {

	@RequestMapping("/showForm")
	public String showForm() {
		return "show-form";
	}
	
	@RequestMapping("/processForm")
	public String processForm(HttpServletRequest request,Model model){
		
		String sname=request.getParameter("sName");
		model.addAttribute("message", sname);
		return "process-form";
	}
	
}
