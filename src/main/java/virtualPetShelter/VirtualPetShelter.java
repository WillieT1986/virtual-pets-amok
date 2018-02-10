package virtualPetShelter;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class VirtualPetShelter {

	public Map<String, VirtualPet> shelterPets = new HashMap<>();
	// public Map<String, VirtualPet> shelterPetCats = new HashMap<>();
	// public Map<String, RobotPet> shelterPetRobo = new HashMap<>();

	public Collection<VirtualPet> pets() {
		return shelterPets.values();
	}

	// public Collection<VirtualPet> dogs() {
	// return shelterPetDogs.values();
	// }
	//
	// public Collection<VirtualPet> cats() {
	// return shelterPetCats.values();
	// }
	//
	// public Collection<RobotPet> robos() {
	// return shelterPetRobo.values();
	// }

	// Return specific Virtual Pet given its name
	public void intake(VirtualPet virtualPet) {
		String newName = virtualPet.getName();
		shelterPets.put(newName, virtualPet);
		// shelterPetCats.put(newName, virtualPet);
	}

	public VirtualPet findPet(String petName) {
		return shelterPets.get(petName);
	}

	public boolean adopt(String name) {
		shelterPets.remove(name);
		return false;
	}

	public boolean doesPetRemain(String name) {
		return shelterPets.containsKey(name);
	}

	public void feedAll() {
		for (VirtualPet pet : shelterPets.values()) {
			pet.feedPet();
		}
	}

	public void waterAll() {
		for (VirtualPet pet : shelterPets.values()) {
			pet.waterPet();
		}
	}

	public void play(String name) {
		shelterPets.get(name).playPet();
	}

	public void add(VirtualPet pet) {
		shelterPets.put(pet.getName(), pet);
	}

	public String petStatus() {
		String petStatus = "";
		for (Entry<String, VirtualPet> eachPet : shelterPets.entrySet()) {
			petStatus += eachPet.getValue().getName() + "\t " + eachPet.getValue().getHunger() + "\t "
					+ eachPet.getValue().getWater() + "\t " + eachPet.getValue().getBoredom() + "\t "
					+ eachPet.getValue().getWaste() + "\t " + eachPet.getValue().getHappiness() + "\n";
			if (eachPet instanceof Dog) {
				System.out.println((Dog) eachPet);
			} else if (eachPet instanceof Cat) {
				System.out.println((Cat) eachPet);
			}
		}
		return petStatus;
	}

	// public String petStatus() {
	// String petStatus = "";
	// for (Entry<String, VirtualPet> eachPet : shelterPets.entrySet()) {
	// petStatus += eachPet.getValue().getName() + "\t " +
	// eachPet.getValue().getHunger() + "\t "
	// + eachPet.getValue().getWater() + "\t " + eachPet.getValue().getBoredom() +
	// "\t "
	// + eachPet.getValue().getWaste() + "\t " + eachPet.getValue().getHappiness() +
	// "\n";
	// }
	// return petStatus;
	// }

	// public String roboStatus() {
	// String roboStatus = "";
	// for (Entry<String, RobotPet> eachRobo : shelterPetRobo.entrySet()) {
	// roboStatus += eachRobo.getValue().getName() + "\t" +
	// eachRobo.getValue().getDescription() + "\t"
	// + eachRobo.getValue().getOil() + "\t" + eachRobo.getValue().getBatteryLevel()
	// + "\t"
	// + eachRobo.getValue().getHappiness() + "\n";
	// }
	// return roboStatus;
	// }

	public String option5Display() {
		String option5Display = "";
		for (Entry<String, VirtualPet> eachPet : shelterPets.entrySet()) {
			option5Display += "Name: " + eachPet.getValue().getName() + "\t" + eachPet.getValue().getDescription()
					+ "\n";
		}
		return option5Display;
	}

	public void tickDogs() {
		for (VirtualPet pet : shelterPets.values()) {
			pet.tick();
		}
	}

	public void tickCats() {
		for (VirtualPet pet : shelterPets.values()) {
			pet.tick();
		}
	}

}
