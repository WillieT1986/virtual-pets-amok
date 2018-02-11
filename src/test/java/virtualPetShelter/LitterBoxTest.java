package virtualPetShelter;

import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;

public class LitterBoxTest {

	private LitterBox underTest;

	@Before
	public void setUp() {
		underTest = new LitterBox();
	}

	@Test
	public void instantiateLitterBox() {
		assertNotNull(underTest);
	}

	@Test
	public void shouldGetLitterBoxLevel() {
		underTest.getLitterBoxLevel();
	}

	// @Test
	// public void shouldAddWasteToLitterBox() {
	// VirtualPet underTest = new VirtualPet("name", "description", 0, 0, 0, 1, 0);
	// int check = underTest.getWaste();
	// assertEquals(1, check);
	// }

}
