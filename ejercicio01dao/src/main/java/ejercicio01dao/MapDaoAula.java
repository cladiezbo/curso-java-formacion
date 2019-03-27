package ejercicio01dao;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import com.curso.java.oo.ejercicio01oo.model.Aula;

public class MapDaoAula implements IDaoAula {
	
	private Map<String,Aula> mapAula = new HashMap<String, Aula>();
	
	

	public MapDaoAula(Map<String, Aula> mapAula) {
		super();
		this.mapAula = mapAula;
	}

	public void crearAula(Aula aula) {
		mapAula.put(aula.getNombre(), aula);
		
	}

	public void borrarAula(Aula aula) {
		mapAula.remove(aula.getNombre(), aula);
		
	}
	public void borrarAulaPorNombre(String numeroDeAula) {
		mapAula.remove(numeroDeAula);
	}


	public Collection<Aula> getAulas() {
	
		return null;
	}

	public Aula getAula(String numeroDeAula) {
	
		return mapAula.get(numeroDeAula);
	}

	public void actualizarAula(Aula aula) {
		mapAula.put(aula.getNombre(), aula);
		
	}

	
}
