package virtualPetShelter;

public class RobotDog extends VirtualPet {
	int oiling;
	int batteryLevel;

	public RobotDog(String name, String description, int oiling, int batteryLevel, int happiness) {
		super(name, description, happiness);
		this.oiling = oiling;
		this.batteryLevel = batteryLevel;
	}

	public int getOiling() {
		return oiling;
	}

}
