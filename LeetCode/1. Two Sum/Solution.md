# Two Sum

## Intuition

I first considered how I would go about searching for two numbers that equaled the target number. My initial thought was to loop through the list, looking for numbers 'n-1' and 'n+1' away from the current number. However, I soon realized that the two numbers that add up to target could be anywhere on the list.

## Approach

I first loop through all of the numbers in the list that was entered, and then I loop through the list again, beginning with `i + 1'. This is because if you start at 0, it will look at the same element twice, and if that number added to itself is target, it will be counted twice. If I come across two numbers that are equal to target, I add them to a list and return them. Otherwise, I return an empty list.

## Complexity

- Time complexity:
O(n^2)

## Code

GitHub: <https://github.com/Verisimilitude11/LeetCode-Problems/tree/main/1.%20Two%20Sum>

```java
class Solution {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            int num1 = nums[i];
            for (int j = i + 1; j < nums.length; j++) {
                int num2 = nums[j];
                if (num1 + num2 == target) {
                    int[] output = {i, j};
                    return output;
                }
            }
        }
        int[] output = {};
        return output;
    }
}
```
