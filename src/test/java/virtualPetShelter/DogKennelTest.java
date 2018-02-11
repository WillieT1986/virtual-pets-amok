package virtualPetShelter;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;

public class DogKennelTest {

	private DogKennel underTest;

	@Before
	public void setUp() {
		underTest = new DogKennel();
	}

	@Test
	public void instantiateDogKennel() {
		underTest = new DogKennel();
		assertNotNull(underTest);
	}

	@Test
	public void shouldGetWasteLevel() {
		int check = underTest.getWasteLevel();

		assertEquals(check, 1);
	}

}
