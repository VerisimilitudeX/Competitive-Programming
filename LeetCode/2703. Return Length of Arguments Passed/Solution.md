# 2703. LeetCode's Return Length of Arguments Passed - Extremely LOGICAL JS Solution Beats 83% in Memory Usage ✨

# Intuition
The problem is to find the length of the arguments passed to a function. A possible way to solve this problem is to use the rest parameter syntax (…args) to collect all the arguments into an array and then return the length of the array.

# Approach
To implement this approach, we define a function named argumentsLength that takes any number of arguments using the rest parameter syntax. Inside the function, we simply return args.length, which is the length of the array that contains all the arguments.

# Complexity
- Time complexity: $$O(1)$$

- Space complexity: $$O(n)$$

# Code
```javascript
/**
 * @return {number}
 */
var argumentsLength = function(...args) {
    return args.length;
};

/**
 * argumentsLength(1, 2, 3); // 3
 */
```