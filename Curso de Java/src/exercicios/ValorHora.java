package exercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Exercicio
 * 
 * @author Professor Jose de Assis
 *
 */
public class ValorHora {

	public static void main(String[] args) {
		// variaveis
		double remuneracao, custo, hora;
		int cargaHoraria;
		// objetos
		Scanner teclado = new Scanner(System.in);
		DecimalFormat formatador = new DecimalFormat("#0.00");
		// entrada
		System.out.println("C�lculo do valor da hora de servi�o");
		System.out.print("Remunera��o mensal pretendida: ");
		remuneracao = teclado.nextDouble();
		System.out.print("Custo operacional: ");
		custo = teclado.nextDouble();
		System.out.print("Carga hor�ria mensal de trabalho: ");
		cargaHoraria = teclado.nextInt();
		// processamento
		hora = (remuneracao + (0.3 * remuneracao) + custo + (0.2 * remuneracao)) / cargaHoraria;
		// saida
		System.out.println("Valor da hora: " + formatador.format(hora));
		teclado.close();
	}
}
