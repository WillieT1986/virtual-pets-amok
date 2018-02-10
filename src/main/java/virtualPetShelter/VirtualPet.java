package virtualPetShelter;

public class VirtualPet implements Happiness {
	private String name;
	private String description;
	private int hunger;
	private int water;
	private int boredom;
	private int waste;
	private int happiness;
	// private int oil;
	// private int batteryLevel;

	// Constructor used for name & description of Virtual Pets
	public VirtualPet(String name, String description) {
		this(name, description, 50, 60, 70, 40, 30);
	}

	// Constructor used for Organic Virtual Pets
	public VirtualPet(String name, String description, int hunger, int water, int boredom, int waste, int happiness) {
		this.name = name;
		this.description = description;
		this.hunger = hunger;
		this.water = water;
		this.boredom = boredom;
		this.waste = waste;
		this.happiness = happiness;
	}

	public String getName() {
		return name;
	}

	public String getDescription() {
		return description;
	}

	public int getHunger() {
		return hunger;
	}

	public int getWater() {
		return water;
	}

	public int getBoredom() {
		return boredom;
	}

	public int getWaste() {
		return waste;
	}

	public void feedPet() {
		this.hunger += 5;
		this.water -= 5;
	}

	public void waterPet() {
		this.water += 5;
	}

	public void playPet() {
		this.boredom += 6;
	}

	public void tick() {
		this.hunger--;
		this.water--;
		this.boredom--;
		this.waste++;

	}

	/* (non-Javadoc)
	 * @see virtualPetShelter.Happiness#getHappiness()
	 */
	@Override
	public int getHappiness() {
		return happiness;
	}

	// public int getBatteryLife() {
	// return batteryLevel;
	// }
	//
	// public int getOil() {
	// return oiling;
	// }

}
