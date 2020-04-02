package com.algaworks.algamoney.api;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;





@Controller
public class TEste {

//	@RequestMapping("/teste")
//	public ModelAndView casa() {
//		ModelAndView mv= new ModelAndView("Teste");
//		return mv;
//	}
	@RequestMapping("/")
	public String login() { 

		return "Teste";			
	}
}
