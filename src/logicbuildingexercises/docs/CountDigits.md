# Count The Number of Digits in a Given Number 

Note: do-while loop explanation included.

## ✅ How Does a `do-while` Loop Work?

A `do-while` loop is a type of loop in Java (and many other programming languages) that ensures the code inside the loop executes **at least once**, regardless of the condition.

## 🔹 Syntax of `do-while` Loop

     do {
        // Code to execute
     } while (condition);

### Key Points:

* The **loop body executes first**.
* Then, the **condition is checked**.
* If the **condition is true**, the loop repeats.
* If the **condition is false**, the loop terminates.
## ✅ Key Features of `do-while`

1. **Guaranteed Execution**: The loop body runs at least once, even if the condition is false initially.
2. **Post-condition Loop**: The condition is checked **after** executing the loop body (unlike `while` where it is checked first).
3. **Use Case**: Suitable when execution is needed before checking the condition, such as **user input validation**.
## ✅ Example 1: Basic `do-while` Loop

    public class DoWhileExample {
        public static void main(String[] args) {
            int i = 1;
            do {
                System.out.println("Iteration: " + i);
                i++; // Increment i
            } while (i <= 5); // Condition check after loop body
        }
    }

### 🔹 Output:

    Iteration: 1
    Iteration: 2
    Iteration: 3
    Iteration: 4
    Iteration: 5

## ✅ Why Use `do-while` Instead of `while` for Counting Digits?

When counting the digits in a number, we must ensure that **at least one iteration occurs**, even if the number is `0`. The `do-while` loop is the best fit for this scenario because:

### ❌ Problem with `while` Loop:

    int count = 0;
    while (num > 0) {
        count++;
        num /= 10;
    }

* If `num = 0`, the condition `num > 0` **fails immediately**, and the loop **does not execute**, resulting in `count = 0` (incorrect output).
### ✅ Solution: Use `do-while`

    int count = 0;
    do {
        count++;
        num /= 10;
    } while (num > 0);

* Ensures **at least one iteration**, correctly counting `0` as one digit.
## ✅ Explanation of the `CountDigits` Program Step by Step

This Java program counts the number of digits in a given number, including negative numbers. It does this using a `do-while` loop, ensuring that at least one iteration occurs.

## 🛠 Code Breakdown:

### 1️⃣ `countDigits(int num)` Method

This method counts the digits in a number.
`` ` ``java
public static int countDigits(int num) {
`` ` ``

* Declares a static method `countDigits` that takes an `int` (`num`) as input.
* Returns the count of digits as an integer.
### 2️⃣ Handle Negative Numbers

    num = Math.abs(num); // Handle negative numbers

* `Math.abs(num)` converts `num` to absolute value.
* This ensures that a negative number does not interfere with digit counting.
    | Input (`num`) | After `Math.abs(num)` |
    |--------------|---------------------|
    | 9876        | 9876                |
    | -9876       | 9876                |
    | 0           | 0                    |

### 3️⃣ Initialize Count and Start Loop

    int count = 0;
    do {
        count++;  // Increment count
        num /= 10; // Remove last digit
    } while (num > 0);

* `count = 0`: Variable to store the number of digits.
* `do-while` Loop ensures at least one iteration (important for `0`).
* `count++`: Increment count for each digit.
* `num /= 10`: Removes the last digit (`num = num / 10`).
#### Loop Execution for `num = 9876`

    | Iteration | `num Before /= 10` | `num After /= 10` | `count` |
    |-----------|------------------|-----------------|--------|
    | 1st       | 9876             | 987             | 1      |
    | 2nd       | 987              | 98              | 2      |
    | 3rd       | 98               | 9               | 3      |
    | 4th       | 9                | 0               | 4      |
    | **Loop Ends** | 0 (Condition Fails) | - | - |

📌 **Final count = 4**, so `countDigits(9876)` returns `4`.

### 4️⃣ Return the Count

    return count;

* Returns the final digit count.
### 5️⃣ `main(String[] args)` Method

    public static void main(String[] args) {
        int num = -9876;
        System.out.println("Number of digits: " + countDigits(num));
    }

* Defines the main method, which runs the program.
* `num = -9876`: A negative number as input.
* Calls `countDigits(num)`.
* Prints the result: **"Number of digits: 4"**.
## 🖥 Output

    Number of digits: 4

✅ Handles negative numbers correctly!
✅ Works for zero (`0`) as well!

🚀 *Happy Coding!*

