package com.example.demo.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Models.Pet;
@Repository

public interface PetRepo extends JpaRepository<Pet, Integer>{

}
