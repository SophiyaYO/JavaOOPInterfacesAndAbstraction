#Interfaces and Abstraction#

##Lab Problems##


###Pr 01###
Build hierarchy from classes and interfaces for this UML diagram

<<inteface>>
<<Car>>// extends interface Serializable
+TIRES: Integer
+getModel(): String
+getColor(): String
+getHorsePower(): Integer
+countryProduced(): String
<<Serializable>>

Seat// implements interface Car
+toString(): String
