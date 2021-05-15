package com.project.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "/home")
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/*	RequestMapping anotasyonunun içine url adresini verdik ve jstl olarak {times} yazdýk
	 *  hemen altýna home metodunun parametresine -@PathVariable("times") String time- yazdýk.Bu þu demek
	 *  url adresinde 50 yazarsa bunu String türündeki time deðiþkeni ile eþle.Yani url'ye yazýlan sayýnýn deðerini alacak.
	 
	@RequestMapping(value = "/home/helloworld/{times}", method = RequestMethod.GET)
	public String home(Model model,@PathVariable("times") String time) {
		model.addAttribute("sayhello", time+" kere Hello World.!");
		return "home";
	}
	@RequestMapping(value = "/home/merhabadunya/{times}", method = RequestMethod.GET)
	public String homes(Model model,@PathVariable("times") String time) {
		model.addAttribute("sayhello", time+" kere Merhaba Dünya.!");
		return "home";
	}
	*/
		
	//------birden fazla parametreli iþlemler-----------
	@RequestMapping(value = "/{user}/{times}", method = RequestMethod.GET)
	public String homess(Model model,@PathVariable("times") String time,@PathVariable("user") String user) {
		model.addAttribute("sayhello", time+" kere hosgeldiniz " +user);
		return "home";
	}
	
	 
}
