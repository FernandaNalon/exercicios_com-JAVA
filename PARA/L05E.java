/*Apresentar todos os valores num�ricos inteiros �mpares situados na faixa de 0 a 20. Para verificar
se o n�mero � �mpar, efetuar dentro da malha a verifica��o l�gica desta condi��o com a instru��o
se, perguntando se o n�mero � �mpar; sendo, mostre-o; n�o sendo, passe para o pr�ximo passo. */

package exercicioApostilaManzano;

public class L05E {
	public static void main(String[] args) {
		int impar = 0;
		
		for (int cont = 1; cont <= 20; cont++) {
			if (cont % 2 == 1) {
				impar = cont;
				System.out.println(impar);
			}
		}
	}
}
