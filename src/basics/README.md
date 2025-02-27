# 🏗️ Basics of Java

Welcome to the **Basics** section of this Java tutorial! Here, you'll learn about fundamental Java concepts such as **variables, data types, loops, and control flow**.

## 📌 Topics Covered
1. [Variables and Data Types](./VariablesAndDataType.java) – Understanding different data types in Java.
2. [Type Casting](./TypeCasting.java) – Learn about type casting - implicit and explicit type casting.

---

## 📝 **1. Variables and Data Types**
Variables store data, and data types define what kind of data a variable holds.  
Here’s an example:

```java
int age = 25; // Integer variable
double price = 99.99; // Decimal number
char grade = 'A'; // Single character
boolean isJavaFun = true; // Boolean value
String name = "John Doe"; // String type
```

### Java Data Types - A Beginner's Guide
Data types in Java define the type of data a variable can store. Java is strongly typed, meaning every variable must have a declared type before use.

##### Categories of Data Types in Java
Java data types are broadly classified into:
Primitive Data Types (Stores simple values)
Non-Primitive Data Types (Reference types like arrays, objects, and collections)

Primitive Data Types (Built-in types)
Primitive data types are the most basic data types that store values directly in memory. Java provides eight primitive types, divided into four categories:

```text
Integer Types : byte (1 byte, default value: 0), short (2 bytes, default value: 0), int(4 bytes, default value: 0), long(8 bytes, default value: 0L)
Floating-Point : float (4 bytes, default value: 0.0f), double(8 bytes, default value: 0.0d)
Character Type : char(2 bytes, default value: '\u0000')
Boolean Type : boolean(1 bit, default value: false)
```

```table
| Data Type | Size (Bytes) | Size (Bits) | Binary Representation |
|-----------|-------------|-------------|------------------------|
| `byte`    | 1 byte      | 8 bits      | `00001111` (Example: 15) |
| `short`   | 2 bytes     | 16 bits     | `00000000 00001111` (15) |
| `int`     | 4 bytes     | 32 bits     | `00000000 00000000 00000000 00001111` (15) |
| `long`    | 8 bytes     | 64 bits     | `00000000 00000000 00000000 00000000 00000000 00000000 00000000 00001111` (15) |
| `float`   | 4 bytes     | 32 bits     | IEEE 754 representation |
| `double`  | 8 bytes     | 64 bits     | IEEE 754 representation |
| `char`    | 2 bytes     | 16 bits     | Unicode encoding |
| `boolean` | 1 bit (or 1 byte depending on JVM) | 1 bit (or 8 bits) | `00000001` (true), `00000000` (false) |
```

## 📝 **2. Type casting - Implicit and Explicit Type Casting**
Type casting in Java is the process of converting a variable from one data type to another. It is classified into two types:
1️ Implicit Type Casting (Widening) – Automatically done by Java when converting a smaller data type to a larger data type.
2️ Explicit Type Casting (Narrowing) – Requires manual conversion when changing a larger data type to a smaller data type.

### Implicit Type Casting (Widening)
✅ Happens automatically when converting smaller data types into larger ones.
✅ No data loss occurs.
✅ Follows this order:
byte → short → int → long → float → double

##### Why Do We Need Implicit Type Casting in Java?
Implicit type casting, also known as widening conversion, is required when we assign a smaller data type to a larger data type. It helps prevent data loss and allows operations between different data types to occur seamlessly.

📌 Example: Implicit Casting in Action
int num = 10;
double result = num; // Implicit casting (int → double)
System.out.println(result); // Output: 10.0

##### Why does this work?
An int (4 bytes) is safely converted into a double (8 bytes).
Java automatically does the conversion without explicit intervention.

##### What Happens in the Background During Implicit Type Casting?
When implicit casting happens, Java allocates memory and reinterprets the binary representation of the value at a lower level.

##### Memory Expansion (Widening)
When converting smaller types to larger types, Java internally:
Allocates a larger memory space for the new variable.
Retains the original value and extends it without modifying data.

```java
int num = 100;
double d = num; // Implicit casting (int → double)
System.out.println(d); // 100.0
```

##### Binary Breakdown
##### Data Type and Memory Representation
```table
| Data Type       | Binary Representation of 100                                      | Memory Size |
|---------------- |-------------------------------------------------------------------|-------------|
| `int num = 100` | `00000000 00000000 00000000 01100100`                             | 4 bytes     |
| `double d = num`| `0100000001011001000000000000000000000000000000000000`            | 8 bytes     |
```

Notice how int gets converted into a double without loss of precision.

### Explicit Type Casting (Narrowing)
✅ Must be done manually using (dataType) syntax.
✅ Can lead to data loss if the target type cannot hold the original value.
✅ Follows this order:
double → float → long → int → short → byte

Explicit type casting (also called narrowing conversion) occurs when converting a larger data type into a smaller one. Since this may lead to data loss or precision loss, it must be done manually using type casting syntax.

#####📌 Syntax of Explicit Casting:

dataType variableName = (dataType) value;

##### What Happens in the Background During Explicit Type Casting?
When explicitly casting a larger type to a smaller type, Java performs truncation or rounding to fit the data into the smaller type.

##### Memory Truncation (Narrowing)
Java removes extra bits from the original data to fit it into the new data type.

##### 📌 Example: Converting double to int
```java
double num = 10.99;
int result = (int) num; // Explicit casting (double → int)
System.out.println(result); // Output: 10
```

##### Binary Breakdown
##### Data Type and Memory Representation
```table
| **Data Type**            | **Binary Representation**                                           | **Memory Size** |
|------------------------  |-------------------------------------------------------------------  |---------------  |
| `double num = 10.99`     | `0100000000100101111100111011111000110101110000101000111101011100`  | **8 bytes**     |
| `int result = (int) num` | `00000000 00000000 00000000 00001010`                               | **4 bytes**     |
```