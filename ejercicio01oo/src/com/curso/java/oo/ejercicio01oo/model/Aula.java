package com.curso.java.oo.ejercicio01oo.model;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value = "prototype")

public class Aula {
	
	 
	private String nombre;
	
	private Profesor profesor;
	@Value("false")
	private Boolean pizarra;
	@Value("false")
	private Boolean proyector;
	@Autowired
	@Qualifier("arrayList")
	private Collection<Puesto> puestos;
	
	
	public Collection<Puesto> getPuestos() {
		return puestos;
	}

	public void setPuestos(Collection<Puesto> puestos) {
		this.puestos = puestos;
	}

	@Autowired
	private Puesto puestoProfe;
	
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		result = prime * result + (pizarra ? 1231 : 1237);
		result = prime * result + ((profesor == null) ? 0 : profesor.hashCode());
		result = prime * result + (proyector ? 1231 : 1237);
		result = prime * result + ((puestoProfe == null) ? 0 : puestoProfe.hashCode());
		result = prime * result + ((puestos == null) ? 0 : puestos.hashCode());
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
		Aula other = (Aula) obj;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		if (pizarra != other.pizarra)
			return false;
		if (profesor == null) {
			if (other.profesor != null)
				return false;
		} else if (!profesor.equals(other.profesor))
			return false;
		if (proyector != other.proyector)
			return false;
		if (puestoProfe == null) {
			if (other.puestoProfe != null)
				return false;
		} else if (!puestoProfe.equals(other.puestoProfe))
			return false;
		if (puestos == null) {
			if (other.puestos != null)
				return false;
		} else if (!puestos.equals(other.puestos))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Aula [nombre=" + nombre + "]";
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Profesor getProfesor() {
		return profesor;
	}

	public void setProfesor(Profesor profesor) {
		this.profesor = profesor;
	}

	public Boolean getPizarra() {
		return pizarra;
	}

	public void setPizarra(Boolean pizarra) {
		this.pizarra = pizarra;
	}

	public Boolean getProyector() {
		return proyector;
	}

	public void setProyector(Boolean proyector) {
		this.proyector = proyector;
	}

	public Puesto getPuestoProfe() {
		return puestoProfe;
	}

	public void setPuestoProfe(Puesto puestoProfe) {
		this.puestoProfe = puestoProfe;
	}

	


	
	
	
}
