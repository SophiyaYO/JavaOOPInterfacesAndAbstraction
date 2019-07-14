# **Interfaces and Abstraction**
*********************************


## **Lab Problems**
-------------------


### **Pr 01 Car Shop**

[Solution for this Problem:] (https://github.com/SophiyaYO/JavaOOPInterfacesAndAbstraction/tree/master/src/CarShop)

Build hierarchy from classes and interfaces for this UML diagram

**Serializable** *// is __*interface*__*

**Car** *// is **interface** an **extends** interface **Serializable***

> - +TIRES: Integer
> - +getModel(): String
> - +getColor(): String
> - +getHorsePower(): Integer
> - +countryProduced(): String


**CarShopExtended.Seat** *// __*implements Car*__*

> - +toString(): String

************************************************************

### **Pr 02 Car Shop Extended**


Extend previous problem:

| **interface_** | **Car** |
| --- |  --- |
| _class_ **CarImpl**  | _implements_ **_Car_**|
|` +CarImpl ` | `(model, color, horsePower, countryProduced` |
|` +toString():`| ` String` |
| _interface_ **Rentable** _extends_ **_Car_** | _interface_ **Sellable** _extends_ **_Car_** |
|`+getMinRentDay(): Integer` | `+getPrice(): Double` |
| `+getPricePerDay(): Double` ||
| _class_ **Audi** _extends_ **_CarImpl_** _implements_ **_Rentable_** | _class_ **Seat** _extends_ **_CarImpl_** _implements_ **_Sellable_** |
| `-minRentDay: Integer` | `-price: Double` |
| `-pricePerDay: Double` | `+toString(): String` |
| `+toString(): String`  | |

Your hierarchy have to be used with this code:

```java
public class Main {
public static void main(String[] args) {
    Sellable seat = new Seat("Leon", "Gray", 110, "Spain", 11111.1);
    Rentable audi = new Audi("A4", "Gray", 110, "Germany", 3, 99.9);

    printCarInfo(seat);
    printCarInfo(audi);
}

private static void printCarInfo(Car car) {
    System.out.println(String.format(
            "%s is %s color and have %s horse power",
            car.getModel(),
            car.getColor(),
            car.getHorsePower()));
    System.out.println(car.toString());
}
}
```
