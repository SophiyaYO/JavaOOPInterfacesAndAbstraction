# **Interfaces and Abstraction**
*********************************


## **Lab Problems**
-------------------

### **Pr 01 Car Shop**

Build hierarchy from classes and interfaces for this UML diagram

**Serializable** *// is __*interface*__*

**Car** *// is **interface** an **extends** interface **Serializable***

> - +TIRES: Integer
> - +getModel(): String
> - +getColor(): String
> - +getHorsePower(): Integer
> - +countryProduced(): String


**carShopExtended.Seat** *// __*implements Car*__*

> - +toString(): String

Your hierarchy have to be used with this code:

```java
public class Main {
    public static void main(String[] args) {
        Car seat = new Seat("Leon", "gray", 110, "Spain");
    
        System.out.println(String.format(
                "%s is %s color and have %s horse power",
                seat.getModel(),
                seat.getColor(),
                seat.getHorsePower()));
        System.out.println(seat.toString());
    }
}
```

***Note: consider using the wrapper classes in the Seat constructor.***

[Click ME for solution](https://github.com/SophiyaYO/JavaOOPInterfacesAndAbstraction/tree/master/src/CarShop/)

[Relative Link](src/carShop)

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

[**Click ME for solution**](https://github.com/SophiyaYO/JavaOOPInterfacesAndAbstraction/tree/master/src/CarShopExtended)

[Relative Link](src/carShopExtended)

************************************************************

### **Pr 03 Say Hello**

Build hierarchy from classes and interfaces for this UML diagram

![](https://github.com/SophiyaYO/JavaOOPInterfacesAndAbstraction/blob/master/src/sayHello/uml03.PNG)

Your hierarchy have to be used with this code:

 Main.java
```java

public class Main{
 public static void main(String[] args) {
     List<Person> persons = new ArrayList<>();
        persons.add(new Bulgarian("Pesho"));
            persons.add(new European("Pesho"));
                persons.add(new Chinese("Pesho"));

    for (Person person : persons) {
        print(person);
    }
}
   private static void print(Person person) {
    System.out.println(person.sayHello());
}
}
```

[**Click ME for solution**](https://github.com/SophiyaYO/JavaOOPInterfacesAndAbstraction/tree/master/src/sayHello)

[Relative Link](src/sayHello)

************************************************************

### **Pr 04 Say Hello Extend**

Build hierarchy from classes and interfaces for this UML diagram

![](https://github.com/SophiyaYO/JavaOOPInterfacesAndAbstraction/blob/master/src/sayHello/uml04.PNG)

Your hierarchy have to be used with this code:

 Main.java
```java

public class Main{
 public static void main(String[] args) {
     List<Person> persons = new ArrayList<>();
        persons.add(new Bulgarian("Pesho"));
            persons.add(new European("Pesho"));
                persons.add(new Chinese("Pesho"));

    for (Person person : persons) {
        print(person);
    }
}
   private static void print(Person person) {
    System.out.println(person.sayHello());
}
}
```

[**Click ME for solution**](https://github.com/SophiyaYO/JavaOOPInterfacesAndAbstraction/tree/master/src/sayHello)

[Relative Link](src/sayHello)

************************************************************

