package com.project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.project.model.User;

@Controller
public class HomeController {

	@RequestMapping(value = "/personellogin", method = RequestMethod.GET)
	public ModelAndView login(@ModelAttribute User user) {
		ModelAndView modelAndView = new ModelAndView("personelLogin");
		modelAndView.addObject(user);
		return modelAndView;
	}
	@RequestMapping(value = "/personelresult", method = RequestMethod.POST)
	public ModelAndView result(
			@RequestParam String name,
			@RequestParam String surname,
			@RequestParam String password) {
		ModelAndView modelAndView = new ModelAndView("personelResult");
		modelAndView.addObject("name",name );
		modelAndView.addObject("surname", surname);
		modelAndView.addObject("password", password);
		return modelAndView;
	}
	
}
