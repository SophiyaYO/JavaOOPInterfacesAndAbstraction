package CarShop;

public interface Car extends Serializable{
    Integer TIRES = 4;

    String getModel();

    String getColor();

    Integer getHorsePower();

    String countryProduces();


}
