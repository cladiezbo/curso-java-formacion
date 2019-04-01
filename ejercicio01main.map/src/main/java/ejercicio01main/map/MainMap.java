package ejercicio01main.map;

import java.util.HashSet;
import java.util.Set;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.curso.java.oo.ejercicio01oo.model.Aula;
import com.curso.java.oo.ejercicio01oo.model.Estudiante;
import com.curso.java.oo.ejercicio01oo.model.GradoEscolaridadEstudiante;
import com.curso.java.oo.ejercicio01oo.model.Profesor;
import com.curso.java.oo.ejercicio01oo.model.Puesto;

import ejercicio01dao.IDaoAula;
import ejercicio01negocio.Negocio;

public class MainMap {

	public static void main(String[] args) throws Exception {

		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("beanMap.xml");
		IDaoAula mapDao =  applicationContext.getBean("mapDao",IDaoAula.class);

		Aula aula = new Aula("Kepler",true, true);
		Aula aula1 = new Aula("Newton",true, false);
		Estudiante estudiante = new Estudiante("Claudia", "Diez", "Borges", "950404", 23, "femenino", 9.3, GradoEscolaridadEstudiante.Superior, true);
		Estudiante estudianteA = new Estudiante("Sandra", "Diez", "Arduo", "22", 23, "femenino", 10d, GradoEscolaridadEstudiante.Bchillerato, true);
		Estudiante estudianteB = new Estudiante("Fernando", "Leyva", "Fernandez", "66", 26, "masculino", 8.3, GradoEscolaridadEstudiante.TecnicoSuperior, true);
		Estudiante estudianteC = new Estudiante("Juan", "Rojo", "Borges", "021357", 25, "masculino", 9d, GradoEscolaridadEstudiante.Superior, true);
		Profesor profesor = new Profesor("Ruben", "Gomez", "Garcia", "590812", 59, "masculino", false);
		Profesor profesor1 = new Profesor("Ursula", "Gomez", "Garcia", "590812", 59, "femenino", true);
		Puesto puesto1 = new Puesto(true, true, true);
		Puesto puesto2 = new Puesto(true, true, true);
		Puesto puesto3 = new Puesto(true, true, true);
		Puesto puesto4 = new Puesto(true, true, true);
		Puesto puesto5 = new Puesto(true, true, true);
		Set <Puesto> puestosAula = new HashSet <Puesto>();
		puestosAula.add(puesto1);
		puestosAula.add(puesto2);
		puestosAula.add(puesto3);
		aula.setPuestos(puestosAula);
		aula.setProfesor(profesor);

		Set <Puesto> puestosAula1 = new HashSet <Puesto>();
		puestosAula1.add(puesto4);
		puestosAula1.add(puesto5);
		aula1.setPuestos(puestosAula1);
		aula1.setProfesor(profesor1);

		Negocio negocio = new Negocio (mapDao);
		negocio.nuevaAula(aula);
		negocio.nuevaAula(aula1);
		negocio.asignarAlumnoAlAula(estudianteC, aula.getNombre());
		negocio.asignarAlumnoAlAula(estudianteB, aula1.getNombre());
		negocio.asignarAlumnoAlAula(estudianteA, aula.getNombre());
		negocio.asignarAlumnoAlAula(estudiante, aula1.getNombre());
		
		System.out.println(negocio.listaDeEstudiantePorAula("Kepler"));
		System.out.println(negocio.listaDeProfesoresPorAula("Kepler"));
	}


}
