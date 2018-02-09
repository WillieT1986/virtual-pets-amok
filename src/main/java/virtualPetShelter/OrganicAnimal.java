package virtualPetShelter;

public class OrganicAnimal {
	private int hunger;
	private int water;
	private int boredom;

	public OrganicAnimal(int hunger, int water, int boredom) {
		this.hunger = hunger;
		this.water = water;
		this.boredom = boredom;
	}

	public int getHunger() {
		return hunger;
	}

	public int getWater() {
		return water;
	}

	public int getBordem() {
		return boredom;
	}

}
