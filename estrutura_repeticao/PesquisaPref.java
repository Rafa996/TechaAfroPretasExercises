package estrutura_repeticao;

import java.util.Scanner;

public class PesquisaPref {
/* 1- A prefeitura de uma cidade fez uma pesquisa entre 3 de seus habitantes, coletando dados sobre o salário e número de filhos. A prefeitura deseja saber:   
	a) média do salário da população; 
	b) média do número de filhos; 
	c) maior salário; 
	d) percentual de pessoas com salário até R$100,00.*/  

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double somaSalario = 0, salario=0, mediaSalario, numFilhos, somaFilhos=0, mediaFilhos, maiorSalario=0;
		int numPessoas=3, percentPessoas=0;
		for(int i=0; i<numPessoas; i++) {

				System.out.print("\nInforme o salario bruto e a quantidade de filhos do "+ (i+1)+ "ro habitante:\n\n"+
				"-Salario: R$");
				salario= input.nextDouble();
				somaSalario= salario+somaSalario;
		
		
				System.out.print("-Quantidade de Filhos: ");
				numFilhos= input.nextDouble();
				somaFilhos= numFilhos+somaFilhos;
				System.out.println("**********************************************");
				
				if (salario>maiorSalario) {
					maiorSalario=salario;
				}
				if(salario<=100) {
					percentPessoas++;
				}
				
		}
		
		System.out.println("\n________Fim do Input de Dados_________");
		
		mediaSalario= somaSalario/3;
		System.out.println("\nA media do salario e: "+ mediaSalario);
		
		mediaFilhos= somaFilhos/3;
		System.out.println("\nA media de filhos e: "+mediaFilhos);
		
		System.out.println("\nO maior salario e: "+maiorSalario);
		System.out.println("\nO percentual de pessoas com salario ate R$100 e: "+(percentPessoas=(percentPessoas*100)/numPessoas)+"%");
		
	}	
	
	
	}


