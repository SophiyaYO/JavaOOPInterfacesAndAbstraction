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

### **Pr 05 Border Control**

It’s the future, you’re the ruler of a totalitarian dystopian society inhabited by citizens and robots, 

since you’re afraid of rebellions you decide to implement strict control of who enters your city. Your soldiers check the Ids of everyone who enters and leaves.

You will receive from the console an unknown amount of lines until the command "End" is received, 

on each line there will be the information for either a citizen or a robot who tries to enter your city in the format 

"\<name> \<age> \<id>" for citizens and "\<model> \<id>" for robots. 

After the end command on the next line you will receive a single number 

representing the last digits of fake ids, all citizens or robots whose Id ends with the specified digits must be detained.

The output of your program should consist of all detained Ids each on a separate line \(the order of printing does not matter).

![](https://github.com/SophiyaYO/JavaOOPInterfacesAndAbstraction/blob/master/src/borderControl/uml05.PNG)


| input | output |
| --- | --- |
| Teo 31 7801211340    | 7801211340|
| Anna 29 8007181534 | |
| IV-228 999999 | |
| Simon 54 3401018380 | |
| KKK-666 80808080 | |
| End | |
| 340 | |

[**Click ME for solution**](https://github.com/SophiyaYO/JavaOOPInterfacesAndAbstraction/tree/master/src/borderControl)

[Relative Link](src/borderControl)

************************************************************

### **Pr 06 ferrari**

Model an application which contains a class ferrari and an interface. 

Your task is simple, you have a car - ferrari, its model is "488-Spider" and it has a driver. 

Your ferrari should have functionality to use brakes and push the gas pedal. 

When the brakes are pushed down print "Brakes!", and when the gas pedal is pushed down - "Zadu6avam sA!". 

As you may have guessed this functionality is typical for all cars, 

so you should implement an interface to describe it.

Your task is to create a ferrari and set the driver's name to the passed one in the input.

After that, print the info. Take a look at the Examples to understand the task better.

![](https://github.com/SophiyaYO/JavaOOPInterfacesAndAbstraction/blob/master/src/ferrari/uml.PNG)

**Input**

On the single input line, you will be given the driver's name.

**Output**

On the single output line, print the model, the messages from the brakes and gas pedal methods and the driver's name. In the following format:
"{model}/{brakes}/{gas pedal}/{driver's name}"


**Constraints**

The input will always be valid, no need to check it explicitly! The Driver's name may contain any ASCII characters.


[**Click ME for solution**](https://github.com/SophiyaYO/JavaOOPInterfacesAndAbstraction/tree/master/src/ferrari)

[Relative Link](src/ferrari)

*********************************


## **Exercise Problems**
-------------------

### **Problem 1. Define an Interface defineAnInterfacePerson.Person**

Define an interface defineAnInterfacePerson.Person with methods getName and getAge. 

Define a class defineAnInterfacePerson.Citizen which implements defineAnInterfacePerson.Person and has a constructor which takes a String name and an int age.

Add the following code to your main method and submit it to Judge.


![](https://github.com/SophiyaYO/JavaOOPInterfacesAndAbstraction/blob/master/src/defineAnInterfacePerson/uml.PNG)

```java

public class Main{
 public static void main(String[] args) {
        Class[] citizenInterfaces = Citizen.class.getInterfaces();
            if(Arrays.asList(citizenInterfaces).contains(Person.class)){
                Method[] fields = Person.class.getDeclaredMethods();
                Scanner scanner = new Scanner(System.in);
                String name = scanner.nextLine();
                int age = Integer.parseInt(scanner.nextLine());
                Person person = new Citizen(name,age);
                System.out.println(fields.length);
                System.out.println(person.getName());
                System.out.println(person.getAge());
            }
         }
}
```

| Input	| Output |
| --- | --- |
| Pesho | 2 |
| 25 | Pesho |
| | 25 |


[**Click ME for solution**](https://github.com/SophiyaYO/JavaOOPInterfacesAndAbstraction/tree/master/src/defineAnInterfacePerson)

[Relative Link](src/defineAnInterfacePerson)

*********************************
