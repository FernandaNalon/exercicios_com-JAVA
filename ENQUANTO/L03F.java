/*Elaborar um programa que apresente como resultado o valor de uma pot�ncia de uma base
qualquer elevada a um expoente qualquer, ou seja, de BE, em que B � o valor 
da base e E o valor do expoente. Observe que neste exerc�cio n�o pode ser 
utilizado o operador de exponencia��o do portuguol (^).*/

package exercicioApostilaManzano;

import java.util.Scanner;

public class L03F {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Escolha a base que deseja utilizar: ");
		int base = sc.nextInt();
		System.out.println("Escolha o expoente que deseja utilizar: ");
		int expoente = sc.nextInt();
		
		int cont = 0;
		int potencia = 1; // resultado
		
		while (cont < expoente) {
			potencia = potencia * base;
			cont++;
		}
		
		System.out.println("O resultado da base " + base + " elevada ao expoente " + 
		expoente + " = " + potencia);
		
		sc.close();
	}
}
