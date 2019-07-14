package carShopExtended;

import carShop.Car;

public interface Rentable extends Car {

    Integer getMinRentDay();

    Double getPricePerDay();
}
