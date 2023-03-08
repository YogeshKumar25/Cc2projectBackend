package com.example.demo.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Pet {
	@Id
	private int id;
	private String petName;
	private String petBreed;
	private String gender;
	private int age;
	private int weight;
	public Pet(int id, String petName, String petBreed, String gender, int age, int weight) {
		super();
		this.id = id;
		this.petName = petName;
		this.petBreed = petBreed;
		this.gender = gender;
		this.age = age;
		this.weight = weight;
	}
	public Pet() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPetName() {
		return petName;
	}
	public void setPetName(String petName) {
		this.petName = petName;
	}
	public String getPetBreed() {
		return petBreed;
	}
	public void setPetBreed(String petBreed) {
		this.petBreed = petBreed;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	
	
	
}