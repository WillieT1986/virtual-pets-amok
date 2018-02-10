package virtualPetShelter;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class VirtualPetShelter {

	public Map<String, VirtualPet> shelterPets = new HashMap<>();
	public Map<String, RobotPet> shelterRoboPets = new HashMap<>();

	public Collection<VirtualPet> pets() {
		return shelterPets.values();
	}

	public Collection<RobotPet> roboPets() {
		return shelterRoboPets.values();
	}

	// Return specific Virtual Pet given its name
	public void intake(VirtualPet virtualPet) {
		String newName = virtualPet.getName();
		shelterPets.put(newName, virtualPet);
		// intake ROBO PETS HERE???
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

	public String dogStatus() {
		String dogStatus = "";
		for (VirtualPet eachPet : shelterPets.values())
			if (eachPet instanceof Dog) {
				dogStatus += eachPet.getName() + "\t   " + eachPet.getHunger() + "\t   " + eachPet.getWater() + "\t   "
						+ eachPet.getBoredom() + "\t    " + eachPet.getWaste() + "\t     " + eachPet.getHappiness()
						+ "\n";
			}
		return dogStatus;
	}

	public String catStatus() {
		String catStatus = "";
		for (VirtualPet eachPet : shelterPets.values())
			if (eachPet instanceof Cat) {
				catStatus += eachPet.getName() + "\t   " + eachPet.getHunger() + "\t   " + eachPet.getWater() + "\t   "
						+ eachPet.getBoredom() + "\t    " + eachPet.getWaste() + "\t     " + eachPet.getHappiness()
						+ "\n";
			}
		return catStatus;
	}

	public String roboStatus() {
		String roboStatus = "";
		for (RobotPet eachPet : shelterRoboPets.values())
			if (eachPet instanceof RobotDog) {
				roboStatus += eachPet.getName() + "\t" + eachPet.getDescription() + "\t" + eachPet.getOil() + "\t"
						+ eachPet.getBatteryLevel() + "\t" + eachPet.getHappiness() + "\n";
			}
		return roboStatus;
	}

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
