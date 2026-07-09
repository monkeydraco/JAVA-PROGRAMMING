# Day 7 -- Arrays in Java

## Introduction

An **array** is a collection of elements of the **same data type**
stored in contiguous memory locations.

``` java
int[] marks = {85, 90, 78, 88, 95};
```

------------------------------------------------------------------------

## Why Arrays?

-   Store multiple values using one variable
-   Easy traversal
-   Efficient memory usage
-   Less repetitive code

------------------------------------------------------------------------

## Characteristics

-   Fixed size
-   Same data type
-   Index starts at 0
-   Contiguous memory
-   Fast random access

------------------------------------------------------------------------

## Declaration

``` java
int[] numbers;
```

## Creation

``` java
int[] numbers = new int[5];
```

## Initialization

``` java
int[] numbers = {10,20,30,40,50};
```

------------------------------------------------------------------------

## Accessing Elements

``` java
numbers[0]
numbers[3]
```

------------------------------------------------------------------------

## Updating Elements

``` java
numbers[2] = 100;
```

------------------------------------------------------------------------

## Traversing

``` java
for(int i=0;i<numbers.length;i++){
    // code
}
```

Enhanced for loop

``` java
for(int value : numbers){
    // code
}
```

------------------------------------------------------------------------

## length Property

``` java
numbers.length
```

------------------------------------------------------------------------

## Default Values

  Type      Default
  --------- ------------------
  int       0
  double    0.0
  boolean   false
  char      '`\u0`{=tex}000'
  String    null

------------------------------------------------------------------------

## Types of Arrays

-   One-Dimensional
-   Two-Dimensional
-   Multidimensional

------------------------------------------------------------------------

## Passing Arrays to Methods

``` java
method(arr);
```

Arrays are passed by reference.

------------------------------------------------------------------------

## Returning Arrays

``` java
return arr;
```

------------------------------------------------------------------------

## Common Operations

-   Traversal
-   Search
-   Update
-   Sorting
-   Maximum
-   Minimum
-   Sum
-   Average

------------------------------------------------------------------------

## Common Mistakes

-   ArrayIndexOutOfBoundsException
-   Using `i <= arr.length`
-   Forgetting memory allocation
-   Confusing size with last index

------------------------------------------------------------------------

## Arrays vs ArrayList

  Array                 ArrayList
  --------------------- -----------------
  Fixed size            Dynamic
  Faster                Slightly slower
  Supports primitives   Wrapper objects

------------------------------------------------------------------------

## Time Complexity

  Operation   Complexity
  ----------- ------------
  Access      O(1)
  Update      O(1)
  Search      O(n)
  Traversal   O(n)

------------------------------------------------------------------------

## Best Practices

-   Use `.length`
-   Never exceed bounds
-   Use meaningful names
-   Prefer enhanced for loop when index isn't needed

------------------------------------------------------------------------

## Interview Questions

-   Why does indexing start at 0?
-   Difference between Array and ArrayList?
-   Why are arrays fixed?
-   Can arrays store objects?
-   Difference between `.length` and `length()`?
-   What is ArrayIndexOutOfBoundsException?

------------------------------------------------------------------------

## Revision Summary

-   Declaration
-   Creation
-   Initialization
-   Traversal
-   Updating
-   Enhanced for loop
-   Default values
-   Passing arrays
-   Returning arrays
-   Time complexity

------------------------------------------------------------------------

# Practice Programs

## Beginner

1.  Store and display 10 integers.
2.  Find sum and average.
3.  Find largest element.

## Basic

4.  Find smallest element.
5.  Count even and odd numbers.
6.  Linear search.

## Intermediate

7.  Reverse an array.
8.  Find second largest element.
9.  Remove duplicates from a sorted array.

## Advanced

10. Left rotate array by one position.
11. Right rotate array by K positions.
12. Merge two sorted arrays.
