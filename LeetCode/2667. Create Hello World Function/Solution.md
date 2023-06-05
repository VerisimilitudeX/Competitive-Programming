# 2667. LeetCode's Create Hello World Function - Extremely Simple One line JS Solution Beats 99% in Runtime

## Intuition
The problem is to create a function that returns another function that always returns “Hello World”. This is an example of a higher-order function, which is a function that can take another function as an argument or return another function as a result.

## Approach
To create a higher-order function in JavaScript, we can use the function keyword to define both the outer and inner functions. The outer function does not take any arguments and returns the inner function. The inner function takes any number of arguments using the rest parameter syntax (…args) and returns the string “Hello World”.

## Complexity
- Time complexity: $$O(1)$$

- Space complexity: $$O(1)$$

## Code
```javascript
/**
 * @return {Function}
 */
var createHelloWorld = function() {
    return function(...args) {
        return "Hello World"
    }
};

/**
 * const f = createHelloWorld();
 * f(); // "Hello World"
 */
```