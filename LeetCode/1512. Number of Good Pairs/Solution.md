# EXTREMELY SIMPLE & LOGICAL JAVA SOLUTION BEATS 85% IN RUNTIME

# Intuition
The problem asks us to find the number of good pairs in an array. A good pair is defined as a pair (i, j) where `0 <= i < j < nums.length` and `nums[i] == nums[j]`. In other words, we need to count the number of occurrences of the same element in the array that have a lower index than another occurrence of the same element.

# Approach
One simple approach to solve this problem is to use nested loops to compare each pair of elements in the array and count the good pairs. The outer loop iterates over each element in the array, and the inner loop starts from the next element and compares it with the current element. If the elements are equal, we increment the count of good pairs.

# Complexity
- Time complexity: O(n^2) - The nested loops iterate over all pairs of elements in the array, resulting in a quadratic time complexity.
- Space complexity: O(1) - We are using a constant amount of extra space to store the count of good pairs.

# Code
```java
class Solution {
    public int numIdenticalPairs(int[] nums) {
        int goodPairs = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    goodPairs++;
                }
            }
        }
        return goodPairs;
    }
}
```

Note: This code snippet is in Java.