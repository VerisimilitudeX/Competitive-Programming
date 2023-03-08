import java.util.Scanner;

public class ThirdProblem {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int q = sc.nextInt();
    for (int i = 0; i < q; i++) {
      String s = sc.next();
      int mooCount = 0;
      int opCount = 0;
      for (int j = 0; j < s.length(); j++) {
        if (s.charAt(j) == 'M') {
          mooCount++;
        } else {
          mooCount--;
        }
        if (mooCount < 0) {
          opCount++;
          mooCount += 2;
        }
      }
      if (mooCount != 0) {
        System.out.println(-1);
      } else {
        System.out.println(opCount / 2);
      }
    }
  }
}
