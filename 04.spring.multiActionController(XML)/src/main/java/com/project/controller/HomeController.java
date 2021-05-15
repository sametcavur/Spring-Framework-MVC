package com.project.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

public class HomeController extends MultiActionController {
	
	public ModelAndView add (HttpServletRequest request, HttpServletResponse response) throws Exception {
		ModelAndView modelAndView = new ModelAndView("home");
		modelAndView.addObject("mesaj", "Add");
		System.out.println("Eklendi");
		return modelAndView;
	}
	public ModelAndView delete (HttpServletRequest request, HttpServletResponse response) throws Exception {
		ModelAndView modelAndView = new ModelAndView("home");
		modelAndView.addObject("mesaj", "Delete");
		System.out.println("Silindi");
		return modelAndView;
	}
	public ModelAndView update (HttpServletRequest request, HttpServletResponse response) throws Exception {
		ModelAndView modelAndView = new ModelAndView("home");
		modelAndView.addObject("mesaj", "Update");
		System.out.println("Güncellendi");
		return modelAndView;
	}
}
