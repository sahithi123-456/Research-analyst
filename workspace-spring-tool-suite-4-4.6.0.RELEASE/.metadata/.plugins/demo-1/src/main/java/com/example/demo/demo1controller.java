package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class demo1controller {

	
	@RequestMapping("/hllo")	
	public String sayHi() {
		return "wlcme";
	}
}
