package preguntas_y_respuestas;

import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Preguntas_5 extends Preguntas{

	public Preguntas_5(List<String> preguntas, List<String> respuestas) {
		super(preguntas, respuestas);
		
	}
	
public void AñadirPreguntas(List<String> preguntas) {
		
		preguntas.add("5. ¿Qué enfermedad provocó la muerte de Stephen Hawking?");
		preguntas.add("5. ¿Quién dirigió la trilogía de El Padrino?");
		preguntas.add("5. ¿Cuándo asesinaron al presidente John F. Kennedy?");
		preguntas.add("5. ¿En qué país nació Adolf Hitler?");
		preguntas.add("5. ¿Cuánto duró “La Guerra de los Cien Años”?");
		
	   }
	
	public void RespuestasC(List<String> respuestas) {
		
		respuestas.add("A.Esclerosis Lateral Amiotrófica");
		respuestas.add("B.Fiebre amarilla");
		respuestas.add("C.Covid 19");
		respuestas.add("D.Esclerosis Multiple");
		
		respuestas.add("A. Alfred Hitchcock");
		respuestas.add("B. Quentin Tarantino");
		respuestas.add("C. Steven Spielberg");
		respuestas.add("D. Francis Ford Coppola");
		
		respuestas.add("A. 22 de Mayo de 1954.");
		respuestas.add("B. 27 de Octubre de 1933.");
		respuestas.add("C. 22 de Noviembre de 1963.");
		respuestas.add("D. 19 de Noviembre de 1964.");
		
		respuestas.add("A. En Austria, en el año 1889");
		respuestas.add("B. En Alemania, en el año 1989");
		respuestas.add("C. En Rusia, en el año 1580");
		respuestas.add("D. En Australia, en el año 1987");
		
		respuestas.add("A. 100 años.");
		respuestas.add("B. 125 años.");
		respuestas.add("C. 155 años.");
		respuestas.add("D. 116 años.");
		
	}
	
	public void escojerpregunta(List<String> preguntas, List<String> respuestas) {
		String respuestasT="";
		random = preguntas.get(new Random().nextInt(preguntas.size()));
		System.out.println(random);
		
		
		if (random == preguntas.get(0)) {
	     for (int i =0;i<4;i++) {
	    	 System.out.println("\n"+respuestas.get(i));
	     }
		
		}else if(random == preguntas.get(1)) {
			for (int i =4;i<8;i++) {
		    	 System.out.println("\n"+respuestas.get(i));
		    }
			
		}else if(random == preguntas.get(2)) {
			for(int i = 8;i<12;i++) {
				System.out.println("\n"+respuestas.get(i));
			}
		}else if(random == preguntas.get(3)) {
			for(int i = 12;i<16;i++) {
				System.out.println("\n"+respuestas.get(i));
			}
		}else if(random == preguntas.get(4)) {
			for(int i = 16;i<20;i++) {
				System.out.println("\n"+respuestas.get(i));
			}
		}
		}
	
	public void verificar_respuesta(List<String> preguntas,List<String> respuestas) {
		Scanner op = new Scanner(System.in);
		System.out.println("\nDigita tu respuesta o pulsa S Para retirarse: ");
		
		String respuesta1 = op.nextLine();
		
	 if(random == preguntas.get(0)) {	
		 
		if(respuesta1.equals("A") || respuesta1.equals("a")) {
			Marcador+=8000;
			System.out.println(Marcador);
			System.out.println("******************************************************************");
			System.out.print("!!!!!Respuesta correcta!!!!!");
			System.out.println("!!!!! FIN DEL JUEGO AH GANADO !!!!!");
			System.out.println("Su puntaje ahora es: " + Marcador);
			
		}else if (respuesta1.equals("S") || respuesta1.equals("s")){
			System.out.println("Usted gano: " + Marcador + " Puntos");
			System.out.println("----FIN DEL JUEGO----");
		 }	else {
			System.out.println("----Respuesta incorrecta----");
			System.out.println("----FIN DEL JUEGO----");
		 }
	  }
	 if(random == preguntas.get(1))	{
		 if(respuesta1.equals("D")||respuesta1.equals("d")) {
			System.out.println(Marcador);
			System.out.println("******************************************************************");
			System.out.print("!!!!!Respuesta correcta!!!!!");
			System.out.println("!!!!! FIN DEL JUEGO AH GANADO !!!!!");
			System.out.println("Su puntaje ahora es: " + Marcador);
		 }else if (respuesta1.equals("S") || respuesta1.equals("s")){
				System.out.println("Usted gano: " + Marcador + " Puntos");
				System.out.println("----FIN DEL JUEGO----");
			 }	else {
				System.out.println("----Respuesta incorrecta----");
				System.out.println("----FIN DEL JUEGO----");
			 }
	 }
	 if(random == preguntas.get(2))	{
		 
		 if(respuesta1.equals("C")||respuesta1.equals("c")) {
			 Marcador+=8000;
			 System.out.println("******************************************************************");
			 System.out.print("!!!!!Respuesta correcta!!!!!");
			 System.out.println("\n!!!!! FIN DEL JUEGO AH GANADO !!!!!");
			 System.out.println("Su puntaje ahora es: " + Marcador);
		 }else if (respuesta1.equals("S") || respuesta1.equals("s")){
				System.out.println("Usted gano: " + Marcador + " Puntos");
				System.out.println("----FIN DEL JUEGO----");
			 }	else {
				System.out.println("----Respuesta incorrecta----");
				System.out.println("----FIN DEL JUEGO----");
			 }
	 }
	 if(random == preguntas.get(3))	{
		 
		 if(respuesta1.equals("A")||respuesta1.equals("a")) {
			 Marcador+=8000;
			 System.out.println("******************************************************************");
			 System.out.print("!!!!!Respuesta correcta!!!!!");
			 System.out.println("\n!!!!! FIN DEL JUEGO AH GANADO !!!!!");
			 System.out.println("Su puntaje ahora es: " + Marcador);
		 }else if (respuesta1.equals("S") || respuesta1.equals("s")){
				System.out.println("Usted gano: " + Marcador + " Puntos");
				System.out.println("----FIN DEL JUEGO----");
			 }	else {
				System.out.println("----Respuesta incorrecta----");
				System.out.println("----FIN DEL JUEGO----");
			 }
	 }
	 if(random == preguntas.get(4))	{
		 
		 if(respuesta1.equals("D")||respuesta1.equals("d")) {
			 Marcador+=8000;
			 System.out.println("******************************************************************");
			 System.out.print("!!!!!Respuesta correcta!!!!!");
			 System.out.println("\n!!!!! FIN DEL JUEGO AH GANADO !!!!!");
			 System.out.println("Su puntaje ahora es: " + Marcador);
		 }else if (respuesta1.equals("S") || respuesta1.equals("s")){
				System.out.println("Usted gano: " + Marcador + " Puntos");
				System.out.println("----FIN DEL JUEGO----");
			 }	else {
				System.out.println("----Respuesta incorrecta----");
				System.out.println("----FIN DEL JUEGO----");
			 }
	 }

	
	}
	

}
