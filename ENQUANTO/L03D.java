/*Apresentar todos os valores num�ricos inteiros �mpares situados na faixa de 0 a 20. Para verificar
se o n�mero � �mpar, efetuar dentro da malha a verifica��o l�gica desta condi��o com a instru��o
se, perguntando se o n�mero � �mpar; sendo, mostre-o; n�o sendo, passe para o pr�ximo passo.*/

package exercicioApostilaManzano;

public class L03D {
	public static void main(String[] args) {
		
		int cont = 0;
		int impares = 0;
		
		while (cont <= 20) {
			if (cont % 2 == 1) {
				impares = cont;
				System.out.println(impares);
			}
			cont++;
		}
	}
}
