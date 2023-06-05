# 1920. LeetCode's Build Array from Permutation Java Solution BEATS 96% in Runtime **Extremely Simple & Logical Solution**

## Intuition
The problem is to create a new array where each element is the value of the original array at the index of the original array at the current index. For example, if the original array is [0, 2, 1, 5, 3, 4], the new array should be [0, 1, 2, 4, 5, 3].

## Approach
To create the new array, we can first allocate an array of the same length as the original array. Then, we can use a for loop to iterate over each index of the original array and assign the new array at that index to be the value of the original array at the index of the original array at that index.

## Complexity
- Time complexity: `O(n)`

- Space complexity: `O(n)`

# Code
```java
class Solution {
    public int[] buildArray(int[] nums) {
        int[] newNums = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            newNums[i] = nums[nums[i]];
        }
        return newNums;
    }
}
```