package cl.tswoo.adoptatubadbunny.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import cl.tswoo.adoptatubadbunny.model.Conejo;
import cl.tswoo.adoptatubadbunny.service.ConejoServiceImplementation;

@Controller
public class ConejoController {
	
	@Autowired
	ConejoServiceImplementation service;
	
	@GetMapping("/")
	public String list(Model model) {
		List<Conejo> list = service.listAll();
		model.addAttribute("listConejo", list);
		return "lista";
	}
	
	@GetMapping ("/delete")
	public String delete(@RequestParam Integer id) {
		service.delete(id);
		return "redirect:index";
		
		
	}
	
	
	
	
}
