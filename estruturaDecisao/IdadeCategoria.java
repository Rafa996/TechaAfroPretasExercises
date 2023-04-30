package estruturaDecisao;

import java.util.Scanner;

public class IdadeCategoria {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int idade;
		System.out.println("Informe a sua idade: ");
		idade= input.nextInt();
		
		if(10<=idade & idade<=14) {
			System.out.println("\nOla! Voce faz parte da categoria Infantil.");
		} 
		else if (15<=idade & idade<=17) {
			System.out.println("\nOla! Voce faz parte da categoria Juvenil.");
		} 
		else if(18<=idade & idade<=25) {
			System.out.println("\nOla! Voce faz parte da categoria Adulto.");
		} else {
			System.out.println("\nOla, estaremos verificando a sua categoria.");
		}

	}

}
