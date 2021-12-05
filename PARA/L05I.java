/*Escreva um programa que apresente a s�rie de Fibonacci at� o d�cimo quinto termo. A s�rie de
Fibonacci � formada pela seq��ncia: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, ..., etc. Esta s�rie se caracteriza
pela soma de um termo atual com o seu anterior subseq�ente, para que seja formado o pr�ximo
valor da seq��ncia. Portanto come�ando com os n�meros 1, 1 o pr�ximo termo � 1+1=2, o pr�ximo
� 1+2=3, o pr�ximo � 2+3=5, o pr�ximo 3+5=8, etc. */

package exercicioApostilaManzano;

public class L05I {
	public static void main(String[] args) {
		
		int n1 = -1;
		int n2 = 1;
		int n3 = 0;
		
		for (int cont = 1; cont <= 15; cont++) {
			n3 = n1+n2;
			n1 = n2;
			n2 = n3;
			System.out.println(n3 + "... ");
		}
		
	}
}
