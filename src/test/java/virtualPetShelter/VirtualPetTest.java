package virtualPetShelter;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class VirtualPetTest {

	@Test
	public void shouldConstructPetNameAndDescription() {
		VirtualPet underTest = new VirtualPet("name", "description");
		assertNotNull(underTest);
	}

	@Test
	public void shouldReturnVirtualPetName() {
		VirtualPet underTest = new VirtualPet("name", "description");
		String check = underTest.getName();
		assertEquals("name", check);
	}

	@Test
	public void shouldReturnVirtualPetDescription() {
		VirtualPet underTest = new VirtualPet("name", "description");
		String check = underTest.getDescription();
		assertEquals("description", check);
	}

	@Test
	public void shouldReturnVirtualPetNameDescriptionHungerWaterAndBoredom() {
		VirtualPet underTest = new VirtualPet("name", "description", 0, 0, 0);
		assertNotNull(underTest);
	}

	@Test
	public void ShouldReturnVirtualPetHunger() {
		VirtualPet underTest = new VirtualPet("name", "description", 1, 0, 0);
		int check = underTest.getHunger();
		assertEquals(1, check);
	}

	@Test
	public void shouldReturnVirtualPetWater() {
		VirtualPet underTest = new VirtualPet("name", "description", 0, 1, 0);
		int check = underTest.getWater();
		assertEquals(1, check);
	}

	@Test
	public void shouldReturnVirtualPetBoredom() {
		VirtualPet underTest = new VirtualPet("name", "description", 0, 0, 1);
		int check = underTest.getBoredom();
		assertEquals(1, check);
	}

}
