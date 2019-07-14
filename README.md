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


