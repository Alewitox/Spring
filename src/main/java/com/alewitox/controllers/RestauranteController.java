package com.alewitox.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alewitox.entity.models.Restaurantes;
import com.alewitox.entity.services.IRestaurantesService;


@RestController
@CrossOrigin(origins = "*") 
public class RestauranteController {


	
	@Autowired
	IRestaurantesService restaurantesService;
	
	
	@GetMapping("/Restaurantes")
	public List<Restaurantes> getAllRestaurantes(){
		return restaurantesService.getAll();
	}
	
	
	@GetMapping("/Restaurantes/{id}")
	public Restaurantes getOne(@PathVariable(value = "id") int id) {
		return restaurantesService.get(id);
	}
	
	
	@PostMapping("/Restaurantes")
	public void add (Restaurantes restaurantes ) {
		restaurantesService.post(restaurantes);
	}
	
	
	@PutMapping("/Restaurantes/{id}")
	public void update (@Valid Restaurantes restaurantes,@Valid @PathVariable(value= "id") int id) {
		restaurantesService.put(restaurantes, id);
	}
	
	
	@DeleteMapping("/Restaurantes/{id}")
	public void delete (@PathVariable(value = "id") int id) {
		restaurantesService.delete(id);
	}
}


