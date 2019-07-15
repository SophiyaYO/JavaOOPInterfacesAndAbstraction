package ferrari;

public class Ferrari implements Car {

    private String model;
    private String driverName;

    public Ferrari(String driverName) {
        this.setDriverName(driverName);
        this.model = "488-Spider";
    }


    private void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    private String getDriverName() {
        return this.driverName;
    }

    @Override
    public String brakes() {
        return "Brakes!";
    }

    @Override
    public String gas() {
        return "brum-brum-brum-brrrrr";
    }

    @Override
    public String toString() {
        return String.format("%s/%s/%s/%s",
                this.model,
                this.brakes(),
                this.gas(),
                this.getDriverName());
    }
}
