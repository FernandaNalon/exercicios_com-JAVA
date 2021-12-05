/* Escreva um programa que apresente a s�rie de Fibonacci at� o d�cimo quinto termo. A s�rie de
Fibonacci � formada pela seq��ncia: 1, 1, 2, 3, 5, 8, 13, 21, 34, ..., etc. Esta s�rie se caracteriza
pela soma de um termo atual com o seu anterior subseq�ente, para que seja formado o pr�ximo
valor da seq��ncia. Portanto come�ando com os n�meros 1, 1 o pr�ximo termo � 1+1=2, o pr�ximo
� 1+2=3, o pr�ximo � 2+3=5, o pr�ximo 3+5=8, etc. */

package exercicioApostilaManzano;

public class L03G {
	public static void main(String[] args) {
		System.out.println("SEQUENCIA DE FIBONACCI");
		
		int cont = 0;
		int num1 = -1;
		int num2 = 1;
		int num3;
		
		while (cont <= 15) {
			num3 = num2 + num1;
			num1 = num2;
			num2 = num3;
			System.out.print(num3 + "... ");
			cont++;
		}
	}
}
