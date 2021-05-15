package com.project.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.project.model.LoginForm;

@Controller
public class HomeController {
	
	@RequestMapping(value = "/welcome", method = RequestMethod.GET)
	public ModelAndView welcome() {
		ModelAndView modelAndView = new ModelAndView("welcome");
		return modelAndView;
	}
	
	@RequestMapping(value = "/loginform", method = RequestMethod.GET)
	public ModelAndView loginForm() {
		ModelAndView modelAndView = new ModelAndView("loginform");
		modelAndView.addObject(new LoginForm());
		return modelAndView;
	}
	
	@RequestMapping(value = "/successform", method = RequestMethod.POST)
	public ModelAndView successForm(@Valid LoginForm loginForm,BindingResult result) {
		ModelAndView modelAndView = new ModelAndView();
		if(result.hasErrors()) {
			modelAndView.setViewName("loginform");
			return modelAndView;
		}
		else {
			modelAndView.setViewName("successform");
			modelAndView.addObject("LoginForm.username", loginForm.getUsername());
			modelAndView.addObject("LoginForm.password", loginForm.getPassword());
			return modelAndView;
		}
	}
	
}
