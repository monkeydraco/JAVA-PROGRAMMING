# Day 2 --- Variables, Data Types & Operators

## 1. What is a Variable?

A **variable** is a named memory location used to store data. Its value
can change while the program is running.

### Syntax

``` java
dataType variableName = value;
```

### Example

``` java
int age = 20;
double salary = 25000.50;
char grade = 'A';
```

------------------------------------------------------------------------

## 2. Rules for Naming Variables

-   Must start with a letter, `_`, or `$`.
-   Cannot start with a number.
-   Cannot contain spaces.
-   Cannot use Java keywords.
-   Variable names are **case-sensitive**.

### Good Examples

``` java
studentName
totalMarks
isPassed
```

### Bad Examples

``` java
1name
student name
class
```

------------------------------------------------------------------------

## 3. Primitive Data Types

Primitive data types store a single value directly.

  Data Type   Size      Default Value   Example
  ----------- --------- --------------- -----------
  byte        1 byte    0               100
  short       2 bytes   0               32000
  int         4 bytes   0               150000
  long        8 bytes   0L              99999999L
  float       4 bytes   0.0f            10.5f
  double      8 bytes   0.0             10.55
  char        2 bytes   '\\u0000'       'A'
  boolean     Logical   false           true

### When to Use

-   **byte** → Small numbers
-   **short** → Medium-sized integers
-   **int** → Most integer calculations
-   **long** → Large integer values
-   **float** → Decimal values with lower precision
-   **double** → Decimal values with higher precision (preferred)
-   **char** → Single character
-   **boolean** → True/False conditions

------------------------------------------------------------------------

## 4. Literals

A **literal** is the actual value assigned to a variable.

Examples:

``` java
10
20.5
'A'
true
"Hello"
```

------------------------------------------------------------------------

## 5. Type Casting

Type casting means converting one data type into another.

### Widening (Implicit Casting)

Smaller type → Larger type

No data loss.

``` java
int number = 50;
double value = number;
```

Conversion order:

``` text
byte
 ↓
short
 ↓
int
 ↓
long
 ↓
float
 ↓
double
```

### Narrowing (Explicit Casting)

Larger type → Smaller type

May lose data.

``` java
double pi = 3.14;
int value = (int) pi;
```

Output:

``` text
3
```

------------------------------------------------------------------------

## 6. Operators

### Arithmetic Operators

  Operator   Meaning
  ---------- ----------------
  \+         Addition
  \-         Subtraction
  \*         Multiplication
  /          Division
  \%         Modulus

### Assignment Operators

`=`, `+=`, `-=`, `*=`, `/=`, `%=`

Example:

``` java
x += 5;
```

Equivalent to:

``` java
x = x + 5;
```

### Unary Operators

-   `++` Increment
-   `--` Decrement
-   `+` Positive
-   `-` Negative
-   `!` Logical NOT

### Relational Operators

  Operator   Meaning
  ---------- --------------------------
  ==         Equal To
  !=         Not Equal To
  \>         Greater Than
  \<         Less Than
  \>=        Greater Than or Equal To
  \<=        Less Than or Equal To

Returns either **true** or **false**.

### Logical Operators

  Operator   Meaning
  ---------- ---------
  &&         AND
  \|\|       OR
  !          NOT

Example:

``` java
age >= 18 && age <= 60
```

### Ternary Operator

Short form of `if-else`.

``` java
condition ? value1 : value2;
```

Example:

``` java
int max = (a > b) ? a : b;
```

------------------------------------------------------------------------

## 7. Operator Precedence

Highest to Lowest:

``` text
()
↓
Unary
↓
* / %
↓
+ -
↓
Relational
↓
Logical
↓
Assignment
```

Use parentheses whenever the expression becomes difficult to read.

------------------------------------------------------------------------

## 8. Important Points to Remember

-   Use `int` for most integer calculations.
-   Prefer `double` over `float` unless memory is a concern.
-   Use `boolean` only for true/false values.
-   Explicit casting can cause data loss.
-   `%` returns the remainder after division.
-   `==` compares primitive values directly.
-   Follow **camelCase** naming for variables.
