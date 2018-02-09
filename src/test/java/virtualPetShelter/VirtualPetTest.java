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

	// @Test
	// public void should() {
	//
	// }

}
