/**
 * 
 */
package org.springframework.samples.quickstarter.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.samples.quickstarter.services.UserService;

/**
 * @author AM283065
 *
 */
@Controller
public class UserController {
	@Autowired
	UserService userService;
	
	
	@RequestMapping("/")
	public String loadHomePage(Model m) {
		m.addAttribute("user", userService.getUserDetails());
		return "home";
	}
	
	
	
}
