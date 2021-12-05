/*Apresentar o total da soma obtida dos cem primeiros 
 * números inteiros (1+2+3+4+...+98+99+100).  */

package exercicioApostilaManzano;

public class L03B {
	public static void main(String[] args) {
		
		int cont = 0;
		int acum = 0;
		
		while (cont <= 100) {
			acum = cont+acum;
			cont++;
		}
	System.out.println(acum);
	}
}
