package jp.co.kaki.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HelloController {
	@RequestMapping(value="/home", method=RequestMethod.GET)
	public String home() {
		return "startSpring.jsp";
	}
	
	@RequestMapping(value="/result", method=RequestMethod.POST)
	public String submit() {
		return "result.jsp";
	}
}
