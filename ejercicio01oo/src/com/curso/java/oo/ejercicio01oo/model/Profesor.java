package com.curso.java.oo.ejercicio01oo.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value = "prototype")
public class Profesor extends Persona {
	@Value("false")
	private Boolean malaLeche;
	
	
	
	@Override
	public String toString() {
		return "Profesor [nombre=" + this.getNombre() +"]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + (malaLeche ? 1231 : 1237);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Profesor other = (Profesor) obj;
		if (malaLeche != other.malaLeche)
			return false;
		return true;
	}


	public Profesor() {
		super();
	}

	public Boolean getMalaLeche() {
		return malaLeche;
	}

	public void setMalaLeche(Boolean malaLeche) {
		this.malaLeche = malaLeche;
	}

	
	
	
	

}
