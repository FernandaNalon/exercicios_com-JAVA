/*Elaborar um programa que possibilite calcular a �rea total de uma resid�ncia (sala, cozinha,
banheiro, quartos, �rea de servi�o, quintal, garagem, etc.). O programa deve solicitar a entrada do
nome, a largura e o comprimento de um determinado c�modo. Em seguida, deve apresentar a �rea
do c�modo lido e tamb�m uma mensagem solicitando do usu�rio a confirma��o de continuar
calculando novos c�modos. Caso o usu�rio responda �NAO�, o programa deve apresentar o valor
total acumulado da �rea residencial.*/

package exercicioApostilaManzano;

import java.util.Scanner;

public class L04H {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		String resposta = "SIM";
		float areaTotal = 0;
		
		do {
			System.out.println("Digite o c�modo da casa: ");
			String comodo = sc.next();
			System.out.println("Digite a largura do c�modo: ");
			double largura = sc.nextDouble();
			System.out.println("Digite a comprimento do c�modo: ");
			double comprimento = sc.nextDouble();
			double area = largura*comprimento;
			System.out.println("A �rea do c�modo: " + comodo + " � de: " + area + "m�");
			areaTotal += area;
			System.out.println("Deseja continuar calculando as �reas dos c�modos? [ SIM ] ou [ NAO ] ");
			resposta = sc.next();
		} while (resposta == "SIM");
		
		System.out.println("A �rea total da resid�ncia �: " + areaTotal + "m�");
		
		sc.close();
	}
}
