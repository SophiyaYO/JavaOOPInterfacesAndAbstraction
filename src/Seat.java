public class Seat extends CarImpl implements Sellable{

    private Double price;

    public Seat(String model, String color, Integer horsePower,
                String countryProduces, Double price) {
        super(model, color, horsePower, countryProduces);
        this.price = price;
    }

    @Override
    public Double getPrice() {
        return this.price;
    }

    @Override
    public String toString() {
        String format = "%s sells for %f";
        return super.toString() +
                System.lineSeparator() +
                String.format(format,
                        this.getModel(),
                        this.price);
    }
}
