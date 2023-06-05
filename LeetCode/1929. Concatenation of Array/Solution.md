# 1929. Concatenation of Array - Java Solution Beats 94% in Runtime (EXTREMELY LOGICAL SOLUTION)

## Intuition
The problem is to create a new array that is the concatenation of the given array with itself. For example, if the given array is `[1, 2, 3]`, the new array should be `[1, 2, 3, 1, 2, 3]`.

## Approach
To create the new array, we can first allocate an array of double the length of the given array. Then, we can use a for loop to copy each element of the given array to the new array twice: once at the original index and once at the index plus the length of the given array.

## Complexity
- Time complexity: The time complexity of this code is $$O(n)$$
 where n is the length of the given array. This is because we need to iterate over each element of the given array once and copy it to the new array twice.

- Space complexity: The space complexity of this code is $$O(n)$$
 where n is the length of the given array. This is because we need to allocate a new array of double the size of the given array.

## Code
```
class Solution {
    public int[] getConcatenation(int[] nums) {
        short len = (short) nums.length;
        int[] newNums = new int[len * 2];
        for (short i = 0; i < len; i++) {
            newNums[i] = nums[i];
            newNums[i + len] = nums[i];
        }
        return newNums;
    }
}
```