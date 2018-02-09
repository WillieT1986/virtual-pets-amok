package virtualPetShelter;

public class VirtualPet {
	private String name;
	private String description;

	public VirtualPet(String name, String description) {
		// this(name, description, 50, 60, 70);
		this.name = name;
		this.description = description;
	}

	public String getName() {
		return name;
	}

	public String getDescription() {
		return description;
	}

}
