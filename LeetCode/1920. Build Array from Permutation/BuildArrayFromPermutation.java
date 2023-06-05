class Solution {
    public int[] buildArray(int[] nums) {
        int[] newNums = new int[nums.length];
        for (short i = 0; (short) i < nums.length; i++) {
            newNums[i] = nums[nums[i]];
        }
        return newNums;
    }
}