package com.project.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;


public class AnasayfaController extends AbstractController {
	
	
	protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		
		ModelAndView modelAndView = new ModelAndView("index");
		modelAndView.addObject("mesaj", "Anasayfa");
		return modelAndView;
	}
}
