/*Apresentar os resultados das pot�ncias de 3, variando do expoente 0 at� o expoente 15. Deve ser
considerado que qualquer n�mero elevado a zero � 1, e elevado a 1 � ele pr�prio. Observe que
neste exerc�cio n�o pode ser utilizado o operador de exponencia��o do portuguol (^).*/

package exercicioApostilaManzano;

public class L05G {
	public static void main(String[] args) {
		
		int potencia = 1;
		
		for (int expoente = 0; expoente <= 15; expoente++) {
			System.out.println("3 elevado ao expoente: " + expoente + " = " + potencia + ".");
			potencia = potencia * 3;
		}
	}
}
