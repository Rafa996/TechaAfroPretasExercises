package estruturaDecisao;

import java.util.Scanner;

public class NumeroMaior {

	public static void main(String[] args) {
		//1. Programa recebe 3 números inteiros e retorna maior número.
		
		Scanner input = new Scanner(System.in);
		int n1, n2, n3;
		
		System.out.println("Insira tres numeros inteiros a seguir: \n1o:");
		n1=input.nextInt();
		
		System.out.println("\n2o:");
		n2=input.nextInt();
		
		System.out.println("\n3o:");
		n3=input.nextInt();
		
		if (n1>n2 & n1>n3) {
			System.out.println("\nO maior numero e: "+ n1);
			}
			else if (n2>n3 & n2>n1) {
			
				 System.out.println("\nO maior numero e: "+ n2); 
				}
			else {			 
	
			System.out.println("\nO maior numero e: "+ n3);
		}
		
	}

}
