package pack1.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
   
	@GetMapping("/welcome")
	public String getMag()
	{
		return "Welcome Jyoti";
	}
}
