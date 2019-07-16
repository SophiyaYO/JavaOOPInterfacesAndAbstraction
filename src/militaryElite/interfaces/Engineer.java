package militaryElite.interfaces;

import militaryElite.HelpClasses.interfacesHelp.Repair;

import java.util.Collection;

public interface Engineer {
    void addRepair(Repair repair);

    Collection<Repair> getRapairs();
}
