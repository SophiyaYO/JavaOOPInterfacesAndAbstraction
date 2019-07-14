import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            List<Citizen> humans = new ArrayList<>();
            List<Robot> robots = new ArrayList<>();
            String input;
            while (!"End".equals(input = scanner.nextLine())) {
                String[] tokens = input.split("\\s+");

                if (tokens.length == 3) {
                    Citizen possibleHuman =
                            new Citizen(tokens[0], Integer.parseInt(tokens[1]), tokens[2]);

                    humans.add(possibleHuman);
                } else {
                    Robot possibleRobot = new Robot(tokens[1], tokens[0]);

                    robots.add(possibleRobot);
                }
            }

            String lastDigits = scanner.nextLine();

            for (Citizen human : humans) {
                if (human.getId().substring(human.getId().length() - 3).equals(lastDigits)) {
                    System.out.println(human.getId());
                }
            }

            for (Robot robot : robots) {
                if (robot.getId().substring(robot.getId().length() - 3).equals(lastDigits)) {
                    System.out.println(robot.getId());
                }
            }

    }
}
