import java.util.Arrays;
import java.util.Scanner;

class Main {
    private static int minimumPatches(int N, int K, char[] cows, char[] patches) {
        Arrays.fill(patches, '.'); // initialize patches array with all '.' characters
        int patchCount = 0; // initialize patch count
        for (int i = 0; i < N; i++) {
            if (cows[i] == 'G') { // check if cow at position i is a Guernsey
                boolean foundPatch = false; // flag to track whether patch was found
                for (int j = 1; j <= K; j++) { // check K positions to the left and right
                    if (i - j >= 0 && patches[i - j] == 'G') { // check left
                        foundPatch = true;
                        break;
                    }
                    if (i + j < N && patches[i + j] == 'G') { // check right
                        foundPatch = true;
                        break;
                    }
                }
                if (!foundPatch) { // if no patch was found, plant one at position i
                    patches[i] = 'G';
                    patchCount++;
                }
            } else { // same logic for Holstein cows
                boolean foundPatch = false;
                for (int j = 1; j <= K; j++) {
                    if (i - j >= 0 && patches[i - j] == 'H') {
                        foundPatch = true;
                        break;
                    }
                    if (i + j < N && patches[i + j] == 'H') {
                        foundPatch = true;
                        break;
                    }
                }
                if (!foundPatch) {
                    patches[i] = 'H';
                    patchCount++;
                }
            }
        }
        return patchCount;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // create a Scanner object to read input
        int T = scanner.nextInt(); // read the number of test cases
        for (int i = 0; i < T; i++) {
            int N = scanner.nextInt(); // read N
            int K = scanner.nextInt(); // read K
            String cowsString = scanner.next(); // read the string of cows
            char[] cows = cowsString.toCharArray(); // convert the string to a char array
            char[] patches = new char[N]; // create an array to store the patches
            int patchCount = minimumPatches(N, K, cows, patches); // find the minimum number of patches
            System.out.println(patchCount); // print the patch count
            System.out.println(new String(patches)); // print the patches array
        }
        scanner.close(); // close the Scanner object
    }
}
