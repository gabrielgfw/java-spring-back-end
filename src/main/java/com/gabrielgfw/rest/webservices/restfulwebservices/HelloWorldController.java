package com.gabrielgfw.rest.webservices.restfulwebservices;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

// CrossOrigin para definir acesso de outro servidor. //
// Neste caso, do nosso front-end Angular. //
@CrossOrigin(origins="http://localhost:4200")
//RestController para definir uma classe Controller. //
@RestController
public class HelloWorldController {
	
	// Definindo a Rota do tipo GET, assim como seu respectivo path. // 
	// @RequestMapping(method = RequestMethod.GET, path = "/hello-world"). //
	@GetMapping(path = "/hello-world")
	public String helloWorld() {
		return "Hello World!";
	}
	
	@GetMapping(path = "/hello-world-bean")
	public HelloWorldBean helloWorldBean() {
		return new HelloWorldBean("Hello World!");
	}
	
	// Adicionando um Path Variable, que resgatarÃ¡ do path inserido o name.
	// Este name serÃ¡ utilizado no retorno, substituindo '%s' pelo name enviado.
	@GetMapping(path = "/hello-world/path-variable/{name}")
	public HelloWorldBean helloWorldPathVariable(@PathVariable String name) {
		return new HelloWorldBean(String.format("Hello World, %s", name));
	}
	
}
