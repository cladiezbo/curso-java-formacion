package com.curso.java.oo.ejercicio01oo.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value = "prototype")

public class Puesto {
	@Value("false")
	protected Boolean ordenador;
	@Value("false")
	protected Boolean mesa;
	@Value("false")
	protected Boolean silla;
	
	protected Persona persona;
	
	
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (mesa ? 1231 : 1237);
		result = prime * result + (ordenador ? 1231 : 1237);
		result = prime * result + ((persona == null) ? 0 : persona.hashCode());
		result = prime * result + (silla ? 1231 : 1237);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Puesto other = (Puesto) obj;
		if (mesa != other.mesa)
			return false;
		if (ordenador != other.ordenador)
			return false;
		if (persona == null) {
			if (other.persona != null)
				return false;
		} else if (!persona.equals(other.persona))
			return false;
		if (silla != other.silla)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Puesto [ordenador=" + ordenador + ", mesa=" + mesa + ", silla=" + silla + ", persona=" + persona + "]";
	}

	public Puesto() {
		super();
		
	}

	public Boolean getOrdenador() {
		return ordenador;
	}

	public void setOrdenador(Boolean ordenador) {
		this.ordenador = ordenador;
	}

	public Boolean getMesa() {
		return mesa;
	}

	public void setMesa(Boolean mesa) {
		this.mesa = mesa;
	}

	public Boolean getSilla() {
		return silla;
	}

	public void setSilla(Boolean silla) {
		this.silla = silla;
	}

	public Persona getPersona() {
		return persona;
	}

	public void setPersona(Persona persona) {
		this.persona = persona;
	}

	
	

}
