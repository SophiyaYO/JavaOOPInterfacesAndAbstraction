package factories;

import militaryElite.*;
import militaryElite.enumerations.Corps;
import militaryElite.enumerations.State;
import militaryElite.helpClasses.MissionImpl;
import militaryElite.helpClasses.RepairImpl;
import militaryElite.helpClasses.interfacesHelp.Mission;
import militaryElite.helpClasses.interfacesHelp.Repair;
import militaryElite.interfaces.*;

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

            for (Soldier soldier : soldiers) {
                if (soldier.getId() == id) {
                    general.addPrivate((Private) soldier);
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
                Corps.valueOf(args.get(4)));

        for (int i = 6; i < args.size(); i += 2) {
            Repair repair = new RepairImpl(args.get(i),
                    Integer.parseInt(args.get(i))
            );

            engineer.addRepair(repair);
        }
        return (Soldier) engineer;
    }

    public static Soldier produceCommando(List<String> args) {
        Commandos commandos = new CommandoImpl(
        Integer.parseInt(args.get(0)),
                args.get(1),
                args.get(2),
                Double.parseDouble(args.get(3)),
                Corps.valueOf(args.get(4)));


        for (int i = 5; i < args.size(); i += 2) {
            Mission mission = new MissionImpl(
                    args.get(i),
                    State.valueOf(args.get(i + 1))
            );

            commandos.addMission(mission);
        }
        return (Soldier) commandos;
    }

    public static Soldier produceSpy(List<String> args) {
        return new SpyImpl(
                Integer.parseInt(args.get(0)),
                args.get(1),
                args.get(2),
                args.get(3)
        );
    }
}
