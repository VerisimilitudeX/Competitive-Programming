/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution1 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int firstdig1 = 0;
        int firstdig2 = 0;
        int firstdig3 = 0;
        try {
            firstdig1 = l1.next.next.val;
            firstdig2 = l1.next.val;
            firstdig3 = l1.val;
        } catch (NullPointerException e) {
            // do nothing
        }
        int num1 = Integer.parseInt(firstdig1 + "" + firstdig2 + "" + firstdig3);

        int seconddig1 = 0;
        int seconddig2 = 0;
        int seconddig3 = 0;
        try {
            seconddig1 = l2.next.next.val;
            seconddig2 = l2.next.val;
            seconddig3 = l2.val;
        } catch (NullPointerException e) {
            // do nothing
        }
        int num2 = Integer.parseInt(seconddig1 + "" + seconddig2 + "" + seconddig3);

        int sum = num1 + num2;

        int thirdDigit = sum % 10;
        int secondDigit = (sum / 10) % 10;
        int firstDigit = (sum / 100) % 10;

        ListNode first = new ListNode(firstDigit);
        ListNode second = new ListNode(secondDigit, first);
        ListNode third = new ListNode(thirdDigit, second);
        if (third.val == 0) {
            return first;
        } else {
            return third;
        }
    }
}

class Solution2 {
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