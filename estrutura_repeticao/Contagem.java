package estrutura_repeticao;

public class Contagem {
//5- Faça um programa que mostre uma contagem na tela de 233 a 456, 
//só que contando de 3 em 3 quando estiver entre 300 e 400 e de 5 em 5 quando não estiver.
	
	public static void main(String[] args) {
		int i=233;
		
		if (i>=300 & i<=400) {
			do {
			System.out.println(i);
			i=i+3;			
			}
			while (i<=456);
		}
		else {
			do {
			System.out.println(i);
			
			i=i+5;
			}while (i<=456);
			}
		}
}
