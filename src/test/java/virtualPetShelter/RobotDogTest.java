package virtualPetShelter;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class RobotDogTest {
	RobotPet underTest = new RobotDog("Jax", "Is a Robot Dog", 40, 50, 60);

	@Test
	public void shouldReturnRobotDogName() {
		String check = underTest.getName();
		assertEquals(check, "Jax");
	}

	@Test
	public void shouldReturnRobotDogDescription() {
		String check = underTest.getDescription();
		assertEquals(check, "Is a Robot Dog");
	}

	@Test
	public void shouldReturnRobotDogOil() {
		int check = underTest.getOil();
		assertEquals(check, 20);
	}

	// @Test
	// public void shouldReturnRobotDogWater() {
	// int check = underTest.getWater();
	// assertEquals(check, 30);
	// }
	//
	// @Test
	// public void shouldReturnRobotDogBoredom() {
	// int check = underTest.getBoredom();
	// assertEquals(check, 40);
	// }
	//
	// @Test
	// public void shouldReturnRobotDogWaste() {
	// int check = underTest.getWaste();
	// assertEquals(check, 50);
	// }
	//
	// @Test
	// public void shouldReturnRobotDogHappiness() {
	// int check = underTest.getHappiness();
	// assertEquals(check, 40);
	// }

}
