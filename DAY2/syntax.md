To understand Java syntax properly, think of it not as a random list of words, but as a highly structured hierarchy governed by strict grammar rules. Java is designed around the principle of Object-Oriented Programming (OOP), meaning everything must live inside a blueprint called a "Class." [1, 2, 3, 4, 5] 

Here is the ultimate, step-by-step systematic mental model for Java syntax.

------------------------------
## Step 1: The Architectural Blueprint (The "Nesting" Rule)
    Java code is structured like a set of nesting boxes. You cannot write code anywhere you want; it must go into its precise physical container. [6, 7, 8] 

    1. The File (The Outer Box): Must match your class name exactly and end in .java.
    2. The Package (The Label): Declares the folder location of the file.
    3. The Class (The Container): The outer shell that holds data and logic.
    4. The Method (The Action): The functions inside the class that perform tasks.
    5. The Statements (The Instructions): The actual lines of math or logic inside a method. [9, 10, 11, 12, 13] 

------------------------------
## Step 2: The Physical Layout Checklist
    Every complete Java file must follow this exact top-to-bottom sequence: [14] 

    | Section [15, 16, 17, 18, 19] | What it does | Syntax Example |
    |---|---|---|
    | 1. Package Declaration | Identifies the file's folder structure. | package com.myproject.app; |
    | 2. Import Statements | Brings in external utilities or pre-made code. | import java.util.Scanner; |
    | 3. Class Header | Declares the name and visibility of the class. | public class BankAccount { |
    | 4. Variables (Fields) | Defines what data the class can hold. | private double balance; |
    | 5. Constructors | Specialized setup code to build objects. | public BankAccount() { } |
    | 6. Methods | Functions that carry out operational logic. | public void deposit() { } |

------------------------------
## Step 3: The Strict Grammar Rules
    If you break any of these four foundational formatting rules, the compiler will refuse to run your program:

    * Semicolons ;: Every individual action statement must end with a semicolon. It acts like a full stop at the end of a sentence.
    * Curly Braces { }: Used to group blocks of code together. Classes, methods, loops, and conditional structures all wrap their contents inside curly braces.
    * Case Sensitivity: Java treats uppercase and lowercase letters as completely different things. myVariable, MyVariable, and MYVARIABLE are three separate entities.
    * Double vs Single Quotes: Text strings must use double quotes ("Hello"). Individual, single characters must use single quotes ('A'). [20, 21, 22, 23, 24] 

------------------------------
## Step 4: Decoding the Complex Keywords
When you look at a standard Java line like public static final void main(String[] args), it looks like gibberetics. Break it down using this code-breaking key:

    ## 1. Visibility (Who can see this?)

        * public: Anyone in the entire program can use this.
        * private: Only this specific class can see or touch this. [25, 26] 

    ## 2. Ownership (Who owns this code?)

        * static: Belonging to the class as a whole. You do not need to create an object instance to run this.
        * No static keyword: Belonging to an object instance. You must use the new keyword to build an object before you can use this code. [27, 28, 29, 30, 31] 

    ## 3. Mutability (Can it change?)

        * final: A constant lock. Once assigned, this variable's value can never be altered or updated. [32, 33, 34] 

    ## 4. Return Output (What does it give back?)

        * void: This method performs a quick job but returns no data back when finished.
        * int, double, String, etc.: The method must calculate a result and pass it back using the return keyword. [35, 36, 37, 38, 39] 

------------------------------
## Step 5: Data Typing (The Strict Registry)
    Java is statically typed, meaning you must register what kind of data an item holds before you can even store it. [40, 41] 

    // Syntax: [Type] [Name] = [Value];int speedLimit = 60;boolean isEngineOn = true;



-----------------------------------------------------------------------------------------------------------------------------------------
example code
package com.example.app; // 1. Package first

import java.time.LocalDate; // 2. Imports second

public class Employee { // 3. Public class matching the filename "Employee.java"

    // 4. Fields (Encapsulation via private access)
    private String name;
    private double salary;
    
    // 5. Static Field (Shared constant value across all employees)
    public static final String COMPANY_NAME = "TechCorp";

    // 6. Constructor (Special method to build the object - no return type)
    public Employee(String name, double salary) {
        this.name = name; // Using 'this' to target class field
        this.salary = salary;
    }

    // 7. Instance Method (Requires an object instance to run)
    public double calculateAnnualBonus(double percentage) {
        double bonus = this.salary * (percentage / 100); // Local variable
        return bonus; // Return keyword matching method double type
    }

    // 8. Static Method (Can run without any objects existing)
    public static void printCompanyPolicy() {
        System.out.println("Welcome to " + COMPANY_NAME);
        // cannot look at 'this.name' here because static has no instance context!
    }
}
