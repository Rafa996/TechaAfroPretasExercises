package IntroJava;

import java.util.Scanner;

public class EventFabrica {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
				;
		int seg, min, horas;
		
		System.out.println("Informe o tempo de operaçao em segundos: ");
		seg = leia.nextInt();
		
		min=seg/60;
		horas=seg/3600;
		
		System.out.println("O tempo em minutos e: " + min + " min"+"\n\nO tempo em horas e: "+ horas+ "h"+ "\n\nO tempo em segundos e: " + seg +"seg");
				
	}

}
