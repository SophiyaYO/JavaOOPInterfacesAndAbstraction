package factories;

import militaryElite.PrivateImpl;
import militaryElite.interfaces.Soldier;

import java.util.List;

public class SoldierFactory {

    public static Soldier producePrivate(List<String> args) {
        return new PrivateImpl(
                Integer.parseInt(args.get(0)),
                        args.get(1),
                        args.get(2),
                        Double.parseDouble(args.get(3))
        );
    }
}
