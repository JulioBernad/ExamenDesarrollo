package es.salesianos.edu.models;

import java.io.Serializable;

public class Desayuno implements Serializable{
	private String alumno;
	private String bocadillo;
	private boolean naranja;
	
	public String getAlumno() {
		return alumno;
	}
	public void setAlumno(String alumno) {
		this.alumno = alumno;
	}
	
	public String getBocadillo() {
		return bocadillo;
	}
	public void setBocadillo(String bocadillo) {
		this.bocadillo = bocadillo;
	}
	
	public boolean getNaranja() {
		return naranja;
	}
	public void setNaranja(boolean naranja) {
		this.naranja = naranja;
	}
	
	

}
