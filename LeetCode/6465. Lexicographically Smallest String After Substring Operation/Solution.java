public class Solution {
  public String smallestString(String s) {
    int firstSeen = 0;
    int length = s.length();

    StringBuilder returnString = new StringBuilder();
    int done = 0;
    for (int i = 0; i < length; i++) {
      char c = s.charAt(i);
      if (c != 'a') {
        firstSeen = 1;
        for (int j = i; j < length; j++) {
          char c2 = s.charAt(j);
          if (c2 != 'a') {
            int less = c2 - 1;
            char cless = (char) less;
            returnString.append(cless);
            if (j == length - 1) {
              done = 1;
              break;
            }
          } else {
            for (int k = j; k < length; k++) {
              returnString.append(s.charAt(k) + "");
            }
            done = 1;
            break;
          }
        }
      } else {
        returnString.append(c + "");
      }
      if (done == 1) {
        break;
      }
    }
    if (firstSeen == 1) {
      return returnString.toString();
    } else {
      String str = s.substring(0, length - 1);
      str = str += "z";
      return str;
    }
  }

  public static void main(String[] args) {
    Solution sol = new Solution();
    System.out.println(sol.smallestString("aaa"));
  }
}
