package com.poject.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
@RequestMapping(value = "/home", method = RequestMethod.GET)
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public String homeAdd(Model model) {
	model.addAttribute("mesaj", "Eklendi");
		return "home";
	}
	@RequestMapping(value = "/delete", method = RequestMethod.GET)
	public String homeDelete(Model model) {
		model.addAttribute("mesaj", "Silindi");
		return "home";
	}
	@RequestMapping(value = "/update", method = RequestMethod.GET)
	public String homeUpdate(Model model) {
		model.addAttribute("mesaj", "Guncellendi");
		return "home";
	}
	
}
