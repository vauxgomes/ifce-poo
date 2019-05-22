package ifce.jgb.poo.a1;

import ifce.jgb.poo.a1.core.Carro;
import ifce.jgb.poo.a1.core.Motor;

public class Main {

	public static void main (String[] args) {
		
		// Instanciando o motor
		Motor motor = new Motor();
		motor.ligado = false; // Motor desligado
		motor.potencia = 570; // 570 CV
		motor.oleo = 97; // 97%
		
		// Instanciando o carro
		Carro carro = new Carro();
		carro.cor = "vermelho";
		carro.modelo = "SUV";
		carro.motor = motor; // Usando o motor criado anteriormente

		// Ligando o motor
		carro.Ligar();

		// Desligando o motor
		carro.Desligar();
	}
}
