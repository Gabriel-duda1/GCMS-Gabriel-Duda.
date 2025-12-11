package com.example.WebApp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

	@RequestMapping("/")
	public @ResponseBody String greeting() {

		return "Pratica 3, Biel!";
	}

	@RequestMapping("/Biel")
	public @ResponseBody String greetingBiel() {
		return "Hello, Biel!";
	}

	@Test
	public void testEndpointTeste() {
		String expected = "Endpoint de teste!";
		assertEquals(expected, controller.teste());
	}

}
