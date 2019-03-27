package com.curso.java.oo.ejercicio01oo.model;

public class Coordenadas {
	
	private String coordenadaX;
	private String coordenadaY;
	
	
	public Coordenadas(String coordenadaX, String coordenadaY) {
		super();
		this.coordenadaX = coordenadaX;
		this.coordenadaY = coordenadaY;
	}
	
	public String getCoordenadaX() {
		return coordenadaX;
	}
	public void setCoordenadaX(String coordenadaX) {
		this.coordenadaX = coordenadaX;
	}
	public String getCoordenadaY() {
		return coordenadaY;
	}
	public void setCoordenadaY(String coordenadaY) {
		this.coordenadaY = coordenadaY;
	}
	
	

}
