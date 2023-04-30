package array;

import java.util.Scanner;

public class ExercicioArray4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int [][] M = new int [3][3];
		int soma = 0, somaDiagonal = 0;
		
		for (int i=0; i<M.length; i++) {
			for (int j=0; j<M.length; j++) {
		System.out.println("Digite valores para a matriz, na posicao ["+i+"]["+j+"]: ");
		M [i][j] = input.nextInt();
			}
		}
		for (int i=0; i<M.length; i++) {
			for (int j=0; j<M.length; j++) {
		soma= soma+M[i][j];
		somaDiagonal= M[0][0]+ M[1][1]+ M[2][2];
			}
		}
	System.out.println("\nA soma da matriz é: "+soma);
	System.out.println("\nA soma da diagonal principal é: "+somaDiagonal);
	}
}


