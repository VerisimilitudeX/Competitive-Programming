# Java Solution Beats 100% Memory & 92% Runtime

# Intuition
The problem asks us to replace all periods in an IP address with "[.]". The solution can be very simple by just using the built-in replace() method in the String class to replace all occurrences of "." with "[.]".

# Approach
Define a method defangIPaddr() that takes in a String called address.
Inside the method, use the replace() method to replace all occurrences of "." with "[.]" in the address String.
Return the modified address String.

# Complexity
- Time complexity: O(n), where n is the length of the input address String. This is because the replace() method iterates through the address String once to replace all occurrences of ".".

- Space complexity: O(n), where n is the length of the modified address String. This is because a new String is created with the modified address and is stored in memory.

# Code
```java
class Solution {
    public String defangIPaddr(String address) {
        return address.replace(".", "[.]");
    }
}
```