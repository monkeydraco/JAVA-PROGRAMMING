# Day 10 -- Multiple Classes & Multiple Objects in Java

## Introduction

Real-world Java programs consist of multiple classes working together.
Each class has a specific responsibility, making programs modular and
reusable.

------------------------------------------------------------------------

## Why Multiple Classes?

-   Better code organization
-   Reusability
-   Easy maintenance
-   Easier debugging
-   Supports Object-Oriented Programming

------------------------------------------------------------------------

## Class

A class is a blueprint that defines data (fields) and behavior
(methods).

``` java
class Student{

}
```

------------------------------------------------------------------------

## Object

An object is an instance of a class.

``` java
Student s1 = new Student();
```

------------------------------------------------------------------------

## Multiple Objects

A single class can create multiple objects.

Each object has: - Its own data - Shared methods

------------------------------------------------------------------------

## Multiple Classes

Example:

-   Student
-   Teacher
-   Course
-   Library
-   Main

Each class performs one responsibility.

------------------------------------------------------------------------

## Accessing Another Class

Create an object and use the dot operator.

``` java
Student s = new Student();
s.display();
```

------------------------------------------------------------------------

## Object Communication

Objects communicate by calling methods of other objects.

------------------------------------------------------------------------

## Passing Objects

Objects can be passed as method parameters.

Benefits: - Code reuse - Better modularity

------------------------------------------------------------------------

## Returning Objects

Methods can return objects.

------------------------------------------------------------------------

## Object References

``` java
Student s1 = new Student();
Student s2 = s1;
```

Both references point to the same object.

------------------------------------------------------------------------

## Anonymous Objects

Objects can be created without assigning them to a reference variable
for one-time use.

------------------------------------------------------------------------

## Memory

-   Stack → Reference variables
-   Heap → Objects

------------------------------------------------------------------------

## Instance vs Static

  Instance              Static
  --------------------- --------------------
  Per object            Per class
  Separate copy         Shared copy
  Access using object   Access using class

------------------------------------------------------------------------

## Common Mistakes

-   Forgetting `new`
-   Accessing instance members without an object
-   Confusing references with objects
-   Writing all logic inside one class

------------------------------------------------------------------------

## Best Practices

-   One responsibility per class
-   Meaningful class names
-   Meaningful object names
-   Reuse objects
-   Keep classes focused

------------------------------------------------------------------------

## Interview Questions

-   What is a class?
-   What is an object?
-   Why use multiple classes?
-   What is an object reference?
-   What happens when two references point to the same object?
-   Difference between instance and static members?
-   Where are objects stored?

------------------------------------------------------------------------

## Revision Summary

-   Multiple classes
-   Multiple objects
-   Object references
-   Object communication
-   Passing objects
-   Returning objects
-   Heap vs Stack
-   Static vs Instance

------------------------------------------------------------------------

# Practice Programs

## Beginner

1.  Create three Student objects and display their details.
2.  Create Book and Library classes.
3.  Create Employee objects and display salaries.

## Intermediate

4.  Create Student and Course classes where a student enrolls in a
    course.
5.  Create Customer and BankAccount classes.
6.  Create Car and Garage classes.

## Advanced

7.  Pass a Student object to another class.
8.  Return a Product object from a method.
9.  Demonstrate two references pointing to the same object.
10. Build a simple Library Management model.
11. Build a Student Management model.
12. Build a mini E-Commerce model using multiple classes.
