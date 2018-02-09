package virtualPetShelter;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class VirtualPetShelter {

	public Map<String, VirtualPet> shelterPetDog = new HashMap<>();

	public Collection<VirtualPet> pets() {
		return shelterPetDog.values();
	}

	// Return specific Virtual Pet given its name
	public void intake(VirtualPet virtualPet) {
		String newName = virtualPet.getName();
		shelterPetDog.put(newName, virtualPet);
	}

	public VirtualPet findPet(String petName) {
		return shelterPetDog.get(petName);
	}

	public boolean adopt(String name) {
		shelterPetDog.remove(name);
		return false;
	}

	public boolean doesPetRemain(String name) {
		return shelterPetDog.containsKey(name);
	}

	public void feedAll() {
		for (VirtualPet pet : shelterPetDog.values()) {
			pet.feedPet();
		}
	}

	public void waterAll() {
		for (VirtualPet pet : shelterPetDog.values()) {
			pet.waterPet();
		}
	}

	public void play(String name) {
		shelterPetDog.get(name).playPet();

	}

	public void add(VirtualPet pet) {
		shelterPetDog.put(pet.getName(), pet);
	}

	public String petStatus() {
		String petStatus = "";
		for (Entry<String, VirtualPet> eachPet : shelterPetDog.entrySet()) {
			petStatus += eachPet.getValue().getName() + "\t   " + eachPet.getValue().getHunger() + "\t   "
					+ eachPet.getValue().getWater() + "\t   " + eachPet.getValue().getBoredom() + "\n";
		}
		return petStatus;
	}

	public String option4Display() {
		String option4Display = "";
		for (Entry<String, VirtualPet> eachPet : shelterPetDog.entrySet()) {
			option4Display += "Name: " + eachPet.getValue().getName() + "\t" + eachPet.getValue().getDescription()
					+ "\n";
		}
		return option4Display;
	}

	public void tickDogs() {
		for (VirtualPet pet : shelterPetDog.values()) {
			pet.tick();
		}

	}

}
