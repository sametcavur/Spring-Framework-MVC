package com.project.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@RequestMapping(value = "/hosgeldiniz", method = RequestMethod.GET)
	public String home(Model model) {
		model.addAttribute("mesaj", "Merhaba"); //home.jsp'nin i�indeki ${mesaj} jstl coduna de�er atad�k.
		return "home";
	}
	
	/* ---------BUDA ALTERNAT�F�----------- 
	@RequestMapping(value = "/hosgeldiniz", method = RequestMethod.GET)
	public ModelAndView home() {
		ModelAndView modelAndView = new ModelAndView("home");
		modelAndView.addObject("mesaj", "Merhaba"); //home.jsp'nin i�indeki ${mesaj} jstl coduna de�er atad�k.
		return modelAndView;
	} 
	*/
	
}
