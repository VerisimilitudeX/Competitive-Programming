class Solution {
  public int longestAlternatingSubarray(int[] nums, int threshold) {
    int maxLength = 0;
    int start = 0;
    int end = 0;

    while (end < nums.length) {
      if (nums[end] <= threshold) {
        if (nums[start] % 2 == 0) {
          while (end + 1 < nums.length
              && nums[end] % 2 != nums[end + 1] % 2
              && nums[end + 1] <= threshold) {
            end++;
          }
          maxLength = Math.max(maxLength, end - start + 1);
        }
        start = end + 1;
      } else {
        start = end + 1;
      }
      end++;
    }

    return maxLength;
  }
}
