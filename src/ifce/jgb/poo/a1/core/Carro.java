package ifce.jgb.poo.a1.core;

/**
 * Classe Carro Primeira versão
 * 
 * @version 1.0
 */
public class Carro {

	/* Variáveis */
	public String cor;
	public String modelo;
	public Motor motor;

	/**
	 * Método que liga o motor do carro
	 */
	public void Ligar() {
		System.out.println("Ligando o motor:");

		if (motor.EstaLigado()) {
			System.out.println(" > O motor já está ligado");
		} else if (motor.Ligar()) {
			System.out.println(" > Motor ligado");
		} else {
			System.out.println(" > Motor não ligou");
		}
	}

	public void Desligar() {
		System.out.println("Desligando o motor:");

		if (motor.EstaLigado()) {
			if (motor.Desligar()) {
				System.out.println(" > Motor desligado");
			} else {
				System.out.println(" > Motor não desligou");
			}
		} else {
			System.out.println(" > O motor já está desligado");
		}
	}
}
