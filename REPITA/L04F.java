/*Elaborar um programa que efetue a leitura sucessiva de valores num�ricos e apresente no final o
total do somat�rio, a m�dia aritm�tica e o total de valores lidos. O programa deve fazer as leituras
dos valores enquanto o usu�rio estiver fornecendo valores positivos. Ou seja, o programa deve
parar quando o usu�rio fornecer um valor negativo. N�o se esque�a que o usu�rio pode entrar
como primeiro n�mero um n�mero negativo, portanto, cuidado com a divis�o por zero no c�lculo da
m�dia. */

package exercicioApostilaManzano;

import java.util.Scanner;

public class L04F {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int num = 0;
		int soma = 0;
		int cont2 = 0;
		float media = 1;
		
		do {
			System.out.println("Digite um valor: ");
			num = sc.nextInt();
			soma += num;
			cont2++;
			media = soma/cont2;
		} while (num >= 0);
		
			
			System.out.println("O somat�rio de todos os n�meros digitados �: " + soma + ".");
			System.out.println("O programa foi executado " + cont2 + " vezes.");
			System.out.println("A m�dia aritm�tica dos valores digitados foi de: " + media + ".");
		
		
		sc.close();
	}
}
