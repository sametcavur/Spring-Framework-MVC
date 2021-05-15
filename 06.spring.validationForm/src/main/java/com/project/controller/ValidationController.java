package com.project.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.project.model.User;

@Controller
public class ValidationController {
	@RequestMapping(value = "/validationForm", method = RequestMethod.GET)
	public ModelAndView validationForm() {
		ModelAndView modelAndView = new ModelAndView("validationForm");
		modelAndView.addObject(new User());
		return modelAndView;
	}
	
	@RequestMapping(value = "/successForm", method = RequestMethod.POST)
	public ModelAndView successForm(@Valid User user,BindingResult result) {
		ModelAndView modelAndView = new ModelAndView();
		if(result.hasErrors()) {
			modelAndView.setViewName("validationForm");
			return modelAndView;
		}
		else {
			modelAndView.setViewName("successForm");
			return modelAndView;
		}
	}
}
