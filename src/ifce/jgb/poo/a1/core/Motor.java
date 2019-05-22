package ifce.jgb.poo.a1.core;

import java.util.Random;

/**
 * Classe Motor Primeira vers�o
 * 
 * @version 1.0
 */
public class Motor {

	/* Vari�veis */
	public int potencia;
	public double oleo;
	public boolean ligado;

	/**
	 * @return true se motor ligado, se n�o retorna false
	 */
	public boolean EstaLigado() {
		return ligado;
	}

	/**
	 * M�todo que liga o motor
	 */
	public boolean Ligar() {
		// Se n�o estiver ligado
		if (!ligado) {
			// Tentar ligar
			boolean tentativa = new Random().nextBoolean();
			if (tentativa) {
				// Se ligou
				ligado = true;
			}
		}

		return ligado;

		// Opcionalmente esta fun��o poderia ser implementada como segue:
		// return (ligado = (ligado || new Random().nextBoolean()));
	}

	/**
	 * M�todo que desliga o motor
	 */
	public boolean Desligar() {
		return ligado = false;
	}
}
