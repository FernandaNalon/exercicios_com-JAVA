/* Apresentar os resultados das pot�ncias de 3, variando do expoente 0 at� o expoente 15. Deve ser
considerado que qualquer n�mero elevado a zero � 1, e elevado a 1 � ele pr�prio. 
Observe queneste exerc�cio n�o pode ser utilizado o operador de 
exponencia��o do portuguol (^).*/

package exercicioApostilaManzano;

public class L03E {
	public static void main(String[] args) {
		
		int resultado = 1;
		int expoente = 0; 
		
		while (expoente <= 15) {
			System.out.println("O n�mero 3 elevado � " + expoente + " = " + resultado);
			resultado = resultado * 3;
			expoente++;
		}
	}
}
