package es.salesianos.edu.repository;

import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.Logger;

import es.salesianos.edu.connection.DataBase;
import es.salesianos.edu.models.Desayuno;


@org.springframework.stereotype.Repository
public class Repository{

	 private DataBase db = new DataBase();

	public DataBase getDb() {
		return db;
	}

	public void setDb(DataBase db) {
		this.db = db;
	}
	
	public boolean insertDesayuno (Desayuno desayuno) {
		db.getDesayuno().add(desayuno);
		return true;
	}
	
	public List<Desayuno> listTeams() {
		
		return db.getDesayuno();
	}

	
}
