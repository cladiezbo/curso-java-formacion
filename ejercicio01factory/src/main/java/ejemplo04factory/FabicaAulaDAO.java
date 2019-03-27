package ejemplo04factory;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import ejercicio01dao.IDaoAula;

public class FabicaAulaDAO {

	//patron fabrica desacoplado
	public static IDaoAula getAulaDaoInstance() throws InstantiationException, IllegalAccessException, ClassNotFoundException, IOException {
	  String nombreDeInstancia = getNombreDeInstanciaDeFichero();
		return (IDaoAula) Class.forName(nombreDeInstancia).newInstance();
		
	}

	private static String getNombreDeInstanciaDeFichero() throws IOException {
		File file = new File ("fichero.txt");
	    FileReader reader = new FileReader(file);
	    BufferedReader br = new BufferedReader(reader);
	    String claseACrear = br.readLine();
	    br.close();
		return "com.curso.java.";
	}
	
}
