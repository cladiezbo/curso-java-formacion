package com.curso.java.oo.ejercicio01oo.model;

public class Profesor extends Persona {
	
	private boolean malaLeche;

	
	public Profesor(String nombre, String apellido1, String apellido2, String dNI, Integer edad, String sexo,
			boolean malaLeche) {
		super(nombre, apellido1, apellido2, dNI, edad, sexo);
		this.malaLeche = malaLeche;
	}

	public boolean isMalaLeche() {
		return malaLeche;
	}

	public void setMalaLeche(boolean malaLeche) {
		this.malaLeche = malaLeche;
	}
	
	

}
