package com.codingdojo.firstproject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;


//...
//@RestController
//@RequestMapping("/greeting")
@Controller
public class HomeController {

	@RequestMapping("/")
	public String home(Model model) {
		model.addAttribute("dojoName", "Burbank");
		return "index.jsp";
	}
	
	@RequestMapping("/createError")
	public String flashMessages(RedirectAttributes redirectAttributes) {
        redirectAttributes.addFlashAttribute("error", "A test errror!");
        return "redirect:/";
	}
	
	
//	@RequestMapping("/")
//	public String index(@RequestParam(value="q", required = false) String searchQuery) {
//		if(searchQuery == null) {
//			return "You searched for: NOTHING";
//		} else {
//			return "You searched for: " + searchQuery;
//		}
//	}
//	
//	@RequestMapping("/m/{track}/{module}/{lesson}")
//	public String index2(@PathVariable("track") String track, @PathVariable("module") String module, @PathVariable("lesson") String lesson) {
//		return "Track: " + track + ", Module: " + module + ", Lesson: " + lesson;
//	}
	
	
	
// @RequestMapping("")
// public String index(){
//   return "This is accessed view http://your_server/simple/root";
// }
// @RequestMapping("/hello")
// public String hello(){
//   return "Hello world! What route did you use to access me?";
// }
// @RequestMapping("/goodbye")
// public String world(){
//   return "Goodbye world!";
// }
}



// here's another way to do so but it is TEDIOUS!
//...
//@RestController
//public class HomeController {
// @RequestMapping("/greeting")
// public String greeting(){
//   return "Hello user!";
// }
//    // you can be explicit about the request as well
// @RequestMapping(value="/greeting/hello", method=RequestMethod.GET)
// public String hello(){
//   return "Hello world! What route did you use to access me?";
// }
// @RequestMapping("/greeting/goodbye")
// public String world(){
//   return "Goodbye world!";
// }
//}
