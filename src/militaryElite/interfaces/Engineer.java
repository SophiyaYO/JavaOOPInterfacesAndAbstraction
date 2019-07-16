package militaryElite.interfaces;

import militaryElite.helpClasses.interfacesHelp.Repair;

import java.util.Collection;

public interface Engineer {
    void addRepair(Repair repair);

    Collection<Repair> getRepairs();
}
