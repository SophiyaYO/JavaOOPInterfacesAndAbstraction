# **Interfaces and Abstraction**

## **Lab Problems**

### **Pr 01**

__Build hierarchy from classes and interfaces for this UML diagram__

<<inteface>>

<<Car>>// extends interface Serializable
```
+TIRES: Integer
+getModel(): String
+getColor(): String
+getHorsePower(): Integer
+countryProduced(): String
```

<<Serializable>>

Seat// implements interface Car
+toString(): String
