import java.util.ArrayList;

class Solution {
    public int minimizedStringLength(String s) {
        char[] characters = s.toCharArray();
        int count = 0;
        boolean[] seen = new boolean[26];
        for (int i = 0; i < characters.length; i++) {
            if (!seen[characters[i] - 97]) {
                seen[characters[i] - 97] = true;
                count++;     
            }   
        }
        return count;
    }   
}
