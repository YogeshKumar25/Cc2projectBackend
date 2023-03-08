package com.example.demo.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.Models.Pet;
import com.example.demo.Repositories.PetRepo;

@Service
public class PetService {
	@Autowired
	PetRepo repository;
	public Optional<Pet>getPet(int id){
		return repository.findById(id);
	}
	public String updateDetails(Pet pt) {
		repository.save(pt);
		return "updated";
	}
	public String deleteDetails(int id)
	{
		repository.deleteById(id);
		return "Id deleted";
	}


}
