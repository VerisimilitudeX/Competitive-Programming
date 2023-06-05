import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class FeedingTheCows {
    public static void main(String[] args) {
        // get input from user using BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCases = 0;
        try {
            testCases = Integer.parseInt(br.readLine());

            for (int i = 0; i < testCases; i++) {
                // get next line
                String numCows = br.readLine();
                int n = Integer.parseInt(numCows.charAt(0) + "");
                int k = Integer.parseInt(numCows.charAt(2) + "");

                ArrayList<Character> charList = new ArrayList<Character>();
                // get next line
                String cowOrder = br.readLine();
                char[] arrayCowOrder = cowOrder.toCharArray();
                int length = arrayCowOrder.length;
                for (int j = 0; j < length; j++) {
                    charList.add(arrayCowOrder[j]);
                }
                int numGrass = charList.size();
                // while (arrayCanBeShrinked) {
                for (int j = 0; j < length; j++) {
                    char thisChar = charList.get(j);
                    if (thisChar != '.') {
                        for (int l = j + 1; l < j + k && l <= n - 1; l++) {
                            if (thisChar == charList.get(l)) {
                                charList.set(j, '.');
                                numGrass--;
                                break;
                            }
                        }
                        for (int m = j - 1; m > j - k && m >= 0; m--) {
                            if (thisChar == charList.get(m)) {
                                charList.set(j, '.');
                                numGrass--;
                                break;
                            }
                        }
                    }
                }
                // }
                System.out.println(numGrass);
                for (int z = 0; z < length; z++) {
                    System.out.print(charList.get(z));
                }
                System.out.print("\n");
            }
        } catch (Exception e) {
            // do nothing
        }
    }
}

class input {
    public int n;
    public int k;
    public char[] cows;

    public input(int n, int k, char[] cows) {
        this.n = n;
        this.k = k;
        this.cows = cows;
    }
}
