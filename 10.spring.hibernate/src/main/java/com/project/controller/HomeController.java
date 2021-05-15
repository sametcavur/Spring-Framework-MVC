package com.project.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.project.model.Customer;
import com.project.services.CustomerServices;
import com.project.servicesImp.CustomerServicesImp;

@Controller
public class HomeController {
	
	private CustomerServices customerServices = new CustomerServicesImp();
	
	@RequestMapping(value = "/customerForm", method = RequestMethod.GET)
	public ModelAndView customerForm(@ModelAttribute Customer customer) {
		ModelAndView modelAndView = new ModelAndView("customerForm");
		return modelAndView;
	}
	@RequestMapping(value = "/customerInfoList", method = RequestMethod.GET)
	public ModelAndView findAllCustomer(@ModelAttribute Customer customer) {
		ModelAndView modelAndView = new ModelAndView("customerInfoList");
		List<Customer> customers = customerServices.findAllCustomer();
		modelAndView.addObject("customer", customers);
		return modelAndView;
	}
	@RequestMapping(value = "/saveCustomer", method = RequestMethod.POST)
	public ModelAndView saveCustomer(@ModelAttribute Customer customer) {
		customerServices.createCustomer(customer);
		ModelAndView modelAndView = new ModelAndView("redirect:customerInfoList");
		return modelAndView;
	}
	@RequestMapping(value = "/customerDeleteForm", method = RequestMethod.GET)
	public ModelAndView customerDeleteForm() {
		ModelAndView modelAndView = new ModelAndView("customerDelete");
		return modelAndView;
	}
	@RequestMapping(value = "/deleteCustomer", method = RequestMethod.POST)
	public ModelAndView deleteCustomer(@RequestParam long customerId) {
		ModelAndView modelAndView = new ModelAndView("redirect:customerInfoList");
		customerServices.removeCustomer(customerId);
		return modelAndView;
	}
}