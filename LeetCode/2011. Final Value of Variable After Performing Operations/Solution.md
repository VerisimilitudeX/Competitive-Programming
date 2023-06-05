# SIMPLE & EFFICIENT Java Solution BEATS 95%

# Intuition
To solve this problem, I need to keep track of the value of x and update it according to the operations in the array.
# Approach
I will use a variable x to store the value of x and initialize it to zero. Then I will loop through the array of operations and use a switch statement to check each operation and increment or decrement x accordingly.

# Complexity
- Time complexity:
The time complexity is $$O(n)$$ where n is the length of the array, because I need to iterate through all the operations once.

- Space complexity:
The space complexity is $$O(1)$$ because I only use a constant amount of extra space for the variable x.

# Code
```JAVA
class Solution {
 public int finalValueAfterOperations(String[] operations) {
 int x = 0;
 int size = operations.length; // store the size of the array
 for (int i = 0; i < size; i++) { // use the size variable
 String operation = operations[i]; // store the operation in a variable
 switch (operation) { // use switch statement
 case "++X":
 case "X++":
 x++;
 break;
 case "--X":
 case "X--":
 x--;
 break;
 }
 }
 return x;
 }
}

```