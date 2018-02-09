package virtualPetShelter;

import java.util.Scanner;

public class VirtualPetShelterApp {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		VirtualPetShelter pets = new VirtualPetShelter();

		VirtualPet pet1 = new VirtualPet("Hold", "Aged and fragile.", 40, 50, 60);
		VirtualPet pet2 = new VirtualPet("Akita", "Wolf Hybrid, friendly,protective...", 50, 40, 50);
		VirtualPet pet3 = new VirtualPet("Blue", "Family oriented and kid friendly.", 60, 60, 60);
		VirtualPet pet4 = new VirtualPet("Ringo", "Dog of the Vikings. Studier than a Wolf, yet gentle.", 70, 80, 80);

		pets.add(pet1);
		pets.add(pet2);
		pets.add(pet3);
		pets.add(pet4);

		String decision = "";
		while (!decision.equalsIgnoreCase("Yes")) {

			System.out.println("Thank you for visiting your local shelter that houses forsaken Dog's.\n");

			System.out.println("This is the status of the Shelter Pet's: \n");

			System.out.println("Name\t|Hunger\t|Thirst\t|Boredom");// the \t allows console to align output in columns
			System.out.println("--------|-------|-------|-------");
			System.out.println();
			System.out.println(pets.petStatus());
			System.out.println("\nWhat would you like to do next?\n");

			System.out.println("1. Feed Organic Pets");
			System.out.println("2. Water Organic pets");
			System.out.println("3. Play with a pet");
			System.out.println("4. Adopt a pet.");
			System.out.println("5. Admit a pet.");
			System.out.println("6. Quit");

			String optionEntered = input.nextLine();
			if (optionEntered.equals("1")) { // OPTION 1
				pets.feedAll();
				System.out.println("You fed all the pets in the Shelter food.\n");

			} else if (optionEntered.equals("2")) { // OPTION 2
				pets.waterAll();
				System.out.println("You gave all the pets in the Shelter water.\n");

			} else if (optionEntered.equals("3")) { // OPTION 3
				System.out.println("Choose the pet you would like to play with:");
				System.out.println("\nWhich dog would you like to play with today?");
				System.out.println(pets.option4Display());
				String petName = input.nextLine();

				pets.play(petName);
				System.out.println("You took " + petName + " for a walk to the field to play.\n");

			} else if (optionEntered.equals("4")) { // OPTION 4
				System.out.println("You've chosen to adopt a pet.");
				System.out.println("Which pet would you like to adopt?\n");
				System.out.println(pets.option4Display());
				String petName = input.nextLine();

				if (!pets.doesPetRemain(petName)) {
					System.out.println("This pet does not exist.");
				} else {
					pets.adopt(petName);
					System.out.println("Congrats on adopting your new pet \n" + petName + "!");
				}

			} else if (optionEntered.equals("5")) { // OPTION 5
				System.out.println("Enter the name of the pet being surrendered: ");
				String newPetName = input.nextLine();

				System.out.println("Enter a description for the pet being surrendered: ");
				String newPetDescription = input.nextLine();

				pets.add(new VirtualPet(newPetName, newPetDescription));
				System.out.println("Your pet will sure miss you.");
				System.out.println("Thanks admitting your pet instead of discarding your pet elsewhere...\n");

			} else if (optionEntered.equals("6")) { // OPTION 6
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
			pets.tickAll();
		} // end while loop

		input.close();
	}

}
