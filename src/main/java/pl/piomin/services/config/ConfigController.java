package pl.piomin.services.config;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigController {
	
	@GetMapping("/")
	public String confirm() {
		return "Config service started..!";
	}

}
