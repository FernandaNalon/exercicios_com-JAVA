/*Elaborar um programa que efetue a leitura de 10 valores num�ricos e apresente no final o total do
somat�rio e a m�dia aritm�tica dos valores lidos. */

package exercicioApostilaManzano;

import java.util.Scanner;

public class L03I {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int cont = 1;
		int soma = 0;
		
		while (cont <= 10 ) {
			System.out.println("Digite um valor: ");
			int valor = sc.nextInt();
			soma = soma + valor;
			cont++;
		}
		
		int media = soma/10;
		System.out.println("A soma dos valores digitados foi " + soma);
		System.out.println("A m�dia aritm�tica dos valores � igual a: " + media);
		
	sc.close();
	}
}
