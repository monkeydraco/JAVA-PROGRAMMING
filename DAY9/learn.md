# Day 9 -- Methods & Recursion in Java

## 1. Introduction

Methods help break a program into smaller, reusable units. They improve
readability, reduce code duplication, and make programs easier to
maintain.

Recursion is a technique where a method calls itself to solve a problem
by reducing it into smaller subproblems.

------------------------------------------------------------------------

# 2. What is a Method?

A **method** is a block of code that performs a specific task.

Benefits: - Code reusability - Modularity - Easy debugging - Better
readability

------------------------------------------------------------------------

# 3. Method Syntax

``` java
returnType methodName(parameters){
    // statements
    return value;
}
```

------------------------------------------------------------------------

# 4. Components of a Method

-   Access Modifier
-   Return Type
-   Method Name
-   Parameters
-   Method Body
-   Return Statement

------------------------------------------------------------------------

# 5. Calling a Method

``` java
methodName();
```

If the method belongs to another object:

``` java
objectName.methodName();
```

------------------------------------------------------------------------

# 6. Parameters vs Arguments

  -----------------------------------------------------------------------
  Parameters                            Arguments
  ------------------------------------- ---------------------------------
  Variables in method definition        Actual values passed during
                                        method call

  -----------------------------------------------------------------------

------------------------------------------------------------------------

# 7. Types of Methods

-   No parameters, no return value
-   Parameters, no return value
-   No parameters, returns value
-   Parameters and returns value

------------------------------------------------------------------------

# 8. Return Type

-   `void` → Returns nothing
-   Primitive types → Return a value
-   Objects and arrays can also be returned

------------------------------------------------------------------------

# 9. Method Overloading

Method overloading allows multiple methods with the same name but
different parameter lists.

Benefits: - Improves readability - Supports compile-time polymorphism

Overloading can differ by: - Number of parameters - Type of parameters -
Order of parameters

Return type alone cannot overload a method.

------------------------------------------------------------------------

# 10. Scope of Variables

## Local Variable

Declared inside a method.

## Instance Variable

Declared inside a class but outside methods.

## Static Variable

Shared among all objects.

------------------------------------------------------------------------

# 11. Call Stack

Whenever a method is called: 1. A stack frame is created. 2. Local
variables are stored. 3. The frame is removed after execution.

Method calls follow **Last In, First Out (LIFO)**.

------------------------------------------------------------------------

# 12. Introduction to Recursion

Recursion is the process where a method calls itself.

Every recursive solution must have: - Base Case - Recursive Case

Without a base case, recursion causes a `StackOverflowError`.

------------------------------------------------------------------------

# 13. Structure of Recursion

``` java
returnType recursiveMethod(parameters){
    if(baseCondition){
        return;
    }
    return recursiveMethod(smallerProblem);
}
```

------------------------------------------------------------------------

# 14. Recursion Flow

1.  Recursive calls move downward.
2.  Base case stops further calls.
3.  Calls return one by one (backtracking).

------------------------------------------------------------------------

# 15. Recursion vs Iteration

  Recursion                       Iteration
  ------------------------------- -------------------------------
  Uses function calls             Uses loops
  Easier for recursive problems   Usually more memory efficient
  Uses call stack                 Constant stack usage
  Can be elegant                  Often faster

------------------------------------------------------------------------

# 16. Advantages of Recursion

-   Cleaner code
-   Natural for divide-and-conquer
-   Useful for trees and graphs
-   Simplifies complex problems

------------------------------------------------------------------------

# 17. Disadvantages of Recursion

-   More memory usage
-   Slower due to function calls
-   Risk of StackOverflowError
-   Not suitable for every problem

------------------------------------------------------------------------

# 18. Common Mistakes

-   Missing base case
-   Incorrect recursive call
-   Infinite recursion
-   Returning wrong values
-   Confusing parameters and arguments

------------------------------------------------------------------------

# 19. Best Practices

-   Keep methods short and focused.
-   Use meaningful method names.
-   Avoid unnecessary recursion.
-   Ensure every recursive method has a valid base case.
-   Prefer iteration for simple repetitive tasks.

------------------------------------------------------------------------

# 20. Interview Questions

-   What is a method?
-   Why are methods important?
-   Difference between parameters and arguments?
-   What is method overloading?
-   Can methods return arrays or objects?
-   What is recursion?
-   What is a base case?
-   What causes StackOverflowError?
-   Recursion vs iteration?

------------------------------------------------------------------------

# 21. Revision Summary

You should now understand: - Methods - Method declaration - Method
calling - Parameters & arguments - Return types - Method overloading -
Variable scope - Call stack - Recursion - Base case - Recursive case -
Recursion vs iteration

------------------------------------------------------------------------

# Practice Programs (Beginner → Advanced)

## Beginner

1.  Create a method to print a welcome message.
2.  Create a method to find the square of a number.
3.  Create a method that returns the larger of two numbers.

## Intermediate

4.  Create a method to check whether a number is even or odd.
5.  Create a method to calculate the factorial of a number using
    iteration.
6.  Create a method to calculate the factorial of a number using
    recursion.
7.  Find the sum of the first N natural numbers using recursion.
8.  Generate the Fibonacci series using recursion.

## Advanced

9.  Find the GCD of two numbers using recursion.
10. Reverse a string using recursion.
11. Calculate x\^n using recursion (power function).
12. Solve the Tower of Hanoi problem using recursion.
