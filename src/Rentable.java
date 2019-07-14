import CarShop.Car;

public interface Rentable extends Car {

    Integer getMinRentDay();

    Double getPricePerDay();
}
