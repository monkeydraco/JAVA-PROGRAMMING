# Java Packages, Compilation, Execution, and Classpath

## Introduction

This document explains the theory behind Java packages, compilation, execution, classpaths, and the common error:

```text
Error: Could not find or load main class
Caused by: java.lang.NoClassDefFoundError
```

---

# 1. What is a Java Class?

A class is the basic building block of a Java program.

```java
public class Hello {
    public static void main(String[] args) {
        System.out.println("Hello World");
    }
}
```

- Class Name = Hello
- File Name = Hello.java

For public classes:

```text
Class Name = File Name
```

---

# 2. What is a Package?

A package is a namespace used to organize related classes.

```java
package DAY1;

public class prog1 {
}
```

- Package Name = DAY1
- Class Name = prog1

Fully Qualified Class Name (FQCN):

```text
DAY1.prog1
```

---

# 3. Why Do We Need Packages?

Packages prevent naming conflicts and help organize large projects.

Example:

```java
package com.company.student;
public class Student {}

package com.company.teacher;
public class Student {}
```

These are different classes because they belong to different packages.

---

# 4. Relationship Between Packages and Folders

Java requires package names to match folder structures.

```java
package DAY1;
```

Folder structure:

```text
JAVA-PROGRAMMING
│
└── DAY1
    └── prog1.java
```

---

# 5. Source Code vs Bytecode

Flow:

```text
prog1.java
    ↓
Compilation
    ↓
prog1.class
    ↓
JVM Execution
```

---

# 6. What Does javac Do?

The compiler converts source code into bytecode.

Compile:

```bash
javac DAY1/prog1.java
```

Important:

- Works with actual files
- Uses folder paths
- Uses slashes (/)

---

# 7. Why Does javac Use "/"?

Because javac communicates with the operating system.

Correct:

```bash
javac DAY1/prog1.java
```

Wrong:

```bash
javac DAY1.prog1.java
```

The compiler expects a file path, not a package name.

---

# 8. What Does java Do?

The JVM executes classes.

Run:

```bash
java DAY1.prog1
```

Notice:

- No .java
- No .class

Because the JVM uses class names, not file names.

---

# 9. Why Does java Use "."?

Java uses dots to represent package ownership.

```java
package DAY1;
```

Means:

```text
prog1 belongs to package DAY1
```

Therefore:

```bash
java DAY1.prog1
```

---

# 10. Difference Between javac and java

| Feature | javac | java |
|----------|--------|--------|
| Purpose | Compile | Execute |
| Works With | Files | Classes |
| Separator | / | . |
| Extension Needed | .java | None |
| Uses OS Paths | Yes | No |
| Uses Class Names | No | Yes |

Compile:

```bash
javac DAY1/prog1.java
```

Run:

```bash
java DAY1.prog1
```

---

# 11. Understanding Classpath

Classpath tells Java where to search for classes.

Think of it as:

```text
Java Search Location
```

Default:

```text
Current Directory
```

---

# 12. Correct Execution Example

Project:

```text
JAVA-PROGRAMMING
│
└── DAY1
    ├── prog1.java
    └── prog1.class
```

Current directory:

```text
JAVA-PROGRAMMING
```

Run:

```bash
java DAY1.prog1
```

The JVM successfully finds:

```text
DAY1/prog1.class
```

---

# 13. Why Running Inside DAY1 Causes Errors

If you are inside:

```text
JAVA-PROGRAMMING/DAY1
```

and run:

```bash
java prog1
```

the JVM expects:

```text
prog1.class
```

But the class identifies itself as:

```java
package DAY1;
```

Meaning its actual identity is:

```text
DAY1.prog1
```

This mismatch causes:

```text
NoClassDefFoundError
```

---

# 14. Internal JVM Class Loading Process

When running:

```bash
java DAY1.prog1
```

The JVM:

1. Reads the classpath.
2. Converts package names into folder paths.
3. Searches for the class file.
4. Loads bytecode into memory.
5. Finds the main method.
6. Starts execution.

Example:

```text
DAY1.prog1
      ↓
DAY1/prog1.class
```

---

# 15. Fully Qualified Class Name (FQCN)

Format:

```text
PackageName.ClassName
```

Examples:

```text
DAY1.prog1
java.util.Scanner
java.lang.String
java.io.File
```

---

# 16. Real Industry Project Structure

```text
src
│
└── com
    └── company
        └── attendance
            ├── controller
            ├── service
            ├── repository
            ├── model
            └── Main.java
```

Packages:

```java
package com.company.attendance.controller;
```

```java
package com.company.attendance.service;
```

```java
package com.company.attendance.repository;
```

---

# 17. Key Learning Outcomes

After studying this topic you should understand:

- What packages are
- Why package names match folders
- Source code vs bytecode
- Difference between javac and java
- Why javac uses "/"
- Why java uses "."
- What a classpath is
- What an FQCN is
- How JVM class loading works
- How professional Java projects are structured

---

# Final Summary

## File System World

Used by:

```bash
javac
```

Example:

```bash
javac DAY1/prog1.java
```

Works with:

- Files
- Folders
- Paths
- Slashes (/)

---

## JVM World

Used by:

```bash
java
```

Example:

```bash
java DAY1.prog1
```

Works with:

- Packages
- Classes
- Namespaces
- Dots (.)

---

## Golden Rule

**javac works with file paths, while java works with fully qualified class names.**
