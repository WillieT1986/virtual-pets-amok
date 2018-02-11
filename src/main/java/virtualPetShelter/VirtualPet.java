package virtualPetShelter;

public class VirtualPet implements Happiness {
	private String name;
	private String description;
	private int hunger;
	private int water;
	private int boredom;
	private int waste;
	private int happiness;
	protected int oil;
	protected int batteryLevel;
	private int litterBox = 25;

	public VirtualPet(String name, String description) {
		this(name, description, 50, 60, 70, 40, 30);
	}

	// Constructor used for Virtual Pets
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

	public int getOil() {
		return oil;
	}

	public int getBatteryLevel() {
		return batteryLevel;
	}

	public void feedPet() {
		this.hunger += 5;
		this.water -= 3;
		this.waste += 1;
	}

	public void waterPet() {
		this.water += 6;
		this.waste += 1;
	}

	public void playPet() {
		this.boredom -= 6;
		this.oil -= 10;
		this.batteryLevel -= 10;
		this.happiness += 5;
	}

	public void tick() {
		this.hunger--;
		this.water--;
		this.boredom++;
		this.waste++;
		this.oil--;
		this.batteryLevel--;
		this.happiness--;
	}

	@Override
	public int getHappiness() {
		return happiness;
	}

	@Override
	public String toString() {
		return name;
	}

	@Override
	public void oilPet() {
		this.oil += 10;
		this.batteryLevel += 10;
	}

	@Override
	public int getLitterBox() {
		return litterBox;
	}

}
