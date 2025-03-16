# Sum of Digits of a Given Number  

## ✅ Introduction  
This program calculates the sum of the digits of a given number. It extracts each digit from the number, adds it to a running total, and continues until all digits have been processed.  

---

## ✅ How the Program Works  
1. **Extract the last digit** using `num % 10`.  
2. **Add the extracted digit** to the sum.  
3. **Remove the last digit** using `num /= 10`.  
4. **Repeat the process** until `num` becomes `0`.  
5. **Return the final sum** of the digits.  

---

## ✅ Java Code Implementation  
```java
public class SumOfDigits {
    public static int sumOfDigits(int num) {
        num = Math.abs(num); // Ensure positive value for negative numbers
        int sum = 0;

        while (num > 0) {
            int digit = num % 10; // Extract last digit
            sum += digit; // Add digit to sum
            num /= 10; // Remove last digit
        }

        return sum; // Return final sum
    }

    public static void main(String[] args) {
        int num = 12345; // Example input
        System.out.println("Sum of digits: " + sumOfDigits(num));
    }
}
```

---

## ✅ Example Walkthrough  
```table
Let's analyze how the program processes `num = 12345`:  

| Step | Extracted Digit (`num % 10`) | Sum So Far | Remaining `num` |
|------|------------------------------|------------|----------------|
| 1    | 5                            | 5          | 1234          |
| 2    | 4                            | 9          | 123           |
| 3    | 3                            | 12         | 12            |
| 4    | 2                            | 14         | 1             |
| 5    | 1                            | 15         | 0 (Done)      |
```

📌 **Final Result:**  
- **Sum of digits:** `15`  

---

## ✅ Sample Output  
```
Sum of digits: 15  
```

---

## ✅ Edge Cases Considered  
- **Negative numbers:** The program correctly handles them using `Math.abs(num)`.  
- **Zero (`0`) as input:** The sum remains `0` since there are no digits to add.  
- **Single-digit numbers:** The sum is simply the number itself.  

🚀 **This program efficiently calculates the sum of digits for any integer!** Happy coding! 🎯  

---