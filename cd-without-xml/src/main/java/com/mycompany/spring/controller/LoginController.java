package com.mycompany.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
/*import org.springframework.web.bind.annotation.RequestMethod;*/

import com.mycompany.spring.model.User;

@Controller
@RequestMapping("/user")
public class LoginController {
	
	@RequestMapping("/")
	public String home(Model model)
	{
		model.addAttribute("user",new User());
		return "home";
	}
	

	@RequestMapping("/processLogin")
	public String processLogin(@ModelAttribute("user") User user)
	{
		if ((user.getEmail().equals("admin@email.com"))
				&& (user.getPassword().equals("admin"))/* &&(user.getName().equals("john")) */) {
			return "success";
		}
		else
		{
			return "error";
		}

}
}
