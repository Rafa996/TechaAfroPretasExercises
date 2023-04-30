package array;

import java.util.Scanner;

public class ExercicioArray3 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
						
		int [][] N1 = new int [4][6];
		int [][] N2 = new int [4][6];
		//int [] N1 = {4,6};
		//int[] N2 = {4,6};
		int somaMatriz[][]= new int[4][6];
		int subMatriz[][]= new int [4][6];
		
		
		for (int i=0; i<4; i++) {
			for (int j=0; j<6; j++) {
		System.out.println("Digite valores para a N1, na posicao ["+i+"]["+j+"]: ");
		N1 [i][j] = input.nextInt(); 
				
			}
		}
		for (int i=0; i<4; i++) {
			for (int j=0; j<6; j++) {
		System.out.println("Agora Digite valores para a N2, na posicao ["+i+"]["+j+"]: ");
		N2 [i][j] = input.nextInt();
			}
		}
		
		for ( int i=0; i<4; i++) {
			for (int j=0; j<6; j++) {
				somaMatriz [i][j]= N1[i][j] + N2[i][j];
				System.out.println("A soma das matrizes na posição ["+i+"]["+j+"]: " +somaMatriz[i][j]);
			}
		}
		for (int i=0; i<4; i++) {
					for (int j=0; j<6; j++) {
				subMatriz [i][j] = N1[i][j] - N2[i][j];
				
				//System.out.println("A soma da Matriz e: "+somaMatriz[i][j]);
				System.out.println("A subtracao das matrizes na posição ["+i+"]["+j+"]: "+subMatriz[i][j]);
					}
				
		}
	}
}
	
		
	


	




