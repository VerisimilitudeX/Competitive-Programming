# 9. Palindrome Number

## Intuition

I began by mentally walking through the given test cases and recording the steps I took to solve the problems. I used this to create some pseudocode that modeled my thinking. Following that, I translated my pseudocode into Java. I was confident that my program worked after some thorough testing in addition to the auto tests.

## Approach

To allow for string indexing and length, I first converted the int to a string. Then I looped through the string until I reached the halfway point, comparing the numbers on the left and right sides. If they weren't the same, I exited the program immediately by returning false. At the end of the program, if the numbers on the left and right sides were the same, I returned true, indicating that the number entered by the user is a palindrome.

## Complexity

- Time complexity:
O(n)

## Code

GitHub: <https://github.com/Verisimilitude11/LeetCode-Problems/tree/main/9.%20Palindrome%20Number>

```java
class Solution {
    public static boolean isPalindrome(int x) {
        String num = Integer.toString(x);
        for (int i = 0; i < num.length() / 2; i++) {
            char rightChar = num.charAt(num.length() - i - 1);
            char leftChar = (num.charAt(i));
            if (!(leftChar == rightChar)) {
                return false;
            }
        }

        return true;
    }
}
```
