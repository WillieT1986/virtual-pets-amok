package virtualPetShelter;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class VirtualPetShelter {

	public Map<String, VirtualPet> shelterPetDogs = new HashMap<>();

	public Collection<VirtualPet> pets() {
		return shelterPetDogs.values();
	}

	// Return specific Virtual Pet given its name
	public void intake(VirtualPet virtualPet) {
		String newName = virtualPet.getName();
		shelterPetDogs.put(newName, virtualPet);
	}

	public VirtualPet findPet(String petName) {
		return shelterPetDogs.get(petName);
	}

	public boolean adopt(String name) {
		shelterPetDogs.remove(name);
		return false;
	}

	public boolean doesPetRemain(String name) {
		return shelterPetDogs.containsKey(name);
	}

	public void feedAll() {
		for (VirtualPet pet : shelterPetDogs.values()) {
			pet.feedPet();
		}
	}

	public void waterAll() {
		for (VirtualPet pet : shelterPetDogs.values()) {
			pet.waterPet();
		}
	}

	public void play(String name) {
		shelterPetDogs.get(name).playPet();

	}

	public void add(VirtualPet pet) {
		shelterPetDogs.put(pet.getName(), pet);
	}

	public String petStatus() {
		String petStatus = "";
		for (Entry<String, VirtualPet> eachPet : shelterPetDogs.entrySet()) {
			petStatus += eachPet.getValue().getName() + "\t   " + eachPet.getValue().getHunger() + "\t   "
					+ eachPet.getValue().getWater() + "\t   " + eachPet.getValue().getBoredom() + "\n";
		}
		return petStatus;
	}

	public String option4Display() {
		String option4Display = "";
		for (Entry<String, VirtualPet> eachPet : shelterPetDogs.entrySet()) {
			option4Display += "Name: " + eachPet.getValue().getName() + "\t" + eachPet.getValue().getDescription()
					+ "\n";
		}
		return option4Display;
	}

	public void tickDogs() {
		for (VirtualPet pet : shelterPetDogs.values()) {
			pet.tick();
		}

	}

}
