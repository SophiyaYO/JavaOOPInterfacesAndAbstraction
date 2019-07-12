public class Seat   implements Car {
    private String model;
    private String color;
    private Integer horsePower;

    @Override
    public String getModel() {
        return this.model;
    }

    @Override
    public String getColor() {
        return this.color;
    }

    @Override
    public Integer getHorsePower() {
        return this.horsePower;
    }

    @Override
    public String countryProduces() {
        return this.countryProduces();
    }

    @Override
    public String toString() {
        return String.format("This is %s produced in %s and have %d tires",
                this.getModel(),
                this.countryProduces(),
                this.);
    }
}
