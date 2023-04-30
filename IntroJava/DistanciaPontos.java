package IntroJava;

import java.util.Scanner;
import java.lang.Math;

public class DistanciaPontos {

	public static void main(String[] args) {
		//Ex. 4 - Distância entre pontos
		Scanner input = new Scanner(System.in);
		
			double x1, x2, y1, y2, d;
			
			System.out.println ("digite o valor de x1: ");
			x1=input.nextDouble();

			System.out.println ("digite o valor de x2: ");
			x2=input.nextDouble();
			
			System.out.println ("digite o valor de y1: ");
			y1=input.nextDouble(); 

			System.out.println ("digite o valor de y2: ");
			y2=input.nextDouble();

			//d = Mat.raiz((Mat.potencia ((x2-x1),2) + Mat.potencia((y2 - y1),2),2)
			d = Math.sqrt(Math.pow((x2 - x1),2)) + Math.pow((y2-y1),2);

			System.out.println ("O valor da distância é:" + d);
		}

	}


