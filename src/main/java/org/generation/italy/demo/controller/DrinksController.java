package org.generation.italy.demo.controller;

import java.util.List;

import org.generation.italy.demo.pojo.Drink;
import org.generation.italy.demo.service.DrinkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/drinks")
public class DrinksController {
	
	@Autowired
	private DrinkService drinkService;
	
	@GetMapping
	public String getDrinks(Model model) {
		List<Drink> drinks = drinkService.findAll();
		model.addAttribute("drinks", drinks);
		return "drinks";
	}
	
}
