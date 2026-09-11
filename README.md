# Java Basics — Training Program

This repo contains the Java basic code I learned during a training program. After that training, I started learning Java as a beginner. Each file below covers one core concept, written and tested while working through daily exercises (`Day_1` → `Day_5`).

## Files in this repo

1. **`ASCII.java`** — Demonstrates ASCII character manipulation: converting between `char` and its numeric ASCII value.
2. **`Do_While_loop.java`** — Implements a `do-while` loop based calculator and a bill/menu system to practice loop-controlled repeated input.
3. **`For_loop.java`** — Covers various number operations (sums, patterns, checks) using the `for` loop.
4. **`Operation.java`** — Basic arithmetic and general Java operations (a warm-up file for operators and expressions).
5. **`Patterns.java`** — Prints number/star patterns using nested loops, a classic exercise for practicing loop logic.
6. **`Type_casting.java`** — Explains `type casting` in Java: implicit (widening) and explicit (narrowing) conversion between data types.

>  `Note`: Package declarations were commented out in some files (`Operation.java`, `Patterns.java`) since they were run as standalone files outside a package structure.

## Project structure (Eclipse)

```
Training
└── src
    ├── Loops
    ├── Patterns
    ├── Operation
    ├── Basic
    └── module-info.java
```



## Setting up in Eclipse — Project, Package, Class

### 🔹 What is a Project?
A **Project** is the top-level container for everything related to your program — source files, libraries (`JRE System Library`), build settings, and configuration files, all managed as one unit inside your Eclipse `workspace`. Each project gets its own folder on disk and its own build path, so different projects don't interfere with each other. Think of it as the "whole app" wrapper: one project can contain many packages, and each package can contain many classes.
 
- **Create a Project** — `File` → `New` → `Java Project`, give it a name (e.g. `Training`), and select an installed JDK (this repo uses `JavaSE-21`).
### 🔹 What is a Package?
A **Package** is a namespace used to group related classes together, similar to a folder in a file system. Packages prevent naming conflicts (two classes with the same name can coexist if they're in different packages), make code easier to navigate as a project grows, and control access via visibility rules (e.g. `package-private` members). Package names are usually lowercase and can be nested with dots (e.g. `com.training.day1`) — in this repo, packages are simply named by day (`Operation`, `Patterns`, etc.) to group each day's exercises.
 
- **Create a Package** — right-click `src` → `New` → `Package`, name it (e.g. `Basic`).
### 🔹 What is a Class?
A **Class** is a blueprint that defines the structure and behavior of an object — it can hold `fields` (variables that store data), `methods` (functions that define behavior), and constructors (used to create objects from the class). In Java, each `.java` file typically contains one public class with the same name as the file (e.g. `ASCII.java` contains `class ASCII`). If a class includes a `main` method, it becomes an entry point that can be run directly as a program.
 
- **Create a Class** — right-click the package → `New` → `Class`, name it (e.g. `ASCII`).
### 🔹 Running and modules
 
4. **Run a Class** — right-click the `.java` file → `Run As` → `Java Application`. Eclipse compiles and executes the `main` method inside that class.
5. **`module-info.java`** — an optional file at the `src` root that declares the project as a Java module (JPMS), listing which packages it exports/requires. Not required for simple learning projects, but Eclipse adds it automatically for modular Java projects.

## Prerequisites

- **JDK 21** (or compatible) installed
- **Eclipse IDE** for Java Developers
- Basic familiarity with the Eclipse workspace and Package Explorer

## Topics covered so far

- ASCII value conversion
- Loops: `for`, `do-while`
- Number and star patterns
- Type casting (implicit & explicit)
- Basic operators and expressions

More topics will be added here as the training continues.
