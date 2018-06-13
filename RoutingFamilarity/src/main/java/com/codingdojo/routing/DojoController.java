package com.codingdojo.routing;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DojoController {
	
	@RequestMapping("/{entity}")
	public String rootCall(@PathVariable("entity") String entity) {
		return "The " + entity + " is awesome!";
	}
	
	@RequestMapping("/{location}-dojo/")
	public String burbank(@PathVariable("location") String location) {
		if(location == "san") {
			return "This is the headquarters";
		} else {
			return location + " dojo is being located differently now!";
		}
	}
	
	@RequestMapping("/{location}-jose/")
	public String sanJose(@PathVariable("location") String location) {
		System.out.println("In the right mapping");
		System.out.println(location);
		return "This will be another TYPE OF HEADquarters";
	}
}
