package preguntas_y_respuestas;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

   public class Preguntas {
	   String random="";
	   static int Marcador;
	  	
	   
	public Preguntas(List<String> preguntas,List<String> respuestas) {
		super();
		
		
	}

	public void AñadirPreguntas(List<String> preguntas) { // Metodo para añadir preguntas al Array list
		
		preguntas.add("1. Quien conquisto a america");
		preguntas.add("1. 2 + 2 es igual a");
		preguntas.add("1. Cual es el color del mar");
		preguntas.add("1. Cuanto es 5 al cuadrado");
		preguntas.add("1. de que color son las hojas del arbol");
		
	   }
	
	public void RespuestasC(List<String> respuestas) { //Metodo para añadir respuestas al array list 
		
		respuestas.add("A.Colon");
		respuestas.add("B.Juan");
		respuestas.add("C.Antonio");
		respuestas.add("D.Estela");
		
		respuestas.add("A. 10");
		respuestas.add("B. 4");
		respuestas.add("C. 15");
		respuestas.add("D. 20");
		
		respuestas.add("A. Rojo");
		respuestas.add("B. Naranja");
		respuestas.add("C. Azul");
		respuestas.add("D. Verde");
		
		respuestas.add("A. 30");
		respuestas.add("B. 45");
		respuestas.add("C. 10");
		respuestas.add("D. 25");
		
		respuestas.add("A. Rojas");
		respuestas.add("B. Grises");
		respuestas.add("C. Blancas");
		respuestas.add("D. Verdes");
		
	}
	
	public void escojerpregunta(List<String> preguntas, List<String> respuestas) { // Este metodo escoge una prenta aleatoria he imprime sus posibles respuestas
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
	
	public void verificar_respuesta(List<String> preguntas,List<String> respuestas) { // Este metodo verifica si la respuesta ingresada es la correcta de ser correcta el juego continua si no finaliza y si se quiere retirar lo puede hacer
		Scanner op = new Scanner(System.in);
		System.out.println("\nDigita tu respuesta o pulsa S Para retirarse: ");
		
		String respuesta1 = op.nextLine();
		
	 if(random == preguntas.get(0)) {	
		 
		if(respuesta1.equals("A") || respuesta1.equals("a")) {
			Marcador+=1000;
			System.out.println("******************************************************************");
			System.out.println("!!!!!Respuesta correcta!!!!!");
			System.out.println("\n!!!!! NIVEL 2 !!!!!");
			System.out.println("Su puntaje ahora es: " + Marcador);
			
		}	else if(respuesta1.equals("S") || respuesta1.equals("s")){
			System.out.println("Usted gano: "+Marcador+" Puntos");
			System.out.println("FIN DEL JUEGO");
		}	else {
			System.out.println("----Respuesta incorrecta----");
			System.out.println("FIN DEL JUEGO");
			}
	  }
	 if(random == preguntas.get(1))	{
		 if(respuesta1.equals("B")||respuesta1.equals("b")) {
			Marcador+=1000;
			System.out.println("******************************************************************");
			System.out.print("!!!!!Respuesta correcta!!!!!");
			System.out.println("\n!!!!! NIVEL 2 !!!!!");
			System.out.println("Su puntaje ahora es: " + Marcador);
		 }	else if (respuesta1.equals("S") || respuesta1.equals("s")){
			System.out.println("Usted gano: " + Marcador + " Puntos");
			System.out.println("FIN DEL JUEGO");
		 }	else {
			System.out.println("----Respuesta incorrecta----");
			System.out.println("FIN DEL JUEGO");
		 }
	 }
	 if(random == preguntas.get(2))	{
		 
		 if(respuesta1.equals("C")||respuesta1.equals("c")) {
			 Marcador+=1000;
			 System.out.println("******************************************************************");
			 System.out.print("!!!!!Respuesta correcta!!!!!");
			 System.out.println("\n!!!!! NIVEL 2 !!!!!");
			 System.out.println("Su puntaje ahora es: " + Marcador);
		 }	else if(respuesta1.equals("S") || respuesta1.equals("s")){
			 System.out.println("Usted gano: " + Marcador + " Puntos");
			 System.out.println("FIN DEL JUEGO");
		 }	else {
			 System.out.println("----Respuesta incorrecta----");
			 System.out.println("FIN DEL JUEGO");
		 }
	 }
	 if(random == preguntas.get(3))	{
		 
		 if(respuesta1.equals("D")||respuesta1.equals("d")) {
			 Marcador+=1000;
			 System.out.println("******************************************************************");
			 System.out.print("!!!!!Respuesta correcta!!!!!");
			 System.out.println("\n!!!!! NIVEL 2 !!!!!");
			 System.out.println("Su puntaje ahora es: " + Marcador);
		 }else if(respuesta1.equals("S") || respuesta1.equals("s")){
			 System.out.println("Usted gano: " + Marcador + " Puntos");
			 System.out.println("FIN DEL JUEGO");
		 }else {
			 System.out.println("----Respuesta incorrecta----");
			 System.out.println("FIN DEL JUEGO");
		 }
	 }
	 if(random == preguntas.get(4))	{
		 
		 if(respuesta1.equals("D")||respuesta1.equals("d")) {
			 Marcador+=1000;
			 System.out.println("******************************************************************");
			 System.out.print("!!!!!Respuesta correcta!!!!!");
			 System.out.println("\n!!!!! NIVEL 2 !!!!!");
			 System.out.println("Su puntaje ahora es: " + Marcador);
		 }else if(respuesta1.equals("S") || respuesta1.equals("s")){
			 System.out.println("Usted gano: " + Marcador + " Puntos");
			 System.out.println("FIN DEL JUEGO");
		 }else {
			 System.out.println("----Respuesta incorrecta----");
			 System.out.println("FIN DEL JUEGO");
		 }
	 }
	 
	 
	
	 
	 
	 
	 }

	public int getMarcador() {
		return Marcador;
	}

	public void setMarcador(int marcador) {
		Marcador = marcador;
	}
	
	// Nota : las de mas clases cumplen los mismo metodos explicados anteriormente 
 }
 
	
		
	
	

	
	


   


