package estrutura_repeticao;

import java.util.Scanner;

public class Somatorio {
//3- Elaborar um programa que efetue a leitura sucessiva de valores numéricos 
//e apresente no final o total do somatório, a média e o total de valores lidos.
//O programa deve fazer as leituras dos valores enquanto o usuário estiver fornecendo 
//valores positivos. Ou seja, o programa deve parar quando o usuário fornecer um valor negativo.
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
			
		int i=0, num=0,soma=0, media = 0, totalLido = 0;
				
		while(num>=0) {
			
		System.out.println("Insira um numero:");
		num=input.nextInt();	
			if(num>=0) {
				i++;
				soma=num+soma;
				totalLido=i;
				media=soma/i;
			}
		}
		System.out.println("\nNumeros lidos: "+ totalLido);
		System.out.println("\nA media e: "+ media);
		System.out.println("\nA soma e: "+ soma);
		
		
		

	}

}
