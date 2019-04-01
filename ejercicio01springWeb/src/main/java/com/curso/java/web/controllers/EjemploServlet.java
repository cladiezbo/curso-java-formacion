package com.curso.java.web.controllers;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.curso.java.oo.ejercicio01oo.model.Aula;
import com.curso.java.oo.ejercicio01oo.model.Estudiante;

import ejercicio01negocio.Negocio;

/**
 * Servlet implementation class EjemploServlet
 */
@WebServlet({ "/Aulas" })
public class EjemploServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	private ApplicationContext context;
	
	
	
	@Override
	public void init() throws ServletException {
		
		ApplicationContext applicationContext = WebApplicationContextUtils
			.getRequiredWebApplicationContext(getServletContext());
		this.context = applicationContext;
	}

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public EjemploServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
        
		Negocio negocio =  context.getBean(Negocio.class);
		Aula aula = context.getBean(Aula.class);
		aula.setNombre("Kepler");
		Aula aula1 = context.getBean(Aula.class);
		aula.setNombre("Newton");
		Estudiante estudianteC =  context.getBean(Estudiante.class);
		estudianteC.setNombre("Claudia");
		Estudiante estudianteB =  context.getBean(Estudiante.class);
		estudianteB.setNombre("Meidel");
		Estudiante estudianteA =  context.getBean(Estudiante.class);
		estudianteA.setNombre("Gloria");
		negocio.nuevaAula(aula);
		negocio.nuevaAula(aula1);
		
			try {
				negocio.asignarAlumnoAlAula(estudianteC, aula.getNombre());
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				negocio.asignarAlumnoAlAula(estudianteB, aula.getNombre());
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				negocio.asignarAlumnoAlAula(estudianteA, aula.getNombre());
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		request.setAttribute("aula", context.getBean(Aula.class));
		request.setAttribute("estudiante", context.getBean(Estudiante.class));
//		request.setAttribute("mensajeRequest", context.getBean("mensajeRequest"));
//		request.setAttribute("mensajeSession", context.getBean("mensajeSession"));
		getServletContext().getRequestDispatcher("/WEB-INF/jsps/saludar.jsp").forward(request, response);
	}

}
