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

| ** _interface_ Car** | |
| --- |  --- |
| ** _class_ CarImpl implements _Car_** | |
| ** _interface_ Rentable extend _Car_** | ** _interface_ Sellable** _Car_ |
| ** _class_ Audi extends _CarImpl_ implements _Rentable_** | ** _class_ Seat extends _CarImpl_ implements _Sellable_** |


