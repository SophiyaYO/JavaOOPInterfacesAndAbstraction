package militaryElite;

import militaryElite.enumerations.Corps;
import militaryElite.helpClasses.interfacesHelp.Repair;
import militaryElite.interfaces.Engineer;
import militaryElite.interfaces.LieutenantGeneral;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class EngineerImpl extends SpecialisedSoldierImpl implements Engineer {
    private List<Repair> repairs;


    public EngineerImpl(int id, String firstName, String lastName, double salary, Corps corps) {
        super(id, firstName, lastName, salary, corps);
        this.repairs = new ArrayList<>();
    }

    @Override
    public void addRepair(Repair repair) {
        this.repairs.add(repair);
    }

    @Override
    public Collection<Repair> getRapairs() {
        return this.repairs;
    }
}
