# Java Operators Explained

## 📌 Overview
Operators in Java are special symbols that perform operations on variables and values. They are categorized into different types based on their functionality.

---

## 📂 Types of Operators in Java

```table
| Operator Type       | Symbol(s)        | Description |
|---------------------|---------------   |-------------|
| **Arithmetic**      | `+ - * / %`      | Used for basic mathematical operations |
| **Relational**      | `> < >= <= ==!=` | Used for comparing values |
| **Logical**         | `&& || !`        | Used for boolean logic (AND, OR, NOT) |
| **Bitwise**         | `& | ^ ~ << >>`  | Works at the binary level on bits |
| **Assignment**      | `= += -= *= /=`  | Assigns values to variables |
| **Unary**           | `++ --`          | Increments or decrements a value |
| **Ternary**         | `? :`            | Short form of an if-else statement |
```
---

## 🔹 **1. Arithmetic Operators**
These operators perform basic math operations.

Operator:

```java
int a = 10, b = 5;
System.out.println(a + b); // Addition -> 15
System.out.println(a - b); // Subtraction -> 5
System.out.println(a * b); // Multiplication -> 50
System.out.println(a / b); // Division -> 2
System.out.println(a % b); // Modulus -> 0
```

##### **Difference Between / (Division) and % (Modulus) in Java**
✅ Division Operator (/)
It divides two numbers and returns the quotient.
If both operands are integers, it performs integer division (removes the decimal part).
If at least one operand is a floating-point number, it performs floating-point division.

✅ Modulus Operator (%)
It returns the remainder after division.
Used to find out if a number is even or odd or to cycle through values.

##### Mathematical Operator
Let's take 15 ÷ 4 as an Operator:

##### Using Division (/)

```math
15 / 4 = 3.75
In Integer Division (int / int): 15 / 4 results in 3 (decimal part is removed).
In Floating-Point Division (double / int): 15.0 / 4 results in 3.75.
```

##### Using Modulus (%)

```math
15 % 4 = 3
15 ÷ 4 gives a quotient of 3 and a remainder of 3.
So, 15 % 4 returns 3.
```

##### Summary Table

```table
| Operator  | Symbol  | Meaning                                               | Operator   | Output  |
|-----------|-------- |-----------------------------------------------        |-----------|---------|
| **Division** | `/`  | Quotient (Integer if both are integers)               | `15 / 4`  | `3`     |
| **Division** | `/`  | Quotient (Floating-point if any operand is `double`)  | `15.0 / 4`| `3.75`  |
| **Modulus**  | `%`  | Remainder                                             | `15 % 4`  | `3`     |
```

##### Explanation:
- **Division (`/`)** returns the **quotient** of the division.
- If both operands are **integers**, Java performs **integer division**, truncating the decimal part.
- If at least one operand is **floating-point**, Java performs **floating-point division** and retains decimals.
- **Modulus (`%`)** returns the remainder after division.

##### Operator Code:

```java
public class DivisionModulusOperator {
    public static void main(String[] args) {
        int a = 15, b = 4;
        System.out.println("Integer Division: " + (a / b)); // Output: 3
        System.out.println("Modulus: " + (a % b)); // Output: 3

        double x = 15.0, y = 4.0;
        System.out.println("Floating-Point Division: " + (x / y)); // Output: 3.75
    }
}
```

For a detailed understanding, check out the **[DivisionAndModulus](DivisionAndModulus.java)** program.

## 🔹 **2. Relational Operators**

### What Are Relational Operators?
Relational operators in Java are used to **compare two values** and return a **boolean result (`true` or `false`)**. These operators help in decision-making (e.g., `if` conditions, loops). 

##### Summary Table

```table
| Operator | Symbol  | Meaning                    | Operator (`a = 10, b = 5`) | Output  |
|----------|---------|----------------------------|---------------------------|---------|
| **Equal to**        | `==`  | Checks if two values are equal         | `a == b`  | `false` |
| **Not equal to**    | `!=`  | Checks if two values are not equal     | `a != b`  | `true`  |
| **Greater than**    | `>`   | Checks if left value is greater        | `a > b`   | `true`  |
| **Less than**       | `<`   | Checks if left value is smaller        | `a < b`   | `false` |
| **Greater than or equal to** | `>=` | Checks if left value is greater or equal | `a >= b` | `true`  |
| **Less than or equal to** | `<=` | Checks if left value is smaller or equal | `a <= b` | `false` |

```

##### Explanation:
- **Relational operators always return a boolean (`true` or `false`).**
- Used in **conditional statements** like `if`, `while`, and `for` loops.
- Can compare **integers, floating-point numbers, characters, and even objects (with `equals()` method).**

##### Operator Code:

```java
public class RelationalOperatorsOperator {
    public static void main(String[] args) {
        int a = 10, b = 5;
        
        System.out.println("a == b : " + (a == b));  // false
        System.out.println("a != b : " + (a != b));  // true
        System.out.println("a > b  : " + (a > b));   // true
        System.out.println("a < b  : " + (a < b));   // false
        System.out.println("a >= b : " + (a >= b));  // true
        System.out.println("a <= b : " + (a <= b));  // false
    }
}
```

## 🔹 **3. Logical Operators**

### What Are Logical Operators?
Logical operators in Java are used to perform **boolean logic operations** on expressions that return `true` or `false`. These operators are commonly used in **conditional statements and loops**.

##### Summary Table

```table
| Operator        | Symbol  | Meaning                                            | Operator (`a = true, b = false`) | Output  |
|----------       |---------|----------------------------                        |-------------------------------  |---------|
| **Logical AND** | `&&`    | Returns `true` if both conditions are `true`       | `a && b`                        | `false` |
| **Logical OR**  | `||`    | Returns `true` if at least one condition is `true` | `a || b`                        | `true`  |
| **Logical NOT** | `!`     | Reverses the boolean value                         | `!a`                            | `false` |

```

##### Explanation:
- **Logical AND (`&&`)**: Returns `true` if **both** conditions are `true`, otherwise returns `false`.
- **Logical OR (`||`)**: Returns `true` if **at least one** condition is `true`, otherwise returns `false`.
- **Logical NOT (`!`)**: Returns the **opposite** of the given boolean value (`true` → `false`, `false` → `true`).
- **Short-Circuit Behavior**:
  - In `&&`, if the first condition is `false`, the second condition is **not evaluated**.
  - In `||`, if the first condition is `true`, the second condition is **not evaluated**.


## Summary:
- && (AND) → Both conditions must be true.
- || (OR) → At least one condition must be true.
- ! (NOT) → Flips true to false and vice versa.
- Short-circuiting improves performance by skipping unnecessary evaluations.

##### For a detailed understanding, refer to:
- For a detailed understanding on LogicalAndOperator, check out the **[LogicalAndOperator](LogicalAndOperator.java)** program.
- For a detailed understanding on LogicalOrOperator, check out the **[LogicalOrOperator](LogicalOrOperator.java)** program.
- For a detailed understanding on LogicalNotOperator , check out the **[LogicalNotOperator](LogicalNotOperator.java)** program.
- For a detailed understanding on ShortCircuitBehavior, check out the **[ShortCircuitBehavior](ShortCircuitBehavior.java)** program.
