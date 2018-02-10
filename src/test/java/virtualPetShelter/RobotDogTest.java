package virtualPetShelter;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class RobotDogTest {
	RobotPet underTest = new RobotDog("Jax", "description", 40, 50, 60);

	@Test
	public void shouldReturnDogName() {
		String check = underTest.getName();
		assertEquals(check, "Hold");
	}

	// @Test
	// public void shouldReturnDogDescription() {
	// String check = underTest.getDescription();
	// assertEquals(check, "Is a dog");
	// }
	//
	// @Test
	// public void shouldReturnDogHunger() {
	// int check = underTest.getHunger();
	// assertEquals(check, 20);
	// }
	//
	// @Test
	// public void shouldReturnDogWater() {
	// int check = underTest.getWater();
	// assertEquals(check, 30);
	// }
	//
	// @Test
	// public void shouldReturnDogBoredom() {
	// int check = underTest.getBoredom();
	// assertEquals(check, 40);
	// }
	//
	// @Test
	// public void shouldReturnDogWaste() {
	// int check = underTest.getWaste();
	// assertEquals(check, 50);
	// }
	//
	// @Test
	// public void shouldReturnDogHappiness() {
	// int check = underTest.getHappiness();
	// assertEquals(check, 40);
	// }

}
