package factories;

import militaryElite.LieutenantGeneralImpl;
import militaryElite.PrivateImpl;
import militaryElite.interfaces.LieutenantGeneral;
import militaryElite.interfaces.Private;
import militaryElite.interfaces.Soldier;

import java.util.List;
import java.util.Set;

public class SoldierFactory {
    public static Soldier producePrivate(List<String> args) {
        return new PrivateImpl(
                Integer.parseInt(args.get(0)),
                args.get(1),
                args.get(2),
                Double.parseDouble(args.get(3))
        );
    }

    public static Soldier produceLieutenantGeneral(List<String> args, List<Soldier> soldiers) {
        LieutenantGeneral general = new LieutenantGeneralImpl(
                Integer.parseInt(args.get(0)),
                args.get(1),
                args.get(2),
                Double.parseDouble(args.get(3)));
        for (int i = 4; i < args.size(); i++) {
            int id = Integer.parseInt(args.get(i));

            for (int i1 = 0; i1 < soldiers.size(); i1++) {
                if (soldiers.get(i).getId() == id) {
                    general.addPrivate((Private) soldiers.get(i1));
                }
            }
        }

        return (Soldier) general;
    }
}
