package commands;

import commands.interfaces.Command;
import factories.SoldierFactory;
import militaryElite.interfaces.Soldier;

import java.util.Collection;
import java.util.List;

public class PrivateCommand implements Command {
    private Collection<Soldier> soldiers;

    public PrivateCommand(Collection<Soldier> soldiers) {
        this.soldiers = soldiers;
    }

    @Override
    public void execute(List<String> args) {
this.soldiers.add(SoldierFactory.producePrivate(args));
    }
}
