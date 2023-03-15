package Tema_2;

import java.util.*;

public class switchbreak {

	public static void main(String[] args) {
int nota;
		
		Scanner curso = new Scanner (System.in);
			System.out.println("Pon tu nota");
			nota = curso.nextInt();
		
		switch (nota) {
		   case 0,1,2,3,4 : {
			   System.out.println("Has suspendido.");
			   System.out.println("Animo...");
			}
		   break;
		   case 5: 
		   System.out.println("Has aprobado.");
		   break;
		   case 6 :
		   System.out.println("Bien.");
		   break;
		   case 7, 8 :
		   System.out.println("Notable.");
		   break;
		   case 9, 10 :{
		   System.out.println("Sobresaliente.");
		   System.out.println("Enhorabuena.");
		   }
		   break;
		default :{
		System.out.println("Nota incorrecta");
		break;
		
		
		}
		}
	curso.close();
	}
	
}

	

