package virtualPetShelter;

public class RobotPet extends VirtualPet {
	private int oil;
	private int batteryLevel;
	private int happiness;

	public RobotPet(String name, String description) {
		super(name, description);
	}

	public RobotPet(String name, String description, int oil, int batteryLevel, int happiness) {
		super(name, description);
		this.oil = oil;
	}

	public int getOil() {
		return oil;
	}

}
