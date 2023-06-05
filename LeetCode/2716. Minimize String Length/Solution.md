# 2716. LeetCode's Minimize String Length - FASTEST JAVA SOLUTION BEATS 100% OF SOLUTIONS!!!!

# Intuition
The problem is to find the minimum length of a string after removing all duplicate characters. One way to solve this problem is to use a boolean array to keep track of which characters have been seen before in the string. Then, we can iterate over the string and count how many unique characters there are. This will give us the minimum length of the string.

# Approach
We can use a boolean array of size 26 to represent the 26 lowercase letters in the alphabet. We initialize all the elements to false, meaning that we have not seen any character yet. Then, we convert the input string to a char array and loop through it. For each character, we check its corresponding index in the boolean array. If it is false, we set it to true and increment a counter variable. If it is true, we ignore it and move on to the next character. At the end of the loop, the counter variable will hold the number of unique characters in the string, which is also the minimum length of the string after removing duplicates.

# Complexity
- Time complexity:
The time complexity of this solution is $$O(n)$$, where n is the length of the input string. This is because we only need to loop through the string once and perform constant time operations for each character.

- Space complexity:
The space complexity of this solution is $$O(1)$$, because we only use a fixed size boolean array and a few variables that do not depend on the input size.

# Code
```java
import java.util.ArrayList;

class Solution {
    public int minimizedStringLength(String s) {
        char[] characters = s.toCharArray();
        int count = 0;
        boolean[] seen = new boolean[26];
        for (int i = 0; i < characters.length; i++) {
            if (!seen[characters[i] - 97]) {
                seen[characters[i] - 97] = true;
                count++;     
            }   
        }
        return count;
    }   
}

```