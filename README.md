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


**CarShopExtended.Seat** *// __*implements Car*__*

> - +toString(): String

************************************************************

### **Pr 02 Car Shop Extended**

Extend previous problem:

| **Car** |
| --- |  
| **CarImpl** |
| --- |
| **Rentable** | **Sellable** |


