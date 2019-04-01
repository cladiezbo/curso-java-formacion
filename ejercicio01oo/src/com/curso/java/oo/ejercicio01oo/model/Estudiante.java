package com.curso.java.oo.ejercicio01oo.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value = "prototype")

public class Estudiante extends Persona {
	
	@Value("false")
	private Boolean subversionado;
	

	public Estudiante() {
		super();
	}

	

	public Boolean getSubversionado() {
		return subversionado;
	}



	public void setSubversionado(Boolean subversionado) {
		this.subversionado = subversionado;
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + (subversionado ? 1231 : 1237);
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
		Estudiante other = (Estudiante) obj;
		if (subversionado != other.subversionado)
			return false;
		return true;
	}

	
	
}
