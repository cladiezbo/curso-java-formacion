package ejercicio01negocio;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import com.curso.java.oo.ejercicio01oo.model.Aula;
import com.curso.java.oo.ejercicio01oo.model.Estudiante;
import com.curso.java.oo.ejercicio01oo.model.Profesor;
import com.curso.java.oo.ejercicio01oo.model.Puesto;

import ejercicio01dao.IDaoAula;

public class Negocio {

	private IDaoAula aulaDao;

	public Negocio(IDaoAula aulaDao) {
		super();
		this.aulaDao = aulaDao;
	}
	public Negocio() {
		super();
		this.aulaDao = aulaDao;
	}
	
	public void nuevaAulaVarias(Collection<Aula> aulas) {
		for (Aula aula : aulas) {
			aulaDao.crearAula(aula);  
		}
	}
	
	public void nuevaAula(Aula aula) {
			aulaDao.crearAula(aula); 
		
		
	}
	
	public void eliminarAula(Aula aula) {
			aulaDao.borrarAula(aula);  
		
	}
	
	public Collection<Estudiante> listaDeEstudiantePorAula(String numeroDeAula){
		Collection<Estudiante> estudiantesCollection = new ArrayList<Estudiante>() ;
		Collection <Puesto> puestosCollection = aulaDao.getAula(numeroDeAula).getPuestos();
		for (Puesto puesto : puestosCollection) {
			estudiantesCollection.add((Estudiante) puesto.getPersona());  
		}
		
		return estudiantesCollection;
		
	}
	
	public Collection<Profesor> listaDeProfesoresPorAula(String numeroDeAula){
		Aula aula = aulaDao.getAula(numeroDeAula);
		Collection<Profesor> profesoresCollection = new ArrayList<Profesor>() ;
		Collection <Puesto> puestosCollection = aula.getPuestos();
		profesoresCollection.add(aula.getProfesor());
		for (Puesto puesto : puestosCollection) {
			if ( puesto.getPersona() instanceof Profesor)
			profesoresCollection.add((Profesor) puesto.getPersona());  
		}
		return profesoresCollection;
		
	}
	public void asignarAlumnoAlAula(Estudiante estudiante,String numeroDeAula) throws Exception {
		Aula aula = aulaDao.getAula(numeroDeAula);
		Collection <Puesto> puestosCollection = aula.getPuestos();
		Iterator<Puesto> iterator = puestosCollection.iterator();
		boolean asignado =false;
		while(!asignado && iterator.hasNext() ) {
			Puesto puesto = iterator.next();
			if(puesto.getPersona() == null) {
				puesto.setPersona(estudiante);
				asignado = true;
				
			}
		}
		if(!asignado)
			throw new Exception("No existe espacio para agregar a otro estudiante");
		
		
	}

}
