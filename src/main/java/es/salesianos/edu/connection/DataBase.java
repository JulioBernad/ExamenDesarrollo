package es.salesianos.edu.connection;

import java.util.ArrayList;

import es.salesianos.edu.models.Desayuno;

public class DataBase {

	private ArrayList<Desayuno> desayuno = new ArrayList<Desayuno>();

	public ArrayList<Desayuno> getDesayuno() {
		return desayuno;
	}

	public void setDesayuno(ArrayList<Desayuno> desayuno) {
		this.desayuno = desayuno;
	}

}
