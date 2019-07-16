import defineAnInterfacePerson.Citizen;
import defineAnInterfacePerson.Rebel;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        List<Citizen> citizens = new ArrayList<>();
        List<Rebel> rebels = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String[] tokens = scanner.nextLine().split("\\s+");

            switch (tokens.length) {
                case 4:
                    Citizen buyer = new Citizen(tokens[0], Integer.parseInt(tokens[1]), tokens[2], tokens[3]);
                    citizens.add(buyer);
                    break;

                case 3:
                    Rebel buyer1 = new Rebel(tokens[0], Integer.parseInt(tokens[1]), tokens[2]);
                    rebels.add(buyer1);
                    break;
                default:
                    break;
            }
        }

        String input;
        while (!"End".equalsIgnoreCase(input = scanner.nextLine())) {
            boolean continueIterating = true;
            for (Citizen citizen : citizens) {
                if (citizen.getName().equals(input)) {
                    continueIterating = false;
                    citizen.buyFood();
                    break;
                }
            }

            if (continueIterating) {
                for (Rebel rebel : rebels) {
                    if (rebel.getName().equals(input)) {
                        rebel.buyFood();
                        break;
                    }
                }
            }
        }

      int  foodCount = citizens
                .stream()
                .mapToInt(Citizen::getFood)
                .sum()
                +
                rebels
                .stream()
                .mapToInt(Rebel::getFood)
                .sum();

        if (foodCount > 0) {
            System.out.println(foodCount);
        }
    }
}



