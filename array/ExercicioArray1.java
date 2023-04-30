package array;

import java.util.Scanner;

public class ExercicioArray1 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
				 
		int numPontuacao = 5, atividade [] = new int [numPontuacao], maior = (int) atividade[0];
				
		for (int i=1; i <atividade.length; i++) {
			System.out.println("Escreva a " +i+ "ra nota da atividade: ");
			atividade[i] = input.nextInt();
			
			if (atividade[i]>maior) {
				maior = atividade [i];
			}
		
		}
		System.out.println("A maior nota e: " + maior);

}
}
