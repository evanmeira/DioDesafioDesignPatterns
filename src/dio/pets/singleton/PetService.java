package dio.pets.singleton;

import dio.pets.model.Pet;

public final class PetService {
	
	private static PetService petService = new PetService();
	
	private Pet pet;
	
	private PetService() {
		
	}
	
	public static PetService getPetService() {
		return petService;
	}
	
	public void setPet(Pet pet) {
		this.pet = pet;
	}

	public Pet getPet() {
		return pet;
	}
	
}
