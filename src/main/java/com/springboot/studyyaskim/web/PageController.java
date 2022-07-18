package com.springboot.studyyaskim.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@Controller
public class PageController {
	
	@GetMapping({"/", "/index"})
	public String indexPage() {
		return "index";
		
	}

}
