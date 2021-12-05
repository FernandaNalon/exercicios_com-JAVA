/*Elaborar um programa que apresente o resultado inteiro da divis�o de dois n�meros quaisquer.
Para a elabora��o do programa, n�o utilizar em hip�tese alguma o conceito do operador aritm�tico
DIV. A solu��o deve ser alcan�ada com a utiliza��o de looping. Ou seja, o programa deve
apresentar como resultado (quociente) quantas vezes o divisor cabe no dividendo.*/

package exercicioApostilaManzano;

import java.util.Scanner;

public class L04J {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite um n�mero: ");
		int n1 = sc.nextInt();
		System.out.println("Digite outro n�mero: ");
		int n2 = sc.nextInt();
		
		int cont = 0;
		int resultado = 0;
		
		if (n1 > n2) {
			do {
				resultado += n2;
				cont++;
			} while (resultado < n1);
			
			System.out.println("A divis�o inteira do n�mero " + n1 + " pelo n�mero " + n2 + " � igual a: " + cont + ".");	
		
		} else if (n2 > n1) {
			do {
				resultado += n1;
				cont++;
			} while (resultado < n2);
			
			System.out.println("A divis�o inteira do n�mero " + n2 + " pelo n�mero " + n1 + " � igual a: " + cont + ".");
		
		} else {
			System.out.println("O resultado � -1");
		}
		
		sc.close();
	}
}
