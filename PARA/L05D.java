/*Elaborar um programa que apresente no final o somat�rio dos valores pares existentes na faixa de
1 at� 500.*/

package exercicioApostilaManzano;

public class L05D {
	public static void main(String[] args) {
		
		int soma = 0;
		
		for (int cont = 1; cont <= 500; cont++) {
			if (cont % 2 == 0) {
				soma += cont;
			}
		}
		System.out.println("A somat�ria dos n�meros pares de 1 � 500 �: " + soma + ".");
	}
}
