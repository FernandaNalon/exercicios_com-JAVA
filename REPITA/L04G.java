/*Elaborar um programa que apresente como resultado o valor do fatorial dos valores �mpares
situados na faixa num�rica de 1 a 10. */

package exercicioApostilaManzano;

public class L04G {
	public static void main(String[] args) {
		
		int cont = 1;
		
		do {
			if (cont % 2 == 1) {
				int num = cont;
				int fat = 1;
				int contador = 0;
				do {
					fat += fat * contador;
					contador++;
				} while (contador < num);
				System.out.println("O fatorial do n�mero " + num + " � igual a: " + fat + ". ");
			}
		cont++;
		} while (cont <= 10);
	}
}
