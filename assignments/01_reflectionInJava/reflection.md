
<p align="right" ><i>23 Nov 2021 - 30 Nov 2021</i></p>
<h1 align="center"> Reflection in java</h1>

## Introduction:
Reflection in java refers to the ability of java program to manipulate variable,properties and method 
of the object during runtime.
            <br>
Reflection gives us information about the class to which an object belongs and also the methods of that class which can be executed by using the object.

It is a very useful approach to deal with the java class at runtime. It can be used to load the java class, call it's methods or analyse the class at runtime. Auto-Complete suggestions that pops up in IDE's listing all the methods of a class is a fruit of this feature. Reflection allows us to deal with any class without knowing it in advance.

The first and foremost use of Reflection in Java is when JVM is required to execute a Java program. JVM needs to read the bytecode, learn about all the variables, methods, constructors and inner class of that class and more importantly it should find the main method which would've been impossible without Reflection API.


## Merits:

- Inspection of interfaces, classes, methods, and fields during runtime is possible using reflection, even
  without  using their names during the compile time.
- Debuggers utilize the property of reflection to look at private members on classes.
- Really useful to study a program when we only have compiled bytecode of a program without it's source code 
  and original author of the program made a mistake and didn't expose proper API.


## Demerits:

- Causes Preformance/Execution Overhead as reflective operations have slower performance than their non-reflective  counterparts, and should be avoided in sections of code which are called frequently in performance-sensitive applications.
- Reflective code breaks abstractions and therefore may change behavior with upgrades of the platform causing       exposure of internals.
- Reflective code is againts Object Oriented principles.

## Example:
Code:
```java
class Student{}

class Reflect{
    public static void main(String args[]){
    Class reflectClass = Student.class;
    String name = reflectClass.getName();
    System.out.println("Name: "+name);
 }
}


```
Output:

```
Name:Student

```
