/*Ler quatro valores referentes a quatro notas escolares de um aluno e imprimir uma mensagem
dizendo que o aluno foi aprovado, se o valor da m�dia escolar for maior ou igual a 5. Se o aluno n�o
foi aprovado, indicar uma mensagem informando esta condi��o. Apresentar junto das mensagens o
valor da m�dia do aluno para qualquer condi��o. */

package exercicioApostilaManzano;

import java.util.Scanner;

public class L02C {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
			
		System.out.println("Digite a primeira nota do aluno(a): ");
		double n1 = sc.nextDouble();
		System.out.println("Digite a segunda nota do aluno(a): ");
		double n2 = sc.nextDouble();
		System.out.println("Digite a terceira nota do aluno(a): ");
		double n3 = sc.nextDouble();
		System.out.println("Digite a quarta nota do aluno(a): ");
		double n4 = sc.nextDouble();
		
		double media = (n1+n2+n3+n4)/4;
		
		if (media >= 5) {
			System.out.println("O(A) ALUNO(A) FOI APROVADO(A) COM A M�DIA " + media);
		} else if (media < 5) {
			System.out.println("O(A) ALUNO(A) FOI REPROVADO(A) COM A M�DIA " + media);
		}
		sc.close();
	}

}
