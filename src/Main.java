import defineAnInterfacePerson.Citizen;
import defineAnInterfacePerson.Pet;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Citizen> citizens = new ArrayList<>();
        List<Pet> pets = new ArrayList<>();
        String input;
        while (!"End".equalsIgnoreCase(input = scanner.nextLine())) {
            String[] tokens = input.split("\\s+");

            switch (tokens.length) {
                case 5:
                    Citizen personData = new Citizen(tokens[1], Integer.parseInt(tokens[2]),
                            tokens[3], tokens[4]);

                    citizens.add(personData);
                    break;
                case 3:
                    if (tokens[0].equals("Pet")) {
                        Pet pet = new Pet(tokens[1], tokens[2]);
                        pets.add(pet);
                    }
                    break;

            }
        }

        String comparableDate = scanner.nextLine();

        for (Citizen citizen : citizens) {
            if (citizen.getBirthDate().contains(comparableDate)) {
                System.out.println(citizen.getBirthDate());
            }
        }

        for (Pet pet : pets) {
            if (pet.getBirthDate().contains(comparableDate)) {
                System.out.println(pet.getBirthDate());
            }
        }

    }
}



