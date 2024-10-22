# Java Solution Beats 100% Memory & 92% Runtime

# Intuition
The problem asks us to replace all periods in an IP address with "[.]". The solution can be very simple by just using the built-in replace() method in the String class to replace all occurrences of "." with "[.]".

# Approach
Define a method defangIPaddr() that takes in a String called address.
Inside the method, create a new StringBuilder object. Iterate through the given IP address, add "[.]" to the object if current index is found to be '.', otherwise add the index normally. In the end return object.toString().
# Complexity
- Time complexity: O(n), where n is the length of the input address String. This is because it is performing the task in one single iteration.

- Space complexity: O(n), where n is the length of the modified address String. This is because a new String is created with the modified address and is stored in memory.

# Code
```java
class Solution {
  public String defangIPaddr(String address) {
    StringBuilder ans = new StringBuilder();
    for (int i = 0; i < address.length(); i++) {
      if (address.charAt(i) == '.') {
        ans.append("[.]");
      } else {
        ans.append(address.charAt(i));
      }
    }
    return ans.toString();
  }
}
```