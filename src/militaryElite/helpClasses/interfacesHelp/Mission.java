package militaryElite.helpClasses.interfacesHelp;

import militaryElite.enumerations.State;

public interface Mission {
    void completeMission();

    String getCodeName();

    State getState();
}
