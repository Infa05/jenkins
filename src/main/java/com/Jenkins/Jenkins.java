package com.Jenkins;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Jenkins {
	
	@GetMapping(value="get")
	public String getThis() {
		return "welcome";
	}

}
