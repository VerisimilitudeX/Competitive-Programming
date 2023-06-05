# 771. LeetCode’s Jewels and Stones — Super SIMPLE & EFFICIENT Algorithm Beats 92% in Runtime

# Intuition
To solve this problem, we can iterate over each stone and check if it matches any of the jewels. If it does, we increment a counter.

# Approach
We can use two nested loops to compare each stone with each jewel. Alternatively, we can use a hash set to store the jewels and look up each stone in constant time.

# Complexity
- Time complexity:
The time complexity of the nested loops approach is $$O(nm)$$
 where n is the length of stones and m is the length of jewels. The time complexity of the hash set approach is $$O(n+m)$$
 where n is the length of stones and m is the length of jewels.

- Space complexity:
The space complexity of the nested loops approach is $$O(1)$$
 as we do not use any extra space. The space complexity of the hash set approach is $$O(m)$$
 where m is the length of jewels.

# Code
```
class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int count = 0;
        for (char stone : stones.toCharArray()) {
            for (char jewel : jewels.toCharArray()) {
                if (stone == jewel) {
                    count++;
                    continue;
                }
            }
        }
        return count;
    }
}
```