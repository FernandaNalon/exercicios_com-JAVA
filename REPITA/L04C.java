/*Apresentar todos os n�meros divis�veis por 4 que sejam menores que 200. Para verificar se o
n�mero � divis�vel por 4, efetuar dentro da malha a verifica��o l�gica desta condi��o com a
instru��o se, perguntando se o n�mero � divis�vel; sendo, mostre-o; n�o sendo, passe para o
pr�ximo passo. A vari�vel que controlar� o contador deve ser iniciada com o valor 1. */

package exercicioApostilaManzano;

public class L04C {
	public static void main(String[] args) {
		
		int cont = 1;
		int div = 0;
		
		do {
			if ( cont % 4 == 0) {
				div = cont;
				System.out.println(div + "... ");
			}
		cont++;
		} while (cont <= 200);
		
	}
}
