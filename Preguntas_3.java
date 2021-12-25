package preguntas_y_respuestas;

import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Preguntas_3 extends Preguntas{

	public Preguntas_3(List<String> preguntas, List<String> respuestas) {
		super(preguntas, respuestas);
		
	}
public void AñadirPreguntas(List<String> preguntas) {
		
		preguntas.add("3. ¿Cuáles son los únicos mamíferos que pueden volar?");
		preguntas.add("3. ¿Cuál es el animal más rápido?");
		preguntas.add("3. ¿Cuántos corazones tiene un gusano de tierra?");
		preguntas.add("3. ¿Qué gas liberan las plantas al hacer la fotosíntesis?");
		preguntas.add("3. ¿Cuál es el gas mayoritario de la atmósfera terrestre?");
		
	   }
	
	public void RespuestasC(List<String> respuestas) {
		
		respuestas.add("A.Mono");
		respuestas.add("B.Delfin");
		respuestas.add("C.Leon");
		respuestas.add("D.Murciélagos.");
		
		respuestas.add("A. Leopardo");
		respuestas.add("B. halcón peregrino");
		respuestas.add("C. Leon");
		respuestas.add("D. Aguila");
		
		respuestas.add("A. 10");
		respuestas.add("B. 20");
		respuestas.add("C. 5");
		respuestas.add("D. 1");
		
		respuestas.add("A. Dioxido de carbono");
		respuestas.add("B. Clorofila");
		respuestas.add("C. CO2");
		respuestas.add("D. Oxigeno");
		
		respuestas.add("A. Oxigeno");
		respuestas.add("B. Amoniaco");
		respuestas.add("C. Nitrogeno");
		respuestas.add("D. Litio");
		
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
		 
		if(respuesta1.equals("D") || respuesta1.equals("d")) {
			 Marcador+=2000;
			 System.out.println("******************************************************************");
			 System.out.print("!!!!!Respuesta correcta!!!!!");
			 System.out.println("\n!!!!! NIVEL 4 !!!!!");
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
			 Marcador+=2000;
			 System.out.println("******************************************************************");
			 System.out.print("!!!!!Respuesta correcta!!!!!");
			 System.out.println("\n!!!!! NIVEL 4 !!!!!");
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
			 Marcador+=2000;
			 System.out.println("******************************************************************");
			 System.out.print("!!!!!Respuesta correcta!!!!!");
			 System.out.println("\n!!!!! NIVEL 4 !!!!!");
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
		 
		 if(respuesta1.equals("D")||respuesta1.equals("d")) {
			 Marcador+=2000;
			 System.out.println("******************************************************************");
			 System.out.print("!!!!!Respuesta correcta!!!!!");
			 System.out.println("\n!!!!! NIVEL 4 !!!!!");
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
		 
		 if(respuesta1.equals("C")||respuesta1.equals("c")) {
			 Marcador+=2000;
			 System.out.println("******************************************************************");
			 System.out.print("!!!!!Respuesta correcta!!!!!");
			 System.out.println("\n!!!!! NIVEL 4 !!!!!");
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
