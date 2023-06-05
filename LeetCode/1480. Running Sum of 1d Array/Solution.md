## Intuition

My first thought on how to solve this problem is to iterate through the array and add the current element to the previous element. This will give us a running sum of the elements in the array.

## Approach

The function first declares a loop that will iterate over the elements of the array starting from the second element (index 1). For each iteration, the value of the current element is updated to be the sum of the previous element and itself.

After the loop finishes, the modified array is returned.

Here's an example of how the function would work:

```txt
Input: [1, 2, 3, 4]
Output: [1, 3, 6, 10]
```

The first element of the output array is the same as the first element of the input array, since it is the sum of the elements up to itself (in this case, just itself). The second element of the output array is the sum of the first and second elements of the input array, and so on.

## Complexity

- Time complexity: O(n)
  - The time complexity of this solution is O(n), as we are iterating through the array once and performing a constant number of operations on each element.

- Space complexity: O(1)
  - The space complexity of this solution is O(1), as we are not using any additional data structures or variables to store the running sum.

## Code

```java
class Solution {
    public int[] runningSum(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            nums[i] = nums[i - 1] + nums[i];
        }
        return nums;
    }
}
```

For more details: <https://leetcode.com/problems/running-sum-of-1d-array/solutions/2916215/highly-efficient-java-solution-beats-100-in-runtime-and-94-in-memory-usage/>
