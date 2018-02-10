package virtualPetShelter;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class RobotDogTest {

	private static final String PET_NAME = "RoboMax";
	private static final String DESCRIPTION = "description";
	private static final int OIL = 30;
	private static final int BATTERY_LEVEL = 40;
	private static final int HAPPINESS = 35;
	private RobotDog underTest;

	@Before
	public void setup() {
		underTest = new RobotDog(PET_NAME, DESCRIPTION, OIL, BATTERY_LEVEL, HAPPINESS);
	}

	@Test
	public void shouldReturnName() {
		String check = underTest.getName();
		assertEquals(check, PET_NAME);
	}

	@Test
	public void shouldReturnDescription() {
		String check = underTest.getDescription();
		assertEquals(check, DESCRIPTION);
	}

	@Test
	public void shouldReturnOiling() {
		int check = underTest.getOiling();
		assertEquals(check, 30);
	}

	@Test
	public void shouldReturnBatteryLevel() {
		int check = underTest.getBatteryLevel();
		assertEquals(check, 40);
	}

	@Test
	public void shouldReturnHappiness() {
		int check = underTest.getHappiness();
		assertEquals(check, 30); // why does this pull from virtualPet and not RobotDogTest?
	}
}
