package virtualPetShelter;

import java.util.Scanner;

public class VirtualPetShelterApp {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		VirtualPetShelter dogs = new VirtualPetShelter();
		VirtualPetShelter cats = new VirtualPetShelter();

		VirtualPet dog1 = new VirtualPet("Hold", "Aged and fragile.", 40, 50, 60, 40);
		VirtualPet dog2 = new VirtualPet("Akita", "Wolf Hybrid, friendly,protective...", 50, 40, 50, 50);
		VirtualPet dog3 = new VirtualPet("Blue", "Family oriented and kid friendly.", 60, 60, 60, 60);
		VirtualPet dog4 = new VirtualPet("Ringo", "Dog of the Vikings. Studier than a Wolf, yet gentle.", 70, 80, 80,
				60);

		VirtualPet cat1 = new VirtualPet("Tara", "Young and Restless.", 50, 40, 50, 70);
		VirtualPet cat2 = new VirtualPet("Kitty", "Kitten found in a box under a porch.", 50, 40, 50, 70);
		VirtualPet cat3 = new VirtualPet("Snowbal", "Kitten found in a box under a porch.", 50, 40, 50, 60);
		VirtualPet cat4 = new VirtualPet("Yoohoo", "Skiddish and ungrateful.", 50, 40, 50, 80);

		dogs.add(dog1);
		dogs.add(dog2);
		dogs.add(dog3);
		dogs.add(dog4);

		cats.add(cat1);
		cats.add(cat2);
		cats.add(cat3);
		cats.add(cat4);

		String decision = "";
		while (!decision.equalsIgnoreCase("Yes")) {

			System.out.println(
					"Thank you for visiting your local shelter that houses forsaken Dog's, Cat's & RoboPets.\n");

			System.out.println("This is the status of the Shelter Pet's: \n");

			System.out.println("\t\t    **DOGS**\n");
			System.out.println("Name\t|Hunger\t|Thirst\t|Boredom |Waste  |Happiness");// the \t allows console to align
																						// output in columns
			System.out.println("--------|-------|-------|--------|-------|---------");
			System.out.println(dogs.petStatus());
			System.out.println();

			System.out.println("\t\t    **CATS**\n");
			System.out.println("Name\t|Hunger\t|Thirst\t|Boredom |Waste  |Happiness");// the \t allows console to align
																						// output in columns
			System.out.println("--------|-------|-------|--------|-------|---------");
			System.out.println(cats.petStatus());
			System.out.println("\nWhat would you like to do next?\n");

			System.out.println("1. Feed Organic Pets.");
			System.out.println("2. Water Organic pets.");
			System.out.println("3. Oil RoboPets.  *Not yet implimented* -no functionality");
			System.out.println("4. Play with pet.");
			System.out.println("5. Adopt a pet.");
			System.out.println("6. Admit a pet.");
			System.out.println("7. Clean all Dog cages. *Not yet implimented* -no functionality");
			System.out.println("8. Clean the Shelter Litter Box. *Not yet implimented* -no functionality");
			System.out.println("9. Quit");

			String optionEntered = input.nextLine();
			if (optionEntered.equals("1")) { // OPTION 1
				dogs.feedAll();
				cats.feedAll();
				System.out.println("You fed all the Dog's & Cat's in the Shelter food.\n");

			} else if (optionEntered.equals("2")) { // OPTION 2
				dogs.waterAll();
				cats.waterAll();
				System.out.println("You gave all the Dog's & Cat's in the Shelter water.\n");

			} else if (optionEntered.equals("4")) { // OPTION 4
				System.out.println("\nWhich Shelter Pet would you like to play with today?");
				System.out.println("Dogs? Cats? RoboPets?\n");
				String newDecision = input.nextLine();

				if (newDecision.equalsIgnoreCase("Dogs")) {
					System.out.println(dogs.option5Display());
					String petName = input.nextLine();
					dogs.play(petName);
					System.out.println("You took " + petName + " for a walk to the field to play.\n");

				} else if (newDecision.equalsIgnoreCase("Cats")) {
					System.out.println(cats.option5Display());
					String petName = input.nextLine();
					cats.play(petName);
					System.out.println(
							"Took" + petName + " for a walk. Said cat was lazy and rode on your shoulder instead.");
				}

			} else if (optionEntered.equals("5")) { // OPTION 5
				System.out.println("You've chosen to adopt a pet.");
				System.out.println("Which pet would you like to adopt?\n");
				System.out.println(dogs.option5Display());
				System.out.println(cats.option5Display());
				String petName = input.nextLine();

				// Dog Adoption
				if (!dogs.doesPetRemain(petName)) {
					System.out.println("This Dog does not exist.");
				} else {
					dogs.adopt(petName);
					System.out.println("Congrats on adopting your new Dog \n" + petName + "!");
				}

				// Cat Adoption
				if (!cats.doesPetRemain(petName)) {
					System.out.println("This Cat does not exit.");
				} else {
					cats.adopt(petName);
					System.out.println(
							"Congrats on adopting your new spawn of Satan, the Shelter means Cat \n" + petName + "!");
				}

				// RoboPet Adoption
				// if (!robos.doesPetRemain(petName)) {
				// System.out.println("This Dog does not exist.");
				// } else {
				// robos.adopt(petName);
				// System.out.println("Congrats on adopting your new RoboPet \n" + petName +
				// "!");
				// }

			} else if (optionEntered.equals("6")) { // OPTION 6
				System.out.println("What type of pet are your surrendering?");
				System.out.println("Dog? Cat? RoboPet?");
				String petDecision = input.nextLine();

				if (petDecision.equalsIgnoreCase("Dog")) { // DOG Choice
					System.out.println("Enter the name of the Dog being surrendered: ");
					String newPetName = input.nextLine();

					System.out.println("Enter a description for the Dog being surrendered: ");
					String newPetDescription = input.nextLine();

					dogs.add(new VirtualPet(newPetName, newPetDescription));
					System.out.println("Your Dog will sure miss you.");
					System.out.println("Thanks admitting your Dog instead of discarding your Dog elsewhere...\n");

				} else if (petDecision.equalsIgnoreCase("Cat")) { // CAT Choice
					System.out.println("Enter the name of the Cat being surrendered: ");
					String newPetName = input.nextLine();

					System.out.println("Enter a description for the Cat being surrendered: ");
					String newPetDescription = input.nextLine();

					cats.add(new VirtualPet(newPetName, newPetDescription));
					System.out.println("Your Cat will sure miss you.");
					System.out.println("Thanks admitting your pet instead of discarding your Cat elsewhere...\n");
				}
				// else if (petDecision.equalsIgnoreCase("RoboPet")) { //ROBOPET Choice
				// System.out.println("Enter the name of the RoboPet that you are
				// surrendering.");
				// String newPetName = input.nextLine();
				//
				// System.out.println("Enter a description for the RoboPet being surrendered:
				// ");
				// String newPetDescription = input.nextLine();
				//
				// robopets.add(new VirtualPet(newPetName, newPetDescription));
				// System.out.println("Your Cat will sure miss you.");
				// System.out.println("Thanks admitting your pet instead of discarding your Cat
				// elsewhere...\n");
				// }

			} else if (optionEntered.equals("9")) { // OPTION 9
				System.out.println("Are you sure you wish to quit the game?");
				System.out.println("Enter Yes or No");
				decision = input.nextLine();

				if (decision.equalsIgnoreCase("Yes")) {
					System.out.println("You have quit the game...");

				} else {
					decision.equalsIgnoreCase("No");
					System.out.println("Glad you are still with us.");
					System.out.println("The pets will be pleased that you stayed for a while longer.\n");
				}

			}
			dogs.tickDogs();
			cats.tickCats();
		} // end while loop

		input.close();
	}

}
