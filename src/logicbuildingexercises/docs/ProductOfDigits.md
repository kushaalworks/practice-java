# 📌 Product of Digits in a Given Number

## ✅ Problem Statement
Write a program to calculate the **product of digits** in a given number.

- If the number contains `0`, the product will be `0` since anything multiplied by `0` is `0`.
- If the number is negative, consider its **absolute value**.
- If the number is a single digit, the product is the number itself.

---

## ✅ Approach
We extract each digit from the number and multiply it to get the final product.

### 🔹 Steps:
1. Extract the last digit using `num % 10`.
2. Multiply it with `product`.
3. Remove the last digit using `num /= 10`.
4. Repeat until `num == 0`.
5. Return the final **product**.

---

## ✅ Code Implementation (Java)
```java
public class ProductOfDigits {
    public static int productOfDigits(int num) {
        num = Math.abs(num); // Handle negative numbers
        if (num == 0) return 0; // Edge case: if num is 0, return 0

        int product = 1;

        while (num > 0) {
            product *= num % 10; // Extract last digit and multiply
            num /= 10; // Remove last digit
        }

        return product;
    }

    public static void main(String[] args) {
        int num = 1234;
        System.out.println("Product of digits: " + productOfDigits(num));
    }
}
```

---

```
## ✅ Example Walkthrough

Let's take **num = 1234** and go step by step:

| Step | Extracted Digit (`num % 10`) | Product So Far | Remaining num (`num /= 10`) |
|------|-----------------------------|---------------|----------------------------|
| 1    | 4                           | 1 × 4 = 4     | 123                        |
| 2    | 3                           | 4 × 3 = 12    | 12                         |
| 3    | 2                           | 12 × 2 = 24   | 1                          |
| 4    | 1                           | 24 × 1 = 24   | 0 (Done)                   |
```

📌 **Final Product:** `24`

---

## ✅ Sample Output:
```
Product of digits: 24
```

---

## ✅ Edge Cases Considered
```table
| Input  | Expected Output |
|--------|---------------|
| `0`    | `0`           |
| `5`    | `5`           |
| `101`  | `0` (since 1×0×1 = 0) |
| `-234` | `24` (absolute value used) |
```
---

## ✅ Time Complexity Analysis
- Extracting each digit takes **O(log N)** time, where **N** is the number of digits.
- Overall **Time Complexity:** **O(log N)**.
- **Space Complexity:** **O(1)** (constant space usage).

---

🚀 *Now you can compute the product of digits easily!* 🎯