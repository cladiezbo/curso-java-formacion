package ejercicio01dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import com.curso.java.oo.ejercicio01oo.model.Aula;

public class ListDaoAula implements IDaoAula {
	
	private List<Aula> listaAula;
	
	

	public ListDaoAula(List<Aula> listaAula) {
		super();
		this.listaAula = listaAula;
	}

	public void crearAula(Aula aula) {
		listaAula.add(aula);
		
	}

	public void borrarAula(Aula aula) {
		listaAula.remove(aula);
		
	}
	public void borrarAulaPorNombre(String numeroDeAula) {
		listaAula.remove(getAula(numeroDeAula));
		
	}

	public Collection<Aula> getAulas() {
		
		return listaAula;
	}

	public Aula getAula(String numeroDeAula) {
		Aula aula = null;
		int i= 0;
		boolean encontrado = false;
		while(!encontrado && i<listaAula.size()) {
			if(listaAula.get(i).getNombre().equals(numeroDeAula)){
				encontrado = true;
				 aula = listaAula.get(i);
				
			}
			
		}
		return aula;
	}

	public void actualizarAula(Aula aula) {
		int i= 0;
		boolean encontrado = false;
		while(!encontrado && i<listaAula.size()) {
			if(listaAula.get(i).getNombre().equals(aula.getNombre())){
				encontrado = true;
				listaAula.set(i,aula);
				
			}
			
		}
	}
	


}
