# 2. Add Two Numbers - Java Solution Beats 86% in Memory, Simple Brute Force Algorithm

## Overview

In this post, we will be discussing an ultra low memory Java solution for a LeetCode problem (2. Add Two Numbers) that involves adding two numbers represented as linked lists.

## Problem Statement

Given two linked lists representing two non-negative integers, add the two numbers together and return the sum as a linked list.

The digits are stored in reverse order, such that the 1's digit is at the head of the list.

### Example

```txt
Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
Output: 7 -> 0 -> 8
Explanation: 342 + 465 = 807
```

## Intuition

To solve this problem, we can first parse the ListNode inputs for their respective numbers. Once that is done, we can loop over each digit in the sum and add it to a ListNode, linking all of them together.

## Approach

This method takes in two linked lists, l1 and l2, as input and returns a new linked list which is the sum of the two input linked lists. The method converts the input linked lists into BigInteger objects, adds the two BigInteger objects together to obtain the sum, and then creates a new linked list from the result of the addition. The method returns the new linked list as the result of the addTwoNumbers() method.

Here is an overview of our approach:

Get the digits of the two numbers in the linked list.
Add the digits together to obtain the sum.
Create a new linked list from the sum.
Return the new linked list as the result.
Let's now implement this approach in code.

## Code

```java
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
import java.util.ArrayList;
import java.lang.StringBuilder;
import java.math.BigInteger;

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        // Get digits of L2
        ListNode placeholder = l1;
        ArrayList<Integer> num1Array = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            if (placeholder == null) {
                break;
            }
            num1Array.add(placeholder.val);
            placeholder = placeholder.next;
        }
        String stringNum1 = "";
        for (int i = 0; i < num1Array.size(); i++) {
                stringNum1 += num1Array.get(i);
        }
        StringBuilder sb = new StringBuilder(stringNum1).reverse();
        BigInteger num1 = new BigInteger(sb.toString());

        // Get digits of L2
        placeholder = l2;
        ArrayList<Integer> num2Array = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            if (placeholder == null) {
                break;
            }
            num2Array.add(placeholder.val);
            placeholder = placeholder.next;
        }
        String stringNum2 = "";
        for (int i = 0; i < num2Array.size(); i++) {
                stringNum2 += num2Array.get(i);
        }
        sb = new StringBuilder(stringNum2).reverse();
        BigInteger num2 = new BigInteger(sb.toString());

        BigInteger intSum = num1.add(num2);
        String stringSum = String.valueOf(intSum);
        
        ArrayList<ListNode> listNodes = new ArrayList<>();

        ListNode current;
        ListNode previous = new ListNode();
        for (int i = 0; i < stringSum.length(); i++) {
            if (i == 0) {
                previous = new ListNode(Integer.parseInt(stringSum.charAt(0) + ""));
                listNodes.add(previous);  
            } else {
                current = new ListNode(Integer.parseInt(stringSum.charAt(i) + ""), previous);
                listNodes.add(current);
                previous = current;
            }
        }

        return listNodes.get(stringSum.length() - 1);
    }
}
```

1. The first few lines are just the definition of the ListNode class and the declaration of the Solution class which are given to us.
2. The first thing we need to do is get the digits of the two numbers in the linked list.
3. Since the digits are in reverse order, we can use a for loop to iterate through the linked list and add each digit to an ArrayList.
4. Now that we have the digits, we can add them together.
5. Since we have the digits in the ArrayLists, we can use StringBuilder to reverse the digits and then convert them to Strings.
6. Since we can't use Strings in Java to do math, we need to convert the Strings to BigIntegers.
7. We can now add the BigIntegers together and convert the result to a String.
8. Now that we have the sum as a String, we can iterate through the String and create new ListNode objects.
9. Since we need to return the ListNode object at the end, we can add each ListNode to an ArrayList.
10. At the end of the for loop, we can return the ListNode object at the end of the ArrayList (LeetCode's testcase checker can then follow the links through the number).

## Complexity

- Time complexity: O(n)

- Space complexity: O(n)
