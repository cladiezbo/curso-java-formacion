package ejercicio01dao;

import java.util.Collection;

import com.curso.java.oo.ejercicio01oo.model.Aula;

public interface IDaoAula {
	
	 void crearAula(Aula aula);
	 void borrarAula(Aula aula);
	 void borrarAulaPorNombre(String numeroDeAula);
	 void actualizarAula(Aula aula);
	 Collection<Aula> getAulas();
	 Aula getAula (String numeroDeAula);
	 

}
