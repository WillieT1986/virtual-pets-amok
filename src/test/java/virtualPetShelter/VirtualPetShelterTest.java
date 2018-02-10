package virtualPetShelter;

import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

import java.util.Collection;

import org.junit.Before;
import org.junit.Test;

public class VirtualPetShelterTest {
	private static final String PET_NAME = "name";
	private static final String DESCRIPTION = "description";

	private VirtualPetShelter underTest;

	@Before
	public void setup() {
		underTest = new VirtualPetShelter();
	}

	@Test
	public void shouldRetrieveVirtualPetName() {
		VirtualPet check = new VirtualPet(PET_NAME, DESCRIPTION, 0);
		underTest.intake(check);
		VirtualPet retrieved = underTest.findPet(PET_NAME);
		assertThat(retrieved, is(check));
	}

	@Test
	public void shouldIntakeMultipleVirtualPetNames() {
		String anotherName = "Akita";
		VirtualPet pet = new VirtualPet("Husky", DESCRIPTION, 0);
		VirtualPet anotherPet = new VirtualPet(anotherName, DESCRIPTION, 0);
		underTest.intake(pet);
		underTest.intake(anotherPet);
		Collection<VirtualPet> pets = underTest.dogs();
		assertThat(pets, containsInAnyOrder(pet, anotherPet));
		assertTrue(pets.contains(pet));
		assertTrue(pets.contains(anotherPet));
		assertEquals(2, pets.size());
	}

	@Test
	public void shouldAdoptVirtualPets() {
		VirtualPet pet = new VirtualPet("Husky", DESCRIPTION, 0);
		underTest.adopt(pet.getName());

		assertThat(underTest.doesPetRemain(pet.getName()), is(false));
	}

	// Feeding...?
	@Test
	public void shouldShelterFeedAllPet() {
		VirtualPet pet = new VirtualPet("Hold", "Akita", 0);// will be 52
		underTest.intake(pet);
		underTest.intake(new VirtualPet("Hold2", "Akita2", 0, 0, 0, 0, 0)); // will be 2
		underTest.intake(new VirtualPet("Hold3", "Akita3", 0)); // will be 52
		underTest.feedAll();
		VirtualPet testPet = underTest.findPet("Hold2");
		int hunger = testPet.getHunger();
		// assertEquals("Hold2", testPet.getName()); //looks for specific pet
		assertEquals(5, hunger); // This one will find the Hold2
		assertEquals(55, underTest.findPet("Hold3").getHunger()); // This one will
		// find the Hold 3
	}

	@Test
	public void shouldShelterWaterAllPet() {
		VirtualPet pet = new VirtualPet("Hold", "Akita", 0);
		underTest.intake(pet);
		underTest.intake(new VirtualPet("Hold2", "Akita2", 0, 2, 0, 0, 0));
		underTest.intake(new VirtualPet("Hold3", "Akita3", 0));
		underTest.waterAll();
		VirtualPet testPet = underTest.findPet("Hold2");
		int water = testPet.getWater();
		assertEquals(7, water);
		assertEquals(65, underTest.findPet("Hold3").getWater());
	}

	@Test
	public void shouldShelterPlayWithHold() {
		VirtualPet pet = new VirtualPet("Hold", DESCRIPTION, 0);
		underTest.intake(pet);
		underTest.play("Hold");
		assertEquals(76, underTest.findPet("Hold").getBoredom());
	}
}
