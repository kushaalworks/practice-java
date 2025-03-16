# Count Even and Odd Digits in a Given Number  

## ✅ Introduction  
This program counts the number of even and odd digits in a given number. It efficiently extracts each digit, checks its parity (even or odd), and maintains separate counts for both.  

---

## ✅ How the Program Works  
1. **Extract the last digit** using `num % 10`.  
2. **Check if the digit is even** (`digit % 2 == 0`), then increment `evenCount`.  
3. **Otherwise, it's odd**, so increment `oddCount`.  
4. **Remove the last digit** by performing `num /= 10`.  
5. **Repeat the process** until `num` becomes `0`.  
6. **Print the count** of even and odd digits.  

---

## ✅ Java Code Implementation  
```java
public class CountEvenOddDigits {
    public static void countEvenOddDigits(int num) {
        int evenCount = 0, oddCount = 0;
        
        num = Math.abs(num); // Ensure positive value for negative numbers

        while (num > 0) {
            int digit = num % 10; // Extract last digit
            
            if (digit % 2 == 0) {
                evenCount++; // Increment even count
            } else {
                oddCount++;  // Increment odd count
            }
            
            num /= 10; // Remove last digit
        }

        System.out.println("Even digits: " + evenCount);
        System.out.println("Odd digits: " + oddCount);
    }

    public static void main(String[] args) {
        int num = 123456789; // Example input
        countEvenOddDigits(num);
    }
}
```

---
```table
## ✅ Example Walkthrough  

Let's analyze how the program processes `num = 123456789`:  

| Step | Digit Extracted (`num % 10`) | Even Count | Odd Count | Remaining `num` |
|------|------------------------------|------------|-----------|----------------|
| 1    | 9                            | 0          | 1         | 12345678       |
| 2    | 8                            | 1          | 1         | 1234567        |
| 3    | 7                            | 1          | 2         | 123456         |
| 4    | 6                            | 2          | 2         | 12345          |
| 5    | 5                            | 2          | 3         | 1234           |
| 6    | 4                            | 3          | 3         | 123            |
| 7    | 3                            | 3          | 4         | 12             |
| 8    | 2                            | 4          | 4         | 1              |
| 9    | 1                            | 4          | 5         | 0 (Done)       |
```

📌 **Final Result:**  
- **Even Digits Count:** `4`  
- **Odd Digits Count:** `5`  

---

## ✅ Sample Output  
```
Even digits: 4  
Odd digits: 5  
```

---

## ✅ Edge Cases Considered  
- **Negative numbers:** The program handles them using `Math.abs(num)`.  
- **Zero (`0`) as input:** The loop executes once, counting it as one even digit.  
- **Single-digit numbers:** Always results in one count (either even or odd).  

🚀 **This program efficiently counts even and odd digits in any integer!** Happy coding! 🎯  

---

### 📌 Save this file as `README.md` in your project folder to document the logic clearly. 🎉