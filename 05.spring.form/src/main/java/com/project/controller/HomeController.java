package com.project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.project.model.User;

@Controller
public class HomeController {
	
	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public ModelAndView form() {
		ModelAndView modelAndView = new ModelAndView("home");
		modelAndView.addObject(new User());
		return modelAndView;
	}
	
	@RequestMapping(value = "/sonuc", method = RequestMethod.POST)
	public ModelAndView sonuc(@ModelAttribute User user) {
		ModelAndView modelAndView = new ModelAndView("sonuc");
		modelAndView.addObject("user.username", user.getUsername());
		modelAndView.addObject("user.email", user.getEmail());
		return modelAndView;
	}
}
