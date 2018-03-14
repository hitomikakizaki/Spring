package jp.co.kaki.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	@RequestMapping("/home")
	@ResponseBody
	public String home() {
		return "Hello Spring Boot!";
	}
}
