package com.demo.pipeline;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@ComponentScan(value = "com.demo.pipeline")
@RestController
public class PipelineApplication {


	@GetMapping("/")
	public String defaultMethod() {
		return "HOME PAGE AFTER BUILD SUCCESS COMMIT FOR AUTO BUILD";
	}

	public static void main(String[] args) {

		SpringApplication.run(PipelineApplication.class, args);
	}

}
