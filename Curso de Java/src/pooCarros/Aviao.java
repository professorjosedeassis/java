package pooCarros;

public class Aviao extends Carro{
	//atributo
	double envergadura;
	//metodo
	void aterrizar() {
		System.out.println("Avi�o pousou.");
	}
	//polimorfismo (reescrever o metodo acelerar da classe Carro)
	void acelerar() {
		System.out.println("Avi�o decolou.......");
	}
}
