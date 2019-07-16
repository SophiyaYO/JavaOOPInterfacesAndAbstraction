package militaryElite;

import militaryElite.interfaces.LieutenantGeneral;
import militaryElite.interfaces.Private;

import java.util.*;

public class LieutenantGeneralImpl extends PrivateImpl implements LieutenantGeneral {
    private Set<Private> privates ;

    public LieutenantGeneralImpl(int id, String firstName, String lastName, double salary) {
        super(id, firstName, lastName, salary);
        this.privates = new TreeSet<>(
                (first, second) -> second.getId() - first.getId());
    }

    @Override
    public void addPrivate(Private soldier) {
        this.privates.add(soldier);
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder(super.toString());
        builder.append(System.lineSeparator())
                .append("Privates:")
                .append(System.lineSeparator());

        for (Private soldier : this.privates) {
            builder.append("  ")
                    .append(soldier.toString())
                    .append(System.lineSeparator());
        }

        return builder.toString().trim();
    }
}
