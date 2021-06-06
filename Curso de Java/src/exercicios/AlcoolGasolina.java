package exercicios;

import java.util.Scanner;

/**
 * Exercicio
 * 
 * @author Professor Jose de Assis
 *
 */
public class AlcoolGasolina {

	public static void main(String[] args) {
		// variaveis
		double alcool, gasolina;
		// objetos
		Scanner teclado = new Scanner(System.in);
		// entrada
		System.out.println("�lcool x Gasolina");
		System.out.print("Digite o valor do �lcool: ");
		alcool = teclado.nextDouble();
		System.out.print("Digite o valor da gasolina: ");
		gasolina = teclado.nextDouble();
		// processamento + saida
		if (alcool < 0.7 * gasolina) {
			System.out.println("ABASTE�A COM �LCOOL");
		} else {
			System.out.println("ABASTE�A COM GASOLINA");
		}
		teclado.close();
	}
}
