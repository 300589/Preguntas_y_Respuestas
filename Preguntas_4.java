package preguntas_y_respuestas;

import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Preguntas_4 extends Preguntas{

	public Preguntas_4(List<String> preguntas, List<String> respuestas) {
		super(preguntas, respuestas);
		
	}
	
public void A�adirPreguntas(List<String> preguntas) {
		
		preguntas.add("4. En la mitolog�a griega, �qui�n mat� a Aquiles?");
		preguntas.add("4. De acuerdo a la Biblia, �cu�ntos a�os vivi� Matusal�n?");
		preguntas.add("4. �Gracias a qu� gan� Albert Einstein el Premio Nobel?");
		preguntas.add("4. �Cu�l es el himno de la Uni�n Europea?");
		preguntas.add("4. �Cu�l es el mineral m�s duro del planeta?");
		
	   }
	
	public void RespuestasC(List<String> respuestas) {
		
		respuestas.add("A.Hector");
		respuestas.add("B.Paris");
		respuestas.add("C.Poseidon");
		respuestas.add("D.Agamenon");
		
		respuestas.add("A. 969 a�os");
		respuestas.add("B. 1200 a�os");
		respuestas.add("C. 2056 a�os");
		respuestas.add("D. 1554 a�os");
		
		respuestas.add("A. Teoria de la relatividad");
		respuestas.add("B. Leyes de Newton");
		respuestas.add("C. ley del efecto fotoel�ctrico");
		respuestas.add("D. Bomba Atomica");
		
		respuestas.add("A. Sche ne vmerla");
		respuestas.add("B. Nkosi Sikelil'iAfrika");
		respuestas.add("C. Oda a la Alegr�a");
		respuestas.add("D. Orientales, la patria o la tumba");
		
		respuestas.add("A. Diamante");
		respuestas.add("B. Esmeralda");
		respuestas.add("C. Carbono");
		respuestas.add("D. Ninguna es correcta");
		
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
		 
		if(respuesta1.equals("B") || respuesta1.equals("b")) {
			 Marcador+=4000;
			 System.out.println("******************************************************************");
			 System.out.print("!!!!!Respuesta correcta!!!!!");
			 System.out.println("\n!!!!! NIVEL 5 !!!!!");
			 System.out.println("Su puntaje ahora es: " + Marcador);
			
		}else if (respuesta1.equals("S") || respuesta1.equals("s")){
			System.out.println("Usted gano: " + Marcador + " Puntos");
			System.out.println("FIN DEL JUEGO");
		 }	else {
			System.out.println("----Respuesta incorrecta----");
			System.out.println("----FIN DEL JUEGO----");
		 }
	  }
	 if(random == preguntas.get(1))	{
		 if(respuesta1.equals("A")||respuesta1.equals("a")) {
			 Marcador+=4000;
			 System.out.println("******************************************************************");
			 System.out.print("!!!!!Respuesta correcta!!!!!");
			 System.out.println("\n!!!!! NIVEL 5 !!!!!");
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
			 Marcador+=4000;
			 System.out.println("******************************************************************");
			 System.out.print("!!!!!Respuesta correcta!!!!!");
			 System.out.println("\n!!!!! NIVEL 5 !!!!!");
			 System.out.println("Su puntaje ahora es: " + Marcador);
		 }else if (respuesta1.equals("S") || respuesta1.equals("s")){
				System.out.println("Usted gano: " + Marcador + " Puntos");
				System.out.println("FIN DEL JUEGO");
			 }	else {
				System.out.println("----Respuesta incorrecta----");
				System.out.println("----FIN DEL JUEGO----");
			 }
	 }
	 if(random == preguntas.get(3))	{
		 
		 if(respuesta1.equals("C")||respuesta1.equals("c")) {
			 Marcador+=4000;
			 System.out.println("******************************************************************");
			 System.out.print("!!!!!Respuesta correcta!!!!!");
			 System.out.println("\n!!!!! NIVEL 5 !!!!!");
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
			 Marcador+=4000;
			 System.out.println("******************************************************************");
			 System.out.print("!!!!!Respuesta correcta!!!!!");
			 System.out.println("\n!!!!! NIVEL 5 !!!!!");
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
