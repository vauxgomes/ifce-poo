package ifce.jgb.poo.a1.core;

import java.util.Random;

/**
 * Classe Motor Primeira versão
 * 
 * @version 1.0
 */
public class Motor {

	/* Variáveis */
	public int potencia;
	public double oleo;
	public boolean ligado;

	/**
	 * @return true se motor ligado, se não retorna false
	 */
	public boolean EstaLigado() {
		return ligado;
	}

	/**
	 * Método que liga o motor
	 */
	public boolean Ligar() {
		// Se não estiver ligado
		if (!ligado) {
			// Tentar ligar
			boolean tentativa = new Random().nextBoolean();
			if (tentativa) {
				// Se ligou
				ligado = true;
			}
		}

		return ligado;

		// Opcionalmente esta função poderia ser implementada como segue:
		// return (ligado = (ligado || new Random().nextBoolean()));
	}

	/**
	 * Método que desliga o motor
	 */
	public boolean Desligar() {
		return ligado = false;
	}
}
