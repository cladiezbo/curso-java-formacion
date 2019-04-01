package ejercicio01dao;

import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.curso.java.oo.ejercicio01oo.model.Aula;

@Repository("miDao")
public class ListDaoAula implements IDaoAula {
	
	@Autowired
	@Qualifier("arrayList")
	private List<Aula> listaAula;
	
	

	public List<Aula> getListaAula() {
		return listaAula;
	}

	public void setListaAula(List<Aula> listaAula) {
		this.listaAula = listaAula;
	}

	public ListDaoAula() {
		super();
		
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
			 i++;
			
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
			i++;
			
		}
	}
	


}
