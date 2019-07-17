package factories;

import militaryElite.EngineerImpl;
import militaryElite.LieutenantGeneralImpl;
import militaryElite.PrivateImpl;
import militaryElite.enumerations.Corps;
import militaryElite.interfaces.Engineer;
import militaryElite.interfaces.LieutenantGeneral;
import militaryElite.interfaces.Private;
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

    public static Soldier produceLieutenantGeneral(List<String> args, List<Soldier> soldiers) {
        LieutenantGeneral general = new LieutenantGeneralImpl(
                Integer.parseInt(args.get(0)),
                args.get(1),
                args.get(2),
                Double.parseDouble(args.get(3)));

        for (int i = 4; i < args.size(); i++) {
            int id = Integer.parseInt(args.get(i));

            for (int i1 = 0; i1 < soldiers.size(); i1++) {
                if (soldiers.get(i1).getId() == id) {
                    general.addPrivate((Private) soldiers.get(i1));
                }
            }
        }

        return (Soldier) general;
    }

    public static Soldier produceEngineer(List<String> args) {
        Engineer engineer = new EngineerImpl(
                Integer.parseInt(args.get(0)),
                args.get(1),
                args.get(2),
                Double.parseDouble(args.get(3)),
                Corps.valueOf(args.get(4).toUpperCase()));


        for (int i = 0; i < args.size(); i++) {

        }
        return (Soldier) engineer;
    }
}