/*Elaborar um programa que efetue a leitura de um determinado valor inteiro, e efetue a sua
apresenta��o, caso o valor n�o seja maior que tr�s. */

package exercicioApostilaManzano;

import java.util.Scanner;

public class L02K {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite um valor: ");
		int num = sc.nextInt();
		
		if (num <= 3) {
			System.out.println("N�mero: " + num);
		} else {
			System.out.println("Tente novamente!");
		}
		sc.close();
	}
}
