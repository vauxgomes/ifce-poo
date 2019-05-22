package ifce.jgb.poo.a1.core;

/**
 * Classe Carro Primeira vers�o
 * 
 * @version 1.0
 */
public class Carro {

	/* Vari�veis */
	public String cor;
	public String modelo;
	public Motor motor;

	/**
	 * M�todo que liga o motor do carro
	 */
	public void Ligar() {
		System.out.println("Ligando o motor:");

		if (motor.EstaLigado()) {
			System.out.println(" > O motor j� est� ligado");
		} else if (motor.Ligar()) {
			System.out.println(" > Motor ligado");
		} else {
			System.out.println(" > Motor n�o ligou");
		}
	}

	public void Desligar() {
		System.out.println("Desligando o motor:");

		if (motor.EstaLigado()) {
			if (motor.Desligar()) {
				System.out.println(" > Motor desligado");
			} else {
				System.out.println(" > Motor n�o desligou");
			}
		} else {
			System.out.println(" > O motor j� est� desligado");
		}
	}
}
