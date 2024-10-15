package dio.pets.main;

import dio.pets.facade.PetVice;
import dio.pets.model.Cachorro;
import dio.pets.model.Gato;

public class Main {

	public static void main(String[] args) {
		Cachorro cachorro = new Cachorro("Thor", "Cachorro", 5, "Shih Tzu", false);
		PetVice petvice = new PetVice(cachorro);
		
		petvice.fazerCacar();
		petvice.fazerCorrer();
		petvice.fazerPular();
		
		Gato gato = new Gato("Orfeu", "Gato", 2, "Siamês", true);
		petvice = new PetVice(gato);
		
		petvice.fazerCacar();
		petvice.fazerCorrer();
		petvice.fazerPular();

	}

}
