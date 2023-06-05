class Solution {
    public int[] getConcatenation(int[] nums) {
        short len = (short) nums.length;
        int[] newNums = new int[len * 2];
        for (short i = 0; i < len; i++) {
            newNums[i] = nums[i];
            newNums[i + len] = nums[i];
        }
        return newNums;
    }
}