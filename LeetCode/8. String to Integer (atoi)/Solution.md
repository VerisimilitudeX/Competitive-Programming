# Extremely SIMPLE & LOGICAL Java SOLUTION - Beats 94% of Solutions!!!! 🔥🔥

# Intuition
To convert a string to an integer, we need to ignore any leading whitespace characters and check the sign of the number. Then, we need to iterate over the digits in the string and multiply the current result by 10 and add the digit value. We also need to handle the cases where the result overflows the integer range.

# Approach
* Use trim() method to remove any leading or trailing whitespace characters from the input string.
* Initialize a sign variable to 1 and an index variable to 0.
* If the first character of the string is -, set sign to -1 and increment index.
* If the first character of the string is +, increment index.
* Initialize a result variable to 0.
* While index is less than the length of the string and the current character is a digit, do the following:
    * Multiply result by 10 and add the digit value (subtract '0' from the character to get the numeric value).
    * If sign is 1 and result is greater than Integer.MAX_VALUE, return Integer.MAX_VALUE.
    * If sign is -1 and -result is less than Integer.MIN_VALUE, return Integer.MIN_VALUE.
    * Increment index.
* Return (int) (result * sign).

# Complexity
- Time complexity: $$O(n)$$

- Space complexity: $$O(1)$$

# Code
```
class Solution {
    public int myAtoi(String s) {
        s = s.trim();
        if (s.isEmpty()) {
            return 0;
        }

        int sign = 1;
        int index = 0;

        if (s.charAt(0) == '-') {
            sign = -1;
            index++;
        } else if (s.charAt(0) == '+') {
            index++;
        }

        long result = 0;
        while (index < s.length() && Character.isDigit(s.charAt(index))) {
            result = result * 10 + (s.charAt(index) - '0');
            if (sign == 1 && result > Integer.MAX_VALUE) {
                return Integer.MAX_VALUE;
            } else if (sign == -1 && -result < Integer.MIN_VALUE) {
                return Integer.MIN_VALUE;
            }
            index++;
        }

        return (int) (result * sign);
    }
}
```