package commands;

import commands.interfaces.Command;
import militaryElite.interfaces.Soldier;

import java.util.Collection;

public abstract class BaseCommand implements Command {
    private Collection<Soldier> soldiers;

    protected BaseCommand(Collection<Soldier> soldiers) {
        this.soldiers = soldiers;
    }

    public void add(Soldier soldier) {
        this.soldiers.add(soldier);
    }
}
