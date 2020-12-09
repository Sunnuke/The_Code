package com.practice.code.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class CodeController {
	
	@RequestMapping("/")
	public String input() {
		return "codecheck.jsp";
	}
	
	@RequestMapping(value="/check", method=RequestMethod.POST)
	public String check(@RequestParam String code, HttpSession session, RedirectAttributes redirect) {
		if (code != "Breezzy") {
			redirect.addAttribute("error", "Incorrect! Try Again!!!");
			return "redirect:/";
		}
		session.setAttribute("check", code);
		return "redirect:/code";
	}
	
	@RequestMapping("/code")
	public String success(HttpSession session) {
		if (session.getAttribute("check") != "Breezzy") {
			return "redirect:/check";
		}
		return "success.jsp";
	}
}
