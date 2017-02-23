package es.salesianos.edu.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import es.salesianos.edu.models.Desayuno;
import es.salesianos.edu.repository.Repository;
@Component
public class ServiceTeam {
	
	@Autowired
	Repository repository;
		
	public boolean insert(Desayuno desayuno) {
		repository.insertDesayuno(desayuno);
		
		return true;
	}
	
	public boolean show() {
		
		return true;
	}
	
	public List<Desayuno> addListDesayuno() {
		return repository.getDb().getDesayuno();
	}
}
