package com.example.mavenSpringBoot.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/maven")
public class MavenRestController {

	@GetMapping("/")
	public String urlHome() {
		return "up";
	}
}
