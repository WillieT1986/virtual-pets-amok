package virtualPetShelter;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class DogTest {
	VirtualPet underTest = new Dog("Hold", "Is a dog");

	@Test
	public void shouldReturnDogName() {
		String check = underTest.getName();
		assertEquals(check, "Hold");
	}

	@Test
	public void shouldReturnDogDescription() {
		String check = underTest.getDescription();
		assertEquals(check, "Is a dog");
	}
}
