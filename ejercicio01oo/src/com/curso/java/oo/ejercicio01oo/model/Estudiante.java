package com.curso.java.oo.ejercicio01oo.model;

public class Estudiante extends Persona {
	
	private Double calificacion;
	private GradoEscolaridadEstudiante grado;
	private boolean subversionado;
	

	
	public Estudiante(String nombre, String apellido1, String apellido2, String dNI, Integer edad, String sexo,
			Double calificacion, GradoEscolaridadEstudiante grado, boolean subversionado) {
		super(nombre, apellido1, apellido2, dNI, edad, sexo);
		this.calificacion = calificacion;
		this.grado = grado;
		this.subversionado = subversionado;
	}
	public boolean isSubversionado() {
		return subversionado;
	}
	public void setSubversionado(boolean subversionado) {
		this.subversionado = subversionado;
	}
	public Double getCalificacion() {
		return calificacion;
	}
	public void setCalificacion(Double calificacion) {
		this.calificacion = calificacion;
	}
	public GradoEscolaridadEstudiante getGrado() {
		return grado;
	}
	public void setGrado(GradoEscolaridadEstudiante grado) {
		this.grado = grado;
	}
	
	
	

}
