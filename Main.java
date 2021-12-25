package preguntas_y_respuestas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import static preguntas_y_respuestas.Historico.*;
public class Main {
	
	static String nombre="";
	
	public static void main(String args[]) {
	       
		   Scanner op = new Scanner(System.in);
		   int Marcador=0;
		   List<String> preguntas = new ArrayList();
		   List<String> respuestas = new ArrayList();
		   
		   System.out.println("************************************");
		   System.out.println("************************************");
		   System.out.println("PREGUNTAS Y RESPUESTAS");
		   System.out.println("************************************");
		   System.out.println("************************************");
		   
		   System.out.println("\nDigite nomnbre y apellido: ");
		   nombre = op.nextLine();
		  
		   creaArchivo("Historico.txt");// Este metodo solo crea el archivo(Una vez creado ya no debe ser usado )
		   
		   Preguntas obj = new Preguntas(preguntas, respuestas);
		   obj.AñadirPreguntas(preguntas);
		   obj.RespuestasC(respuestas);
		   obj.escojerpregunta(preguntas,respuestas);
		   obj.verificar_respuesta(preguntas,respuestas);
		   
		   preguntas.clear();
		   respuestas.clear();
		   System.out.println("******************************************************************");
		   
		   Marcador=obj.getMarcador();
		   
		   if(Marcador==1000) {
			   Preguntas_2 obj1 = new Preguntas_2(preguntas,respuestas);
			   obj1.AñadirPreguntas(preguntas);
			   obj1.RespuestasC(respuestas);
			   obj1.escojerpregunta(preguntas,respuestas);
			   obj1.verificar_respuesta(preguntas,respuestas);
			   
		   }
		   
		   preguntas.clear();
		   respuestas.clear();
		   System.out.println("******************************************************************");
		   
		   Marcador=obj.getMarcador();
		   
		   if (Marcador==2000) {
			   Preguntas_3 obj2 = new Preguntas_3(preguntas,respuestas);
			   obj2.AñadirPreguntas(preguntas);
			   obj2.RespuestasC(respuestas);
			   obj2.escojerpregunta(preguntas,respuestas);
			   obj2.verificar_respuesta(preguntas,respuestas);
		   }
		   preguntas.clear();
		   respuestas.clear();
		   System.out.println("******************************************************************");
		   
		   Marcador=obj.getMarcador();
		   
		   if (Marcador==4000) {
			   Preguntas_4 obj3 = new Preguntas_4(preguntas,respuestas);
			   obj3.AñadirPreguntas(preguntas);
			   obj3.RespuestasC(respuestas);
			   obj3.escojerpregunta(preguntas,respuestas);
			   obj3.verificar_respuesta(preguntas,respuestas);
		   }
		   
		   preguntas.clear();
		   respuestas.clear();
		   System.out.println("******************************************************************");
		   
		   Marcador=obj.getMarcador();
		   
		   if (Marcador==8000) {
			   Preguntas_5 obj4 = new Preguntas_5(preguntas,respuestas);
			   obj4.AñadirPreguntas(preguntas);
			   obj4.RespuestasC(respuestas);
			   obj4.escojerpregunta(preguntas,respuestas);
			   obj4.verificar_respuesta(preguntas,respuestas);
		   }
		   
		   escribirArchivo("C:\\Archivo\\Hitorico.txt" , nombre);
		   
		   
		 

	}
}