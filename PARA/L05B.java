/*Apresentar os resultados de uma tabuada de multiplicar (de 1 at� 10) de um n�mero qualquer*/

package exercicioApostilaManzano;

import java.util.Scanner;

public class L05B {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite um n�mero: ");
		int num = sc.nextInt();
		
		int tabuada = 0;
		
		for (int cont = 1; cont <= 10; cont++) {
			tabuada = cont * num;
			System.out.println(cont + " X " + num + " = " + tabuada);
		}
		
		sc.close();
	}

}
