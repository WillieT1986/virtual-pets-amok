package virtualPetShelter;

public class RobotPet extends VirtualPet {
	private int oil;
	private int batteryLevel;
	int happiness;

	public RobotPet(String name, String description) {
		super(name, description);
	}

	public RobotPet(String name, String description, int oil, int batteryLevel, int happiness) {
		super(name, description);
		this.oil = oil;
		this.batteryLevel = batteryLevel;
		this.happiness = happiness;

	}

	public int getOil() {
		return oil;
	}

	public int getBatteryLevel() {
		return batteryLevel;
	}

	@Override
	public int getHappiness() {
		return happiness;
	}

	public void oilAll() {
		this.oil += 5;
		this.happiness += 10;
	}

}
