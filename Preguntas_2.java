package preguntas_y_respuestas;

import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Preguntas_2 extends Preguntas{

	

	public Preguntas_2(List<String> preguntas, List<String> respuestas) {
		super(preguntas, respuestas);
		this.Marcador=Marcador;
		
		
	}
	
public void AñadirPreguntas(List<String> preguntas) {
		
		preguntas.add("2. ¿Cuál es el río más largo del mundo?");
		preguntas.add("2. ¿Cuál es el país con más habitantes del mundo?");
		preguntas.add("2. ¿Cuál es el país con menos habitantes del mundo?");
		preguntas.add("2. ¿Cuál es el océano más grande del mundo?");
		preguntas.add("2. ¿En qué año cayó el muro de Berlín?");
		
	   }
	
	public void RespuestasC(List<String> respuestas) {
		
		respuestas.add("A.Orinoco");
		respuestas.add("B.Nilo");
		respuestas.add("C.El Amazonas");
		respuestas.add("D.Mar rojo");
		
		respuestas.add("A. Rusia");
		respuestas.add("B. China");
		respuestas.add("C. Colombia");
		respuestas.add("D. Brasil");
		
		respuestas.add("A. Colombia");
		respuestas.add("B. Nicaragua");
		respuestas.add("C. Ecuador");
		respuestas.add("D. El vaticano");
		
		respuestas.add("A. Océano Pacífico");
		respuestas.add("B. Océano Atlantico");
		respuestas.add("C. Océano Índico");
		respuestas.add("D. Océano Ártico");
		
		respuestas.add("A. 1989");
		respuestas.add("B. 1523");
		respuestas.add("C. 2000");
		respuestas.add("D. 1865");
		
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
		 
		if(respuesta1.equals("C") || respuesta1.equals("c")) {
			Marcador+=1000;
			System.out.println("******************************************************************");
			System.out.print("!!!!!Respuesta correcta!!!!!");
			System.out.println("!!!!! NIVEL 3 !!!!!");
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
		 if(respuesta1.equals("B")||respuesta1.equals("b")) {
			 Marcador+=1000;
			 System.out.println("******************************************************************");
			 System.out.print("!!!!!Respuesta correcta!!!!!");
			 System.out.println("\n!!!!! NIVEL 3 !!!!!");
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
		 
		 if(respuesta1.equals("D")||respuesta1.equals("d")) {
			 Marcador+=1000;
			 System.out.println("******************************************************************");
			 System.out.print("!!!!!Respuesta correcta!!!!!");
			 System.out.println("\n!!!!! NIVEL 3 !!!!!");
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
			 Marcador+=1000;
			 System.out.println("******************************************************************");
			 System.out.print("!!!!!Respuesta correcta!!!!!");
			 System.out.println("\n!!!!! NIVEL 3 !!!!!");
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
		 
		 if(respuesta1.equals("A")||respuesta1.equals("a")) {
			 Marcador+=1000;
			 System.out.println("******************************************************************");
			 System.out.print("!!!!!Respuesta correcta!!!!!");
			 System.out.println("\n!!!!! NIVEL 3 !!!!!");
			 System.out.println("Su puntaje ahora es: " + Marcador);
		 }else if (respuesta1.equals("S") || respuesta1.equals("s")){
				System.out.println("Usted gano: " + Marcador + " Puntos");
				System.out.println("----FIN DEL JUEGO----");
			 }	else {
				System.out.println("----Respuesta incorrecta----");
				System.out.println("FIN DEL JUEGO");
			 }
	 }

	
	}
	
}
