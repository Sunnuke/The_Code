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
	public String check(@RequestParam(value="code") String code, RedirectAttributes redirect) {
		System.out.println(code);
		if (!"Breezzy".equals(code)) {
			redirect.addFlashAttribute("error", "Incorrect! Try Again!!!");
			return "redirect:/";
		}
		return "redirect:/code";
	}
	
	@RequestMapping("/code")
	public String success(HttpSession session) {
		return "success.jsp";
	}
}
