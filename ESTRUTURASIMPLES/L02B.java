/*Efetuar a leitura de um valor inteiro positivo ou negativo e apresentar o n�mero lido como sendo um
valor positivo, ou seja, o programa dever� apresentar o m�dulo de um n�mero fornecido. Lembre-se
de verificar se o n�mero fornecido � menor que zero; sendo, multiplique-o por -1.*/

package exercicioApostilaManzano;

import java.util.Scanner;

public class L02B {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite um valor: ");
		int valor = sc.nextInt();
		
		if (valor>=0) {
			System.out.println("O modulo de " + valor + " � igual a: " + valor);
		} else if (valor < 0){
			int modulo = valor*(-1);
			System.out.println("O modulo de " + valor + " � igual a: " + modulo);
		}
		sc.close();
	}

}
