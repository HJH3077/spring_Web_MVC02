package com.ict.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController {
	// 모든 컨트롤러 모아두기

	@RequestMapping(value = "hello.do", method = RequestMethod.GET)
	public ModelAndView HelloCommand() {
		ModelAndView mv = new ModelAndView("result");
		mv.addObject("msg", "GET 방식");

		return mv;
	}

	@RequestMapping(value = "hello.do", method = RequestMethod.POST)
	public ModelAndView Hello2Command() {
		ModelAndView mv = new ModelAndView("result");
		mv.addObject("msg", "POST 방식");

		return mv;
	}

	@RequestMapping(value = "hi.do", method = RequestMethod.GET)
	public ModelAndView HiController() {
		ModelAndView mv = new ModelAndView("result");
		mv.addObject("msg", "Welcom Spring MVC");
		return mv;
	}

}
