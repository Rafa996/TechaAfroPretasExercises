package estruturaDecisao;

import java.util.Scanner;

public class OrdemCrescente {

	public static void main(String[] args) {
		//1. Programa recebe 3 números inteiros e retorna em ordem crescente.
		
				Scanner input = new Scanner(System.in);
				int n1, n2, n3; //Declaração de variáveis
				
				//Input dos dados pelo usuário
				System.out.println("Insira tres numeros inteiros a seguir: \n1o:");
				n1=input.nextInt();
				
				System.out.println("\n2o:");
				n2=input.nextInt();
				
				System.out.println("\n3o:");
				n3=input.nextInt();
				
				//Condição de decisão
				if (n1>n2 & n1>n3 & n2>n3) {
					System.out.println("A ordem dos números apresentados são:\nn3: "+ n3 +"\nn2: "+ n2 +"\nn1: "+n1);
					}
					else if (n1>n3 & n1>n2 & n3>n2) {
					
						 System.out.println("\nA ordem dos números apresentados são:\nn2: "+ n2 +"\nn3: "+n3+"\nn1: "+ n1); 
						}
					else if (n2>n1 & n2>n3 & n1>n3) {
						System.out.println("\nA ordem dos números apresentados são:\nn3: "+ n3 +"\nn1: "+ n1+"\nn2: "+n2);
					}
					else if (n2>n1 & n2>n3 & n1<n3) {
						System.out.println("\nA ordem dos números apresentados são:\nn1: "+ n1 +"\nn3: "+ n3+"\nn2: "+ n2);
						
					}
					else if (n3>n2 & n3>n1 & n1>n2) {
						System.out.println("\nA ordem dos números apresentados são:\nn2: "+ n2+"\nn1: " + n1+"\nn3: "+ n3);
					}else {	
					
				System.out.println("A ordem dos números apresentados são:\nn1: "+ n1+ "\nn2:"+ n2+ "\nn3:"+ n3);
				
				}
				
			}

		}