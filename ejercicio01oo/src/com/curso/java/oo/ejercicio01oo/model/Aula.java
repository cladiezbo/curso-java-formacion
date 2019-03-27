package com.curso.java.oo.ejercicio01oo.model;

import java.util.HashSet;
import java.util.Set;

public class Aula {
	
	private String nombre; 
	private Profesor profesor;
	private boolean pizarra;
	private boolean proyector;
	private Set<Puesto> puestos;
	private Puesto puestoProfe;
	
	
	
	public Aula(String nombre, boolean pizarra, boolean proyector) {
		super();
		this.nombre = nombre;
		this.pizarra = pizarra;
		this.proyector = proyector;
		this.puestos = new HashSet<Puesto>();
	}

	public Profesor getProfesor() {
		return profesor;
	}

	public void setProfesor(Profesor profesor) {
		this.profesor = profesor;
	}

	public boolean isPizarra() {
		return pizarra;
	}

	public void setPizarra(boolean pizarra) {
		this.pizarra = pizarra;
	}

	public boolean isProyector() {
		return proyector;
	}

	public void setProyector(boolean proyector) {
		this.proyector = proyector;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Set<Puesto> getPuestos() {
		return puestos;
	}

	public void setPuestos(Set<Puesto> puestos) {
		this.puestos = puestos;
	}

	public Puesto getPuestoProfe() {
		return puestoProfe;
	}

	public void setPuestoProfe(Puesto puestoProfe) {
		this.puestoProfe = puestoProfe;
	}


	
	
	
}
