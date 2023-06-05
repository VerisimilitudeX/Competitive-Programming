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