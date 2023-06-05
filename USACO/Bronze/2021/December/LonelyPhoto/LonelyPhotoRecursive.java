import java.util.Scanner;

public class LonelyPhotoRecursive {
  public static long countLonely(String characters) {
    int n = characters.length();
    if (n < 3) {
      // base case: if the string is less than 3 characters, there are no "lonely" sub-strings
      return 0;
    }

    // divide the input string into two halves
    String left = characters.substring(0, n / 2);
    String right = characters.substring(n / 2);

    // recursively solve the problem for each half
    long leftLonely = countLonely(left);
    long rightLonely = countLonely(right);

    // merge the results by counting the number of "lonely" sub-strings that span across the two
    // halves
    long crossLonely = 0;
    for (int i = 0; i < n / 2; i++) {
      if (left.charAt(i) == right.charAt(0)
          && (right.length() == 1 || right.charAt(1) != right.charAt(0))) {
        // count sub-strings of the form "HG" or "GG"
        crossLonely++;
      }
      if (right.charAt(0) == left.charAt(i)
          && (left.length() == 1 || left.charAt(i + 1) != left.charAt(i))) {
        // count sub-strings of the form "GH" or "HH"
        crossLonely++;
      }
    }

    // return the total number of "lonely" sub-strings
    return leftLonely + rightLonely + crossLonely;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String num = sc.nextLine();
    String characters = sc.nextLine();
    System.out.println(countLonely(characters));
  }
}
