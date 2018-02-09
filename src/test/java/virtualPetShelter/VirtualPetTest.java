package virtualPetShelter;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class VirtualPetTest {

	@Test
	public void shouldConstructPetNameAndDescription() {
		VirtualPet underTest = new VirtualPet("name", "description");
		assertNotNull(underTest);
	}

}
