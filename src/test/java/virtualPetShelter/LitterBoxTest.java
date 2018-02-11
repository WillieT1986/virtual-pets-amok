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

}
