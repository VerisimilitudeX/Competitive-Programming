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

    public static void main(String[] args) {
        System.out.println(isPalindrome(121));
        System.out.println(isPalindrome(-121));
        System.out.println(isPalindrome(10));
    }
}