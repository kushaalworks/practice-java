Here’s a detailed `README.md` for **Digit Frequency Count** with the logic you provided.  

---

# 📌 Digit Frequency Count in a Given Number  

## ✅ Problem Statement  
Given an integer number, count the **frequency of each digit (0-9)** and determine the **most frequently occurring digit**.  

---

## ✅ Explanation  

### 1️⃣ **Digit Frequency Count**  
- We initialize an **array `digitCount[10]`** to store the **frequency of each digit** (0-9).  
- Extract the **last digit** using `num % 10`.  
- Increment its count in `digitCount[]`.  
- Remove the **last digit** using `num /= 10` (integer division).  
- Repeat until `num == 0`.  

### 2️⃣ **Find the Most Frequent Digit**  
- Loop through `digitCount[]` to find the **highest count**.  
- Store the **digit with the maximum frequency**.  

---

## ✅ **Java Code Implementation**  

```java
public class DigitFrequencyCount {
    public static void digitFrequency(int num) {
        num = Math.abs(num); // Handle negative numbers
        
        int[] digitCount = new int[10]; // Array to store frequency of digits (0-9)

        // Extract digits and update frequency array
        while (num > 0) {
            int digit = num % 10; // Get last digit
            digitCount[digit]++; // Increment count
            num /= 10; // Remove last digit
        }

        // Find the most frequently occurring digit
        int maxFreq = 0;
        int mostFrequentDigit = 0;
        
        for (int i = 0; i < 10; i++) {
            if (digitCount[i] > maxFreq) {
                maxFreq = digitCount[i];
                mostFrequentDigit = i;
            }
        }

        // Display frequency of each digit
        System.out.println("Digit Frequencies:");
        for (int i = 0; i < 10; i++) {
            if (digitCount[i] > 0) {
                System.out.println("Digit " + i + ": " + digitCount[i]);
            }
        }
        
        System.out.println("Most frequently occurring digit: " + mostFrequentDigit);
    }

    public static void main(String[] args) {
        int num = 1223334444; // Sample Input
        digitFrequency(num);
    }
}
```

---

## ✅ Example Walkthrough  

For **num = 1223334444** 

``` 
| Digit | Frequency |
|--------|----------|
| 1      | 1        |
| 2      | 2        |
| 3      | 3        |
| 4      | 4        |
``` 

🔹 **Most Frequent Digit:** `4`  

---

## ✅ **Output**  
```
Digit Frequencies:
Digit 1: 1
Digit 2: 2
Digit 3: 3
Digit 4: 4
Most frequently occurring digit: 4
```

---

## ✅ **Edge Cases Considered**  
```
| Input        | Expected Output |
|-------------|----------------|
| `111222`    | `1 or 2` (Both occur 3 times) |
| `9876543210` | `9 (or any, as all are unique)` |
| `9999999999` | `9 (Only digit present)` |
| `0`         | `0 (Only digit present)` |
```
---

🚀 *Now you can count digit frequencies efficiently!*