package IntroJava;

import java.util.Scanner;

public class LeIdade {

	public static void main(String[] args) {
		//Lê idade fornecida em dias
		Scanner input = new Scanner(System.in);
		
		double anos, meses, dias, idade;
		
		System.out.println("Digite a sua idade em dias: ");
		idade=input.nextInt();
		
		anos=idade/365;
		dias= anos%365;
		meses= dias/30;
		
		System.out.println("\nVoce tem: " + anos + " anos " + meses + " meses e " + dias + " dias de idade");
		
		
	}

}
