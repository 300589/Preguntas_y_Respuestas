package preguntas_y_respuestas;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

public class Historico extends Preguntas{
	
	public Historico(List<String> preguntas, List<String> respuestas) {
		super(preguntas, respuestas);
		
	}

	public static void creaArchivo(String nombreArchivo) { // Metodo para crear el archivo para el hisorico de datos del juego 
		File archivo = new File(nombreArchivo);
		 
		
		try {
			PrintWriter salida = new PrintWriter(archivo);
			if (!archivo.exists()) {
	            archivo.createNewFile();
	        }
			salida.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace(System.out);
			
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
	
	public static void escribirArchivo(String nombreArchivo, String contenido) { // este metodo sobre escribe el archivo creado anteriormente para asi tener el historico de los jugadores con su respectivo nombre, apellido, y puntaje 
		File archivo = new File(nombreArchivo);
		 
		try {
			PrintWriter salida = new PrintWriter(new FileWriter(archivo,true));
			salida.println(contenido);
			salida.println(Marcador);
			salida.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace(System.out);
		} catch (IOException e) {
			e.printStackTrace(System.out);
		} 
	}
	

}
