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

### **Problem 1. Define an Interface Person**

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

### **Problem 2. Multiple Implementation**

Using the code from the previous task, define an interface Identifiable 

with a String method getId and an interface Birthable with a String method getBirthDate 

and implement them in the Citizen class. Rewrite the Citizen constructor to accept the new parameters.

Add the following code to your main method and submit it to Judge.

![](https://github.com/SophiyaYO/JavaOOPInterfacesAndAbstraction/blob/master/src/defineAnInterfacePerson/uml1.PNG)

```java

public class Main{
 public static void main(String[] args) {
        Class[] citizenInterfaces = Citizen.class.getInterfaces();
            if (Arrays.asList(citizenInterfaces).contains(Birthable.class)
                    && Arrays.asList(citizenInterfaces).contains(Identifiable.class)) {
                    
                Method[] methods = Birthable.class.getDeclaredMethods();
                    methods = Identifiable.class.getDeclaredMethods();
                    
                    Scanner scanner = new Scanner(System.in);
                    String name = scanner.nextLine();
                    int age = Integer.parseInt(scanner.nextLine());
                   
                    String id = scanner.nextLine();
                    String birthDate = scanner.nextLine();
                    Identifiable identifiable = new Citizen(name,age,id,birthDate);
                    Birthable birthable = new Citizen(name,age,id,birthDate);
                    
                    System.out.println(methods.length);
                    System.out.println(methods[0].getReturnType().getSimpleName());
                    System.out.println(methods.length);
                    System.out.println(methods[0].getReturnType().getSimpleName());
            }
 }
}
```

| Input	| Output |
| --- | --- |
| Pesho | 1 |
| 25 | String |
| 9105152287 | 1 |
| 15/05/1991 | String |


[**Click ME for solution**](https://github.com/SophiyaYO/JavaOOPInterfacesAndAbstraction/tree/master/src/defineAnInterfacePerson)

[Relative Link](src/defineAnInterfacePerson)

*********************************

### **Problem 3. Birthday Celebrations**

It is a well known fact that people celebrate birthdays, it is also known that some people 

also celebrate their pets birthdays. Extend the program from your last task to add birthdates to citizens 

and include a class Pet, pets have a name and a birthdate. 

Also create class Robot which has an id and model. 

Encompass repeated functionality into interfaces and implement them in your classes.

You will receive from the console an unknown amount of lines until the command "End" is received,  
each line will contain information in one of the following formats "Citizen \<name> \<age> \<id> \<birthdate>" for citizens, 

"Robot \<model> \<id>" for robots or "Pet \<name> \<birthdate>" for pets. After the end command on the next line 

you will receive a single number representing a specific year, your task is to print all birthdates \(of both citizens and pets) 

in that year in the format day/month/year \(the order of printing does not matter).

![](https://github.com/SophiyaYO/JavaOOPInterfacesAndAbstraction/blob/master/src/defineAnInterfacePerson/uml3.PNG)


**Examples**

| Input| Output |
| ---  | --- |
| Citizen Pesho 22 9010101122 10/10/1990 | 10/10/1990 |
| Pet Sharo 13/11/2005 |  |
| Robot MK-13 558833251 |  |
| End |  |
| 1990 |  |
|  |  |
| Citizen Stamat 16 0041018380 01/01/2000 | 01/01/2000 |
| Robot MK-10 12345678 | 24/12/2000 |
| Robot PP-09 00000001 |  |
| Pet Topcho 24/12/2000 |  |
| Pet Kosmat 12/06/2002  |  |
| End |  |
| 2000 |  |
|  |  |
| Robot VV-XYZ 11213141 |  \<no output>|
| Citizen Penka 35 7903210713 21/03/1979 |  |
| Citizen Kane 40 7409073566 07/09/1974 |  |
| End |  |
| 1975 |  |


[**Click ME for solution**](https://github.com/SophiyaYO/JavaOOPInterfacesAndAbstraction/tree/master/src/defineAnInterfacePerson)

[Relative Link](src/defineAnInterfacePerson)

*******************************************************

### **Problem 4. Food Shortage**

Your totalitarian dystopian society suffers a shortage of food, so many rebels appear. 

Extend the code from your previous (Problem 2.Multiple Implementation) task with new functionality to solve this task.

Define a class Rebel which has a name, age and group (String), names are unique - 

there will never be 2 Rebels/Citizens or a Rebel and Citizen with the same name. 

Define an interface Buyer which defines a methods buyFood() and a getFood(). 

Implement the Buyer interface in the Citizen and Rebel class, both Rebels and Citizens start with 0 food, 

when a Rebel buys food his food increases by 5, when a Citizen buys food his food increases by 10.

On the first line of the input you will receive an integer N - the number of people, 

on each of the next N lines you will receive information in one of the following formats "\<name> \<age> \<id> \<birthdate>" for a Citizen
 
or "\<name> \<age>\<group>" for a Rebel. After the N lines until the command "End" is received, you will receive names of people who bought food, 

each on a new line. Note that not all names may be valid, in case of an incorrect name - nothing should happen.

On the only line of output, you should print the total amount of food purchased

![](https://github.com/SophiyaYO/JavaOOPInterfacesAndAbstraction/blob/master/src/defineAnInterfacePerson/uml4.PNG)

**Examples**

| Input | Output |   
| --- | --- |
| 2 | 20 |
| Pesho 25 8904041303 04/04/1989 |  |
| Stancho 27 WildMonkeys |  |
| Pesho |  |
| Gosho |  |
| Pesho |  |
| End |  |
|  |  |
| 4 | 25 |
| Stamat 23 TheSwarm |  |
| Toncho 44 7308185527 18/08/1973 |  |
| Joro 31 Terrorists |  |
| Penka 27 881222212 22/12/1988 |  |
| Jiraf |  |
| Joro |  |
| Jiraf |  |
| Joro |  |
| Stamat |  |
| Penka |  |
| End |  |


[**Click ME for solution**](https://github.com/SophiyaYO/JavaOOPInterfacesAndAbstraction/tree/master/src/defineAnInterfacePerson)

[Relative Link](src/defineAnInterfacePerson)

*******************************************************

### **Problem 5. Telephony**

You have a business - manufacturing cell phones. But you have no software developers, 

so you call your friends and ask them to help you create a cell phone software. 

They agree and you start working on the project. The project consists of one main model -
 
a Smartphone. Each of your smartphones should have functionalities of calling other phones 

and browsing in the world wide web.

Your friends are very busy, so you decide to write the code on your own. 

Here is the mandatory assignment:
You should have a model - Smartphone and two separate functionalities which your smartphone has - 

to call other phones and to browse in the world wide web. 

You should end up with one class and two interfaces.

![](https://github.com/SophiyaYO/JavaOOPInterfacesAndAbstraction/blob/master/src/telephony/uml0.PNG)

**Input**

The input comes from the console. It will hold two lines:

> - First line: phone numbers to call (String), separated by spaces.

> - Second line: sites to visit (String), separated by spaces.

**Output**


>	- First call all numbers in the order of input then browse all sites in order of input

>	- The functionality of calling phones is printing on the console the number which are 
being called in the format: "Calling... <number>"

>	- The functionality of the browser should print on the console the site in format:
"Browsing: <site>!" \(pay attention to the exclamation mark when printing URLs)

>	- If there is a number in the input of the URLs, print: "Invalid URL!" and continue printing the rest of the URLs.

>- If there is a character different from a digit in a number, print: "Invalid number!" and continue to the next number.

**Constraints**

>	- Each site's URL should consist only of letters and symbols \(No digits are allowed in the URL address)

**Examples**

| Input | |
| --- | --- |
| 0882134215 0882134333 08992134215 0558123 3333 1 | Calling... 0882134215 |
| http://softuni.bg http://youtube.com http://www.g00gle.com | Calling... 0882134333 |
|| Calling... 08992134215 |
|| Calling... 0558123 |
|| Calling... 3333 |
|| Calling... 1 |
|| Browsing: http://softuni.bg! |
|| Browsing: http://youtube.com! |
|| Invalid URL!  |                    
 
 
[**Click ME for solution**](https://github.com/SophiyaYO/JavaOOPInterfacesAndAbstraction/tree/master/src/telephony)

[Relative Link](src/telephony)

*******************************************************