/*Elaborar um programa que apresente os resultados da soma e da m�dia aritm�tica dos valores
pares situados na faixa num�rica de 50 a 70. */

package exercicioApostilaManzano;

public class L03J {
	public static void main(String[] args) {
		
		int cont = 50;
		int soma = 0;
		int pares = 0;
		
		while (cont <= 70) {
			if (cont % 2 == 0) {
				pares = cont;
				soma = soma + pares;
			}
		cont++;
		}
		int media = soma/11;
		System.out.println("A soma dos valores pars entre 50 e 70 s�o: " + soma);
		System.out.println("A m�dia dos valores pares � igual a: " + media);
	}
}
