package IntroJava;

import java.util.Scanner;

public class MediaAluno {

	public static void main(String[] args) {
		//Ex. 3 - Calcula Média
		Scanner input = new Scanner(System.in);
		double N1, N2, N3, media, p1=2, p2=3, p3=5;
		
		System.out.println("Insira a nota n1 do aluno:\n");
		N1=input.nextDouble();
		
		System.out.println("Insira a nota n2 do aluno:\n");
		N2=input.nextDouble();
		
		System.out.println("Insira a nota n3 do aluno:\n");
		N3=input.nextDouble();
			
		media= ((N1*p1 + N2*p2 + N3*p3)/(p1+p2+p3));

		System.out.println("A media do aluno e: " + media);
			
	}

}
