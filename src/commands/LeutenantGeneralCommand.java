package commands;

import factories.SoldierFactory;
import militaryElite.interfaces.Soldier;

import java.util.Collection;
import java.util.List;

public class LeutenantGeneralCommand extends BaseCommand {

    protected LeutenantGeneralCommand(Collection<Soldier> soldiers) {
        super(soldiers);
    }

    @Override
    public void execute(List<String> args) {
        super.add(SoldierFactory.produceLeutenantGeneral(args));
    }
}
