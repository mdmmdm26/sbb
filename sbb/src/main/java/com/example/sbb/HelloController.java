package com.example.sbb;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller //컨트롤러의 기능 수행
public class HelloController {
	
	@GetMapping("/hello") // URL과 hello 메서드를 매핑하는 역할 (GET방식)
	@ResponseBody
	public String hello() {
		return "Hello Spring Boot Board";
	}

}
