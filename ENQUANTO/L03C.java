/*Elaborar um programa que apresente no final o somat�rio dos valores pares existentes na faixa de
1 at� 500.*/

package exercicioApostilaManzano;

public class L03C {
	public static void main(String[] args) {
		
		int cont = 0;
		int pares = 0;
		
		while (cont <= 500) {
			if (cont % 2 == 0) { 
				pares += cont; 
			}
			cont++;
		}
		System.out.println(pares);
	}
}
