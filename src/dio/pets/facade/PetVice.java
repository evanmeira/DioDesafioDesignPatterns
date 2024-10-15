package dio.pets.facade;

import dio.pets.model.Pet;
import dio.pets.singleton.PetService;
import dio.pets.strategy.Cacador;
import dio.pets.strategy.Corredor;
import dio.pets.strategy.Saltador;

/**
 * Pet Device
 */
public class PetVice {
	
	private PetService petService;
	
	public PetVice(Pet pet) {
		petService = PetService.getPetService();
		if(pet != null) {
			petService.setPet(pet);
		}		
	}
	
	public void fazerCorrer() {
		try {
			Corredor pet = (Corredor) petService.getPet();
			pet.correr();
		}catch(Exception e) {
			
		}		
	}
	
	public void fazerPular() {
		try {
			Saltador pet = (Saltador) petService.getPet();
			pet.saltar();
		}catch(Exception e) {
			
		}		
	}
	
	public void fazerCacar() {
		try {
			Cacador pet = (Cacador) petService.getPet();
			pet.cacar();
		}catch(Exception e) {
			
		}		
	}

}
