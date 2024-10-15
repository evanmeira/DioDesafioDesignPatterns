package dio.pets.model;

import dio.pets.strategy.Cacador;
import dio.pets.strategy.Corredor;
import dio.pets.strategy.Saltador;

public class Gato extends Pet implements Cacador, Saltador, Corredor{

	public Gato(String nome, String especie, int idade, String raca, boolean vacinado) {
		super(nome, especie, idade, raca, vacinado);
	}

	@Override
	public void correr() {
		System.out.println("Pet "+ getNome() + " correndo...");		
	}

	@Override
	public void saltar() {
		System.out.println("Pet "+ getNome() + " saltando...");		
	}

	@Override
	public void cacar() {
		System.out.println("Pet "+ getNome() + " caçando...");
	}

}
