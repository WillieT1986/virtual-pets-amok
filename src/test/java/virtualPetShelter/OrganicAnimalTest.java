package virtualPetShelter;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public interface OrganicAnimalTest {

	@Test
	public static void shouldReturnOrganicAnimalHungerWaterAndBoredomStats() {
		OrganicAnimal underTest = new OrganicAnimal(0, 0, 0);
		assertNotNull(underTest);
	}
}
