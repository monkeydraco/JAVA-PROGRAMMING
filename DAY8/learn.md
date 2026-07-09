# Day 8 -- Classes & Objects in Java

## 1. Introduction

Object-Oriented Programming (OOP) is a programming paradigm based on
**objects**. In Java, almost everything revolves around classes and
objects.

The first step in learning OOP is understanding what a **class** is and
how **objects** are created from it.

------------------------------------------------------------------------

# 2. What is a Class?

A **class** is a blueprint or template used to create objects.

A class defines:

-   Attributes (Fields / Data Members)
-   Behaviors (Methods)
-   Constructors (Object Initialization)

Think of a class as the **design** of a house. The design itself is not
a house, but many houses can be built from the same design.

------------------------------------------------------------------------

# 3. What is an Object?

An **object** is a real instance of a class.

An object contains:

-   State (data)
-   Behavior (methods)
-   Identity (unique memory location)

Example:

Class → Student

Objects → Alice, Bob, Charlie

------------------------------------------------------------------------

# 4. Class vs Object

  -----------------------------------------------------------------------
  Class                               Object
  ----------------------------------- -----------------------------------
  Blueprint                           Instance of a class

  Logical entity                      Physical entity

  No memory for instance fields until Occupies memory
  object creation                     

  Declared once                       Multiple objects can exist
  -----------------------------------------------------------------------

------------------------------------------------------------------------

# 5. Declaring a Class

``` java
class Student{

}
```

------------------------------------------------------------------------

# 6. Data Members (Fields)

Fields store the state of an object.

``` java
class Student{
    String name;
    int age;
}
```

------------------------------------------------------------------------

# 7. Methods

Methods define the behavior of an object.

``` java
void display(){

}
```

Methods can:

-   Access object data
-   Modify object data
-   Return values
-   Accept parameters

------------------------------------------------------------------------

# 8. Creating an Object

Objects are created using the `new` keyword.

``` java
Student s1 = new Student();
```

Steps:

1.  Memory is allocated.
2.  Constructor is invoked.
3.  Reference variable stores the object's address.

------------------------------------------------------------------------

# 9. Accessing Members

Use the dot (`.`) operator.

``` java
s1.name
s1.age
s1.display();
```

------------------------------------------------------------------------

# 10. Reference Variables

A variable like

``` java
Student s1;
```

does **not** contain the object.

It stores the **reference (address)** of the object.

------------------------------------------------------------------------

# 11. Multiple Objects

A single class can create many objects.

``` text
Student
 ├── s1
 ├── s2
 └── s3
```

Each object has its own data but shares the same methods.

------------------------------------------------------------------------

# 12. Memory Allocation

When an object is created:

-   Local variables → Stack Memory
-   Objects → Heap Memory
-   Reference variable → Stack
-   Actual object → Heap

------------------------------------------------------------------------

# 13. Object Life Cycle

1.  Class is loaded.
2.  Object is created.
3.  Constructor executes.
4.  Methods are called.
5.  Object becomes unreachable.
6.  Garbage Collector reclaims memory.

------------------------------------------------------------------------

# 14. The `this` Keyword

`this` refers to the current object.

Common uses:

-   Differentiate fields from parameters
-   Call another constructor
-   Pass current object

------------------------------------------------------------------------

# 15. Static vs Instance Members

  Instance                   Static
  -------------------------- --------------------
  Belongs to object          Belongs to class
  Separate copy per object   One shared copy
  Access using object        Access using class

Example:

``` java
Student.collegeName
```

------------------------------------------------------------------------

# 16. Constructors (Overview)

A constructor:

-   Has the same name as the class
-   Has no return type
-   Executes automatically when an object is created

Types:

-   Default Constructor
-   Parameterized Constructor

------------------------------------------------------------------------

# 17. Common Mistakes

-   Forgetting `new`
-   Trying to access instance members without an object
-   Confusing class with object
-   Declaring a reference without creating an object
-   Comparing objects using `==` when logical equality is intended

------------------------------------------------------------------------

# 18. Best Practices

-   Use meaningful class names (PascalCase).
-   Use meaningful variable names (camelCase).
-   Keep one public class per file.
-   Group related data and behavior together.
-   Make fields private (encapsulation) as you learn access modifiers.

------------------------------------------------------------------------

# 19. Interview Questions

-   What is a class?
-   What is an object?
-   Difference between class and object?
-   Why is `new` required?
-   What is a reference variable?
-   Where are objects stored in memory?
-   Difference between instance and static members?
-   What is the purpose of the `this` keyword?
-   What happens when an object is created?

------------------------------------------------------------------------

# 20. Revision Summary

You should now understand:

-   Class
-   Object
-   Fields
-   Methods
-   Reference Variables
-   Object Creation
-   Dot Operator
-   Heap & Stack Memory
-   `this` Keyword
-   Static vs Instance Members
-   Constructors (basic idea)

------------------------------------------------------------------------

# Practice Programs (Beginner → Advanced)

## Beginner

1.  Create a `Student` class with fields for name, USN, and age. Create
    an object and display its details.
2.  Create an `Employee` class with employee ID, name, and salary. Print
    the employee information.
3.  Create a `Book` class with title, author, and price.

## Intermediate

4.  Create a `Rectangle` class to calculate area and perimeter.
5.  Create a `BankAccount` class with deposit and withdrawal methods.
6.  Create a `Car` class and display the details of multiple car
    objects.
7.  Create a `Circle` class to calculate area and circumference.

## Advanced

8.  Create a `Student` class with a parameterized constructor to
    initialize data.
9.  Demonstrate the difference between instance variables and static
    variables using an `Employee` class.
10. Create an `InventoryItem` class that updates stock using object
    methods.
11. Create a `LibraryBook` class and simulate issuing and returning
    books.
12. Create a simple `ATM` class with methods for deposit, withdrawal,
    and balance inquiry.
