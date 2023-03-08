package com.example.demo.Controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import com.example.demo.Models.Pet;
import com.example.demo.Repositories.PetRepo;
import com.example.demo.Service.PetService;

@RestController
@CrossOrigin
public class PetController {
	@Autowired
	PetRepo serviceRepository;
	@Autowired
	PetService service;
	
	@GetMapping("/get")
	List<Pet> getList()
	{
	return serviceRepository.findAll();

	}
	
	@PostMapping("/post")
	public Pet create(@RequestBody Pet pt)
	{
		
		return serviceRepository.save(pt);
	}
	
	@GetMapping("/getvalue/{id}")
	public Optional<Pet>getbyid(@PathVariable int id)
	{
		return service.getPet(id);
	}
	@PutMapping("/put")

	public String update(@RequestBody Pet pt)
	{
		return service.updateDetails(pt);
	}
	@DeleteMapping("/delete")

	public String delete(@RequestParam int id)
	{
	   return service.deleteDetails(id);
	}
	

}
