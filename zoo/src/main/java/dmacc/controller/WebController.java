package dmacc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import dmacc.beans.Animals;
import dmacc.repository.AnimalsRepository;



@Controller
public class WebController {
	@Autowired
	AnimalsRepository repo;
	
	@GetMapping("/viewAll")
		public String viewAllAnimals(Model model) {
		model.addAttribute("Animals", repo.findAll());
		return "results";
	}
	@GetMapping("/inputAnimals")
	public String addNewAnimals(Model model) {
		Animals c = new Animals();
		model.addAttribute("newAnimals", c);
		return "input";
	}

	@GetMapping("/edit/{id}")
	public String showUpdateAnimals(@PathVariable("id") long id, Model model) {
		Animals c = repo.findById(id).orElse(null);
		System.out.println("ITEM TO EDIT: " + c.toString());
		model.addAttribute("newAnimals", c);
		return "input";
	}

	@PostMapping("/update/{id}")
	public String reviseAnimals(Animals c, Model model) {
		repo.save(c);
		return viewAllAnimals(model);
	}
	
	@GetMapping("/delete/{id}")
	public String deleteUser(@PathVariable("id") long id, Model model) {
		Animals c = repo.findById(id).orElse(null);
	    repo.delete(c);
	    return viewAllAnimals(model);
}
}
