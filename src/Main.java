import commands.PrivateCommand;
import commands.interfaces.Command;
import militaryElite.*;
import militaryElite.interfaces.Soldier;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input;

        Map<String, Command> commands = new HashMap<>();

        List<Soldier> soldiers = new ArrayList<>();
        commands.put("Private", new PrivateCommand(soldiers));
        while (!"End".equalsIgnoreCase(input = scanner.nextLine())) {
            String command = input.substring(0, input.indexOf(" "));

            commands.get(command).execute(
                    Arrays.stream(input.split("\\s+"))
                            .skip(1)
                    .collect(Collectors.toList())
            );

        }

        for (Soldier soldier : soldiers) {
            System.out.println(soldier.toString());
        }
    }
}



