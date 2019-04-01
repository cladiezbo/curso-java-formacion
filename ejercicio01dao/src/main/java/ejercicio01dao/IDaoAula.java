package ejercicio01dao;

import java.util.Collection;

import org.springframework.stereotype.Repository;

import com.curso.java.oo.ejercicio01oo.model.Aula;
@Repository
public interface IDaoAula {
	
	 void crearAula(Aula aula);
	 void borrarAula(Aula aula);
	 void borrarAulaPorNombre(String numeroDeAula);
	 void actualizarAula(Aula aula);
	 Collection<Aula> getAulas();
	 Aula getAula (String numeroDeAula);
	 

}
