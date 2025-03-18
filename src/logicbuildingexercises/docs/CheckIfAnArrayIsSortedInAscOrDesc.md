## **📌 Problem Statement**  
Write a Java program to determine if an array is sorted in **ascending order**, **descending order**, or **unsorted**.  

---

## **💡 Approach**  
The program uses two **boolean flags** to track whether the array is strictly **ascending** or **descending** and iterates through the array to compare each element with its previous one.

---

## **🚀 Step-by-Step Explanation**  

### **✅ Step 1: Initialize an Array**  
```java
int arr[] = {5, 2, 3, 2, 1};
```
- The array `{5, 2, 3, 2, 1}` is taken as input.  
- Our goal is to determine whether it is **sorted in ascending**, **descending**, or **unsorted**.  

---

### **✅ Step 2: Declare Flags**  
```java
boolean ascending = true;  
boolean descending = true;
```
- Two **boolean flags** are used to track the order of the array.  
- Initially, both are set to `true`.  
- As we iterate through the array, we update these flags based on element comparisons.  

---

### **✅ Step 3: Iterate Through the Array**  
```java
for (int i = 1; i < arr.length; i++) 
```
- Start from **index 1** and traverse the array.  
- Each element is compared with its **previous** element (`arr[i-1]`).  
- Why start from `i = 1`?  
  - Because we need to compare `arr[i]` with `arr[i-1]`.  

---

### **✅ Step 4: Check Sorting Order**  
```java
if (arr[i] < arr[i-1]) {  
    ascending = false;  // If an element is smaller than the previous, it's not ascending.
}  
if (arr[i] > arr[i-1]) {  
    descending = false; // If an element is larger than the previous, it's not descending.
}
```
- If `arr[i] < arr[i-1]`, it means the array is **not in ascending order**, so set `ascending = false`.  
- If `arr[i] > arr[i-1]`, it means the array is **not in descending order**, so set `descending = false`.  
- If both flags become `false`, the array is **unsorted**.  

---

### **✅ Step 5: Print the Result**  
```java
if (ascending == true) {  
    System.out.println("The array is ascending");  
} else if (descending == true) {  
    System.out.println("The array is descending");  
} else {  
    System.out.println("The array is unsorted");  
}
```
- If `ascending` is `true`, the array is sorted in **ascending order**.  
- If `descending` is `true`, the array is sorted in **descending order**.  
- If both flags are `false`, the array is **unsorted**.  

---

## **📌 Java Code Implementation**  
```java
public class CheckSortedArray {
    public static void main(String[] args) {
        int arr[] = {5, 2, 3, 2, 1};

        boolean ascending = true;
        boolean descending = true;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                ascending = false;
            }
            if (arr[i] > arr[i - 1]) {
                descending = false;
            }
        }

        if (ascending) {
            System.out.println("The array is ascending");
        } else if (descending) {
            System.out.println("The array is descending");
        } else {
            System.out.println("The array is unsorted");
        }
    }
}
```

---

## **🔍 Example Walkthroughs**  

### **Example 1: Ascending Order**  
#### **Input:**  
```java
int arr[] = {1, 2, 3, 4, 5};
```
#### **Step-by-Step Execution:**
```  
| Step | `arr[i]` | `arr[i-1]` | Condition | `ascending` | `descending` |
|------|---------|-----------|------------|-------------|-------------|
| 1    | 2       | 1         | `2 > 1` → **Ascending** | ✅ `true` | ❌ `false` |
| 2    | 3       | 2         | `3 > 2` → **Ascending** | ✅ `true` | ❌ `false` |
| 3    | 4       | 3         | `4 > 3` → **Ascending** | ✅ `true` | ❌ `false` |
| 4    | 5       | 4         | `5 > 4` → **Ascending** | ✅ `true` | ❌ `false` |
```

#### **Final Flags:**  
✅ `ascending = true`  
❌ `descending = false`  

#### **Output:**  
```
The array is ascending
```

---

### **Example 2: Descending Order**  
#### **Input:**  
```java
int arr[] = {5, 4, 3, 2, 1};
```
#### **Step-by-Step Execution:** 
``` 
| Step | `arr[i]` | `arr[i-1]` | Condition | `ascending` | `descending` |
|------|---------|-----------|------------|-------------|-------------|
| 1    | 4       | 5         | `4 < 5` → **Descending** | ❌ `false` | ✅ `true` |
| 2    | 3       | 4         | `3 < 4` → **Descending** | ❌ `false` | ✅ `true` |
| 3    | 2       | 3         | `2 < 3` → **Descending** | ❌ `false` | ✅ `true` |
| 4    | 1       | 2         | `1 < 2` → **Descending** | ❌ `false` | ✅ `true` |
```

#### **Final Flags:**  
❌ `ascending = false`  
✅ `descending = true`  

#### **Output:**  
```
The array is descending
```

---

### **Example 3: Unsorted Array**  
#### **Input:**  
```java
int arr[] = {5, 2, 3, 2, 1};
```
#### **Step-by-Step Execution:**
```  
| Step | `arr[i]` | `arr[i-1]` | Condition | `ascending` | `descending` |
|------|---------|-----------|------------|-------------|-------------|
| 1    | 2       | 5         | `2 < 5` → **Descending** | ❌ `false` | ✅ `true` |
| 2    | 3       | 2         | `3 > 2` → **Unsorted** | ❌ `false` | ❌ `false` |
| 3    | 2       | 3         | `2 < 3` → **Unsorted** | ❌ `false` | ❌ `false` |
| 4    | 1       | 2         | `1 < 2` → **Unsorted** | ❌ `false` | ❌ `false` |
```

#### **Final Flags:**  
❌ `ascending = false`  
❌ `descending = false`  

#### **Output:**  
```
The array is unsorted
```

---

## **📝 Summary Table**  
```
| Array Input | Output |
|-------------|--------|
| `{1, 2, 3, 4, 5}` | The array is **ascending** |
| `{5, 4, 3, 2, 1}` | The array is **descending** |
| `{5, 2, 3, 2, 1}` | The array is **unsorted** |
```
---