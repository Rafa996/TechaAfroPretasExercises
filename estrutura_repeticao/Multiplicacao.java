package estrutura_repeticao;

import java.util.Scanner;


public class Multiplicacao {

//4- Obtenha um número digitado pelo usuário e repita a operação de multiplicar 
//ele por três  (imprimindo o novo valor) até que ele seja maior do que 100. 
//Ex.: se o usuário digita 5,  deveremos observar na tela a seguinte sequência: 5 15 45 135.
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
			
		int valor, num = 0;
		System.out.println("Insira um numero:");
		num=input.nextInt();
		
		while(num<=100) {
		num= num*3;
		System.out.println("\nO novo valor e: "+ num);
				
			}
		}
		
		
		
		

	}
