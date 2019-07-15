package Ferrari;

import java.time.Month;

public abstract class Ferrari implements Car {
    private String MODEL = "488-Spider";

    private String driverName;

    public Ferrari(String driverName) {
        this.driverName = driverName;

    }

    @Override
    public String brakes() {
        return "Brakes!";
    }

    @Override
    public String gas() {
        return "Zadu6avam sA!";
    }

    @Override
    public String toString() {
        return String.format("%s/%s/%s/%s",
                MODEL,
                this.brakes(),
                this.gas(),
                this.driverName);
    }
}
