/*Elaborar um programa que efetue a leitura de um n�mero inteiro e apresentar uma mensagem
informando se o n�mero � par ou �mpar. */

package exercicioApostilaManzano;

import java.util.Scanner;

public class L02I {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
			
		System.out.println("Digite um n�mero: ");
		int num = sc.nextInt();
		
		if (num % 2 == 0) {
			System.out.println("O n�mero � par!");
		} else if (num % 2 == 1) {
			System.out.println("O n�mero � impar!");
		}
		sc.close();
	}

}
