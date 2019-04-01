package ejercicio01dao;

import java.util.Collection;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.curso.java.oo.ejercicio01oo.model.Aula;
@Repository
public class MapDaoAula implements IDaoAula {
	
	@Autowired
	@Qualifier("hashMap")
	private Map<String,Aula> mapAula; 
	
	

	public MapDaoAula() {
		super();
		
	}

	public Map<String, Aula> getMapAula() {
		return mapAula;
	}

	public void setMapAula(Map<String, Aula> mapAula) {
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
