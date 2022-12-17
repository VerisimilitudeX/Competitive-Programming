import java.util.Scanner;

public class LonelyPhoto {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String fakeNum = sc.nextLine();
    String characters = sc.nextLine();
    long n = characters.length();

    long lonelyCount = 0;
    for (int i = 0; i < n; i++) {
      for (int j = i + 2; j < n; j++) {
        String substring = characters.substring(i, j + 1);
        if (substring.chars().filter(ch -> ch == 'G').count() == 1
            || substring.chars().filter(ch -> ch == 'H').count() == 1) {
          lonelyCount++;
        }
      }
    }
    System.out.println(lonelyCount);
  }
}
