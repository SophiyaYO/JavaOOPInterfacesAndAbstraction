import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            List<Identifiable> all = new ArrayList<>();
            String input;
            while (!"End".equals(input = scanner.nextLine())) {
                String[] tokens = input.split("\\s+");

                if (tokens.length == 3) {
                    Citizen possibleHuman =
                            new Citizen(tokens[0], Integer.parseInt(tokens[1]), tokens[2]);

                    all.add(possibleHuman);
                } else {
                    Robot possibleRobot = new Robot(tokens[0], tokens[1]);

                    all.add(possibleRobot);
                }
            }

            String lastDigits = scanner.nextLine();

            for (Identifiable human : all) {
                if (human.getId().substring(human.getId().length() - lastDigits.length()).equals(lastDigits)) {
                    System.out.println(human.getId());
                }
            }
    }
}
