package commands;

import factories.SoldierFactory;
import militaryElite.interfaces.Soldier;

import java.util.Collection;
import java.util.List;

public class PrivateCommand extends BaseCommand {

    public PrivateCommand(Collection<Soldier> soldiers) {
        super(soldiers);
    }

    @Override
    public void execute(List<String> args) {
        super.add(SoldierFactory.producePrivate(args));
    }
}
