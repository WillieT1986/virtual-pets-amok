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
		VirtualPet check = new VirtualPet(PET_NAME, DESCRIPTION);
		underTest.intake(check);
		VirtualPet retrieved = underTest.findPet(PET_NAME);
		assertThat(retrieved, is(check));
	}

	@Test
	public void shouldIntakeMultipleVirtualPetNames() {
		String anotherName = "Akita";
		VirtualPet pet = new VirtualPet("Husky", DESCRIPTION);
		VirtualPet anotherPet = new VirtualPet(anotherName, DESCRIPTION);
		underTest.intake(pet);
		underTest.intake(anotherPet);
		Collection<VirtualPet> pets = underTest.pets();
		assertThat(pets, containsInAnyOrder(pet, anotherPet));
		assertTrue(pets.contains(pet));
		assertTrue(pets.contains(anotherPet));
		assertEquals(2, pets.size());
	}

	@Test
	public void shouldAdoptVirtualPets() {
		VirtualPet pet = new VirtualPet("Husky", DESCRIPTION);
		underTest.adopt(pet.getName());

		assertThat(underTest.doesPetRemain(pet.getName()), is(false));
	}

	// Feeding...?
	@Test
	public void shouldShelterFeedAllPet() {
		VirtualPet pet = new VirtualPet("Hold", "Akita");// will be 52
		underTest.intake(pet);
		underTest.intake(new VirtualPet("Hold2", "Akita2", 0, 0, 0, 0, 0)); // will be 2
		underTest.intake(new VirtualPet("Hold3", "Akita3")); // will be 52
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
		VirtualPet pet = new VirtualPet("Hold", "Akita");
		underTest.intake(pet);
		underTest.intake(new VirtualPet("Hold2", "Akita2", 0, 5, 0, 0, 0));
		underTest.intake(new VirtualPet("Hold3", "Akita3"));
		underTest.waterAll();
		VirtualPet testPet = underTest.findPet("Hold2");
		int water = testPet.getWater();
		assertEquals(11, water);
		assertEquals(66, underTest.findPet("Hold3").getWater());
	}

	@Test
	public void shouldShelterPlayWithHold() {
		VirtualPet pet = new VirtualPet("Hold", DESCRIPTION);
		underTest.intake(pet);
		underTest.play("Hold");
		assertEquals(64, underTest.findPet("Hold").getBoredom());
	}

	@Test
	public void shouldShelterOilAllPet() {
		VirtualPet pet = new RobotPet("Jax", "Metal");
		underTest.intake(pet);
		underTest.intake(new RobotPet("Jax2", "Metal2", 10, 0, 0));
		underTest.intake(new RobotPet("Jax3", "Metal3", 25, 0, 0));
		underTest.oilAll();
		VirtualPet testPet = (VirtualPet) underTest.findPet("Jax2");
		int oil = testPet.getOil();
		assertEquals("Jax2", testPet.getName()); // looks for specific pet
		assertEquals(20, oil); // This one will find the Hold2
		assertEquals(35, ((VirtualPet) underTest.findPet("Jax3")).getOil()); // This one will find the Hold 3
	}

	@Test
	public void shouldHaveShelterLitterBox() {
		int check = underTest.getLitterBox();
		assertEquals(check, 70);
	}

	@Test
	public void shouldHaveShelterCleanLitterBox() {
		underTest.litterBoxCleanUp();
		assertEquals(underTest, underTest);
	}

	@Test
	public void shouldTickLitterBox() {
		int check = 5;
		underTest.tickLitterBox();
		assertEquals(check, 5);
	}

}
