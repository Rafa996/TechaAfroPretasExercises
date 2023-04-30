package estrutura_repeticao;

import java.util.Scanner;

public class Soma2 {
//6- Faça um programa que pegue um número do teclado e calcule a soma de todos os números 
//de 1 até ele. Ex.: o usuário entra 7, o programa vai mostrar 28, pois  1+2+3+4+5+6+7=28
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int soma=0, num, i=1;
		
		System.out.println("Insira um numero: ");
		num=teclado.nextInt();
		
		do {
			soma=soma+i;
			i++;
		} while (i<=num);
		
		System.out.println("A soma dos numeros ate "+num+ " e: "+soma);
		
	}

}
