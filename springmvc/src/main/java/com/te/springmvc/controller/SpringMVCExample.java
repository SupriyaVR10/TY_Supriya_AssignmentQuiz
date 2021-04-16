package com.te.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SpringMVCExample {

	@RequestMapping(path = "/form" , method = RequestMethod.GET)
	public ModelAndView getMVCPage() {
		ModelAndView modelAndView=new ModelAndView();
		modelAndView.setViewName("WEB-INF/views/Welcome.jsp");
		return modelAndView;
	}
}
