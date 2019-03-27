package com.curso.java.oo.ejercicio01oo;

import java.util.Iterator;
import java.util.Set;

import com.curso.java.oo.ejercicio01oo.model.Aula;
import com.curso.java.oo.ejercicio01oo.model.Estudiante;
import com.curso.java.oo.ejercicio01oo.model.GradoEscolaridadEstudiante;
import com.curso.java.oo.ejercicio01oo.model.Profesor;
import com.curso.java.oo.ejercicio01oo.model.Puesto;


public class LanzadorAulaKepler {

	public static void main(String[] args) {
		
		Aula aula = new Aula("Kepler", true, true);
		aula.setPuestoProfe(new Puesto(true, true, true));
		for(int i=0; i<14;i++) {
			aula.getPuestos().add(new Puesto(true, true, true));
		}
			aula.getPuestos().add(new Puesto(false, false, false));
			System.out.println("algo");
			aula.getPuestoProfe().setPersona(new Profesor("nombre", "apellido1", "apellido2", "dNI", 22, "sexo", true));
		    Set<Puesto> puestos = aula.getPuestos();
		    Iterator<Puesto> iterator = puestos.iterator();
		    int numeroDeAlumnos = 12;
		    while(iterator.hasNext() && numeroDeAlumnos>0) {
		    	Puesto puestoActual = iterator.next();
		    	if(puestoActual.isOrdenador()) {
		    		puestoActual.setPersona(new Estudiante("nombre", "apellido1", "apellido2", "dNI", 33, "sexo", 99d, GradoEscolaridadEstudiante.Bchillerato, true));
		    		numeroDeAlumnos--;
		    		
		    	}
		    }
		    	
			
	}

}
