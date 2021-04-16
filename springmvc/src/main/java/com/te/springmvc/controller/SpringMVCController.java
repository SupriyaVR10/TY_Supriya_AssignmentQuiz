package com.te.springmvc.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.te.springmvc.controller.bean.UserDetails;

@Controller
public class SpringMVCController {

	@RequestMapping(path = "/home", method = RequestMethod.GET)
	public ModelAndView getHomePage() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("/WEB-INF/views/homepage.jsp");
		return modelAndView;
	}

	@RequestMapping(path = "/search", method = RequestMethod.GET)
	public ModelAndView getData(ModelAndView modelAndView, HttpServletRequest request) {
		String name = request.getParameter("name");
		modelAndView.addObject("username", name);
		modelAndView.setViewName("page");
		// modelAndView.setViewName("/WEB-INF/views/page.jsp");
		return modelAndView;
	}

	@GetMapping("/login")
	public String getForm() {
		return "loginForm";
	}
	@PostMapping("/login")
	public String getFormData(HttpServletRequest request,ModelMap modelMap) {
		String name=request.getParameter("user");
		int password=Integer.parseInt(request.getParameter("password"));
		
		modelMap.addAttribute("name",name);
		modelMap.addAttribute("password",password);
		
		return "userDetails";
	}
	@PostMapping("/login1")
	public String name(ModelMap modelMap, int password, String user) {
		modelMap.addAttribute("name",user);
		modelMap.addAttribute("password",password);
		return "userDetails";
	}
	@PostMapping("/login2")
	public String getDataBean(UserDetails userbean,ModelMap modelMap) {
		modelMap.addAttribute("name",userbean.getUser());
		modelMap.addAttribute("password",userbean.getPassword());
		return "userDetails";
	}
	@PostMapping("/login3")
	public String getDataForm(ModelMap modelMap, 
			@RequestParam(name="") String user,
			@RequestParam(name="password") int password) {
		modelMap.addAttribute("name",user);
		modelMap.addAttribute("password",password);
		return "userDetails";
	}
}
