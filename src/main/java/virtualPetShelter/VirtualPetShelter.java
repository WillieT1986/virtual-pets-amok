package virtualPetShelter;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class VirtualPetShelter {

	public Map<String, VirtualPet> shelterPetDogs = new HashMap<>();
	public Map<String, VirtualPet> shelterPetCats = new HashMap<>();

	public Collection<VirtualPet> cats() {
		return shelterPetCats.values();
	}

	public Collection<VirtualPet> dogs() {
		return shelterPetDogs.values();
	}

	// Return specific Virtual Pet given its name
	public void intake(VirtualPet virtualPet) {
		String newName = virtualPet.getName();
		shelterPetDogs.put(newName, virtualPet);
		// shelterPetCats.put(newName, virtualPet);
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
					+ eachPet.getValue().getWater() + "\t    " + eachPet.getValue().getBoredom() + "\t    "
					+ eachPet.getValue().getWaste() + "\n";
		}
		return petStatus;
	}

	public String option5Display() {
		String option5Display = "";
		for (Entry<String, VirtualPet> eachPet : shelterPetDogs.entrySet()) {
			option5Display += "Name: " + eachPet.getValue().getName() + "\t" + eachPet.getValue().getDescription()
					+ "\n";
		}
		return option5Display;
	}

	public void tickDogs() {
		for (VirtualPet pet : shelterPetDogs.values()) {
			pet.tick();
		}
	}

	public void tickCats() {
		for (VirtualPet pet : shelterPetDogs.values()) {
			pet.tick();
		}
	}

}
