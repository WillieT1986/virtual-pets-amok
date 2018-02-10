package virtualPetShelter;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CatTest {

	VirtualPet underTest = new Cat("Tara", "Is a cat", 20, 30, 40, 50);

	@Test
	public void shouldReturnCatName() {
		String check = underTest.getName();
		assertEquals(check, "Tara");
	}

	@Test
	public void shouldReturnCatDescription() {
		String check = underTest.getDescription();
		assertEquals(check, "Is a cat");
	}

	@Test
	public void shouldReturnCatHunger() {
		int check = underTest.getHunger();
		assertEquals(check, 20);
	}

	@Test
	public void shouldReturnCatWater() {
		int check = underTest.getWater();
		assertEquals(check, 30);
	}

	@Test
	public void shouldReturnCatBoredom() {
		int check = underTest.getBoredom();
		assertEquals(check, 40);
	}

	@Test
	public void shouldReturnCatWaste() {
		int check = underTest.getWaste();

		assertEquals(check, 50);
	}

}
