package com.curso.java.oo.ejercicio01oo.model;

public class Puesto {
	
	protected boolean ordenador;
	protected boolean mesa;
	protected boolean silla;
	protected Persona persona;
	
	
	

	public Puesto(boolean ordenador, boolean mesa, boolean silla) {
		super();
		this.ordenador = ordenador;
		this.mesa = mesa;
		this.silla = silla;
	}

	public Persona getPersona() {
		return persona;
	}

	public void setPersona(Persona persona) {
		this.persona = persona;
	}

	public boolean isOrdenador() {
		return ordenador;
	}
	public void setOrdenador(boolean ordenador) {
		this.ordenador = ordenador;
	}
	public boolean isMesa() {
		return mesa;
	}
	public void setMesa(boolean mesa) {
		this.mesa = mesa;
	}
	public boolean isSilla() {
		return silla;
	}
	public void setSilla(boolean silla) {
		this.silla = silla;
	}
	
	

}
