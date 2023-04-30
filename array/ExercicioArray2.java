package array;

import java.util.Scanner;

public class ExercicioArray2 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		int i, qtCont=0, cont=0; 
		int dado[]= new int [11], somaLanc=0, maiorPont=0;
		double mediaAritmetica=0; 
				
		
		for (i=1; i<dado.length; i++) {
			System.out.println("Insira o " +i+ "o valor do dado: ");
			
			dado [i] = input.nextInt();
			if (dado[i] < 1 || dado [i] > 6) {
			System.out.println("Valor Inválido!! \n"
					+ "Entre com um novo valor: \n");
			dado [i] = input.nextInt();
			}
			else { 
			somaLanc= dado[i]+somaLanc;
				
			if(dado[i] == 6) {
				cont++;
			}
		}
			if (maiorPont < dado[i]) {
					maiorPont = dado[i];
				}
		}
		for (i=0; i<dado.length;i++) {
			if (maiorPont == dado[i]) {
				qtCont++;
			}
			
		}
		mediaAritmetica= somaLanc/10;
		
		System.out.println("\n________RESULTADOS__________\n\nA media Aritmetica e: "+ mediaAritmetica);
		System.out.println("\n O maior lancamento e: " + maiorPont);
		System.out.println("\nO maior ponto foi mostrado " +qtCont+ " vezes.");
		
	}
}

