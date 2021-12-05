/*Efetuar a leitura de tr�s valores (vari�veis A, B e C) e efetuar o c�lculo da equa��o completa de
segundo grau, apresentando as duas ra�zes, se para os valores informados for poss�vel efetuar o
referido c�lculo. Lembre-se de que a vari�vel A deve ser diferente de zero.*/

package exercicioApostilaManzano;

import java.util.Scanner;

public class L02E {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
			
		System.out.println("Digite o valor de A: ");
		double a = sc.nextDouble();
		System.out.println("Digite o valor de B: ");
		double b = sc.nextDouble();
		System.out.println("Digite o valor de C: ");
		double c = sc.nextDouble();
		
		double delta = ((b*b)-(4*a*c));
		
		if (delta >= 0) {
			double x = ((-b + (Math.sqrt (delta)) )/(2*a));
			System.out.println("O valor de X �: " + x);
		} else {
			System.out.println("Delta inv�lido!");
		}
		sc.close();
	}
}




// Math.sqrt(variavel ou pr�prio n�mero);