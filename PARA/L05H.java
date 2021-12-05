/*Elaborar um programa que apresente como resultado o valor de uma pot�ncia de uma base
qualquer elevada a um expoente qualquer, ou seja, de BE
, em que B � o valor da base e E o valor do expoente. Observe que neste exerc�cio 
n�o pode ser utilizado o operador de exponencia��o do portuguol (^).*/

package exercicioApostilaManzano;

import java.util.Scanner;

public class L05H {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in); 
		
		System.out.println("Digite a base a ser multiplicada: ");
		int base = sc.nextInt();
		System.out.println("Digite o expoente que multiplicar�: ");
		int expoente = sc.nextInt();
		
		int resultado = 1;
		
		for (int cont = 1; cont <= expoente; cont++) {
			resultado = resultado * base;
		}
		
		System.out.println("A base " + base + " elevada ao expoente " + expoente + " ser� igual a: " + resultado + ".");
		
		sc.close();
	}
}
