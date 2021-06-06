package array;

import java.util.ArrayList;

/**
 * Array List (Vetor din�mico)
 * 
 * @author Professor Jose de Assis
 * 
 */
public class Array3 {

	public static void main(String[] args) {
		/*
		 * ArrayList � um tipo especial de array que trabalha com objetos variando o
		 * "tamanho" de acordo com o tempo
		 */
		ArrayList<String> lista = new ArrayList<>();
		lista.add("Jos� de Assis");
		lista.add("99999-1234");
		lista.add("joseassis@email.com");
		lista.add("Leandro Ramos");
		lista.add("91234-5678");
		lista.add("leandro@email.com");
		System.out.println(lista);
		System.out.println("Tamanho do Array: " + lista.size());
		System.out.println("�ndice[2]: " + lista.get(2));
		for (int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i));
		}
	}
}
