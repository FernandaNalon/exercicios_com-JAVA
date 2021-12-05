/*Elaborar um programa que efetue a leitura do nome e do sexo de uma pessoa, apresentando com
sa�da uma das seguintes mensagens: "Ilmo Sr.", se o sexo informado como masculino, ou a
mensagem "Ilma Sra.", para o sexo informado como feminino. Apresente tamb�m junto da
mensagem de sauda��o o nome previamente informado.*/

package exercicioApostilaManzano;

import java.util.Scanner;

public class L02L {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite seu nome: ");
		String nome = sc.next();
		System.out.println("Digite seu sexo: [ M ] Masculino ou [ F ] Feminino: ");
		String sexo = sc.next();
		
		if (sexo.equals("M")) {
			System.out.println("Ilmo Sr. " + nome);
		} else if (sexo.equals("F")) {
			System.out.println("Ilma Sra. " + nome);
		}
		sc.close();
	}

}
