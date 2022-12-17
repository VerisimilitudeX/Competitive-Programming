import java.util.*;

public class LonelyPhoto2 {
  public int sort(String word) {
    int start = 0;
    int iteration = 4;
    int length = word.length();
    int num = 0;
    while (iteration <= length) {
      while (start + iteration <= length) {
        int g = 0;
        int h = 0;
        char[] str = word.substring(start, start + iteration).toCharArray();
        for (char c : str) {
          if (c == 'G') g++;
          else h++;
        }
        if (g > 1 && h > 1) num++;
        start++;
      }
      iteration++;
      start = 0;
    }
    return num;
  }

  public static void main(String[] args) {
    LonelyPhoto2 methods = new LonelyPhoto2();
    Scanner input = new Scanner(System.in);
    int num = input.nextInt();
    String line = input.next();
    System.out.println(methods.sort(line));
  }
}
