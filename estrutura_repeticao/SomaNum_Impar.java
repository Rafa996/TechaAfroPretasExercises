package estrutura_repeticao;

public class SomaNum_Impar {
//2- Desenvolver um sistema que efetue a soma de todos os números ímpares que são 
//múltiplos de três e que se encontram no conjunto dos números de 1 até 500.

	public static void main(String[] args) {
		
		int soma=0, num=500;
		
		for (int i=1; i<=num; i++) {
			 
			if ((i%3)==0 & (i%2)!=0) {
				soma=soma+i;
							
			}
		}
		System.out.println("A soma dos numeros impares multiplos de 3 e: "+ soma);

	}

}
