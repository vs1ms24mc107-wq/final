package com.example.demovv;

	import org.springframework.web.bind.annotation.GetMapping;
	import org.springframework.web.bind.annotation.RestController;

	@RestController
	public class HomeController {

    		@GetMapping("/")
    		public String home() {
        		return "Hello from Spring Boot Maven App!";
    		}
	}
