package ejercicio01main.list;

import java.util.HashSet;
import java.util.Set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


import com.curso.java.oo.ejercicio01oo.model.Aula;
import com.curso.java.oo.ejercicio01oo.model.Estudiante;
import com.curso.java.oo.ejercicio01oo.model.Profesor;
import com.curso.java.oo.ejercicio01oo.model.Puesto;


import ejercicio01negocio.Negocio;

public class MainList {
	
	public static ApplicationContext context;

	static {
		context = new ClassPathXmlApplicationContext("beanNegocio.xml");
	}
	
	
	public static void main(String[] args) throws Exception {
		
		
		Negocio negocio =  context.getBean(Negocio.class);
		
		Aula aula = context.getBean(Aula.class);
		aula.setNombre("Kepler");
		Aula aula1 = context.getBean(Aula.class);
		aula.setNombre("Newton");
		//Estudiante estudiante = context.getBean(Estudiante.class);
		//Estudiante estudianteA =  context.getBean(Estudiante.class);
		//Estudiante estudianteB =  context.getBean(Estudiante.class);
		Estudiante estudianteC =  context.getBean(Estudiante.class);
		//Profesor profesor = new Profesor("Ruben", "Gomez", "Garcia", "590812", 59, "masculino", false);
		//Profesor profesor1 = new Profesor("Ursula", "Gomez", "Garcia", "590812", 59, "femenino", true);
//		Puesto puesto1 =  context.getBean(Puesto.class);
//		Puesto puesto2 = context.getBean(Puesto.class);
//		Puesto puesto3 = context.getBean(Puesto.class);
		//Set <Puesto> puestosAula = new HashSet <Puesto>();
//		puestosAula.add(puesto1);
//		puestosAula.add(puesto2);
//		puestosAula.add(puesto3);
//		aula.setPuestos(puestosAula);
		//aula.setProfesor(profesor);

//		Set <Puesto> puestosAula1 = new HashSet <Puesto>();
//		puestosAula1.add(puesto1);
//		puestosAula1.add(puesto2);
//		aula1.setPuestos(puestosAula1);
		//aula1.setProfesor(profesor1);
		
		//Negocio negocio = new Negocio(listDao);
		negocio.nuevaAula(aula);
		negocio.nuevaAula(aula1);
		negocio.asignarAlumnoAlAula(estudianteC, aula.getNombre());
		//negocio.asignarAlumnoAlAula(estudianteB, aula1.getNombre());
		//negocio.asignarAlumnoAlAula(estudianteA, aula.getNombre());
		//negocio.asignarAlumnoAlAula(estudiante, aula1.getNombre());
		
		System.out.println(negocio.listaDeEstudiantePorAula("Kepler"));
		System.out.println(negocio.listaDeProfesoresPorAula("Kepler"));
	}

}
