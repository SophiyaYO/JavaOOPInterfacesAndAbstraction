package militaryElite.interfaces;

import militaryElite.helpClasses.interfacesHelp.Mission;

import java.util.Collection;

public interface Commandos {
    void addMission(Mission mission);

    Collection<Mission> getMissions();
}
