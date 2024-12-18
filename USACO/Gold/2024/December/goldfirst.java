import java.io.*;
import java.util.*;

public class Main {
    static long[] cakes;
    static long[][][] dp; // DP table: dp[left][right][turn]
    static long[] prefix;

    // Utility function to calculate the sum of cakes from index l to r
    static long sum(int l, int r) {
        return prefix[r + 1] - prefix[l];
    }

    // Recursive function to solve the game
    static long solve(int l, int r, int turn) {
        if (l >= r) return 0; // No valid merges or picks left

        if (dp[l][r][turn] != -1) return dp[l][r][turn];

        if (turn == 0) {
            // Bessie's turn to merge: Explore all adjacent merges
            long maxScore = 0;
            for (int i = l; i < r; i++) {
                long merged = cakes[i] + cakes[i + 1];
                // Simulate merging cakes[i] and cakes[i+1]
                maxScore = Math.max(maxScore, merged + solve(l, i - 1, 1) + solve(i + 2, r, 1));
            }
            dp[l][r][turn] = maxScore;
        } else {
            // Elsie's turn: Pick the leftmost or rightmost cake
            long pickLeft = sum(l, l) + solve(l + 1, r, 0);
            long pickRight = sum(r, r) + solve(l, r - 1, 0);
            dp[l][r][turn] = Math.min(pickLeft, pickRight);
        }

        return dp[l][r][turn];
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        while (T-- > 0) {
            int N = Integer.parseInt(br.readLine());
            cakes = new long[N];
            prefix = new long[N + 1];

            String[] input = br.readLine().split(" ");
            for (int i = 0; i < N; i++) {
                cakes[i] = Long.parseLong(input[i]);
                prefix[i + 1] = prefix[i] + cakes[i]; // Build prefix sum
            }

            dp = new long[N][N][2];
            for (long[][] d1 : dp)
                for (long[] d2 : d1)
                    Arrays.fill(d2, -1);

            long bessieTotal = solve(0, N - 1, 0);
            long totalSum = prefix[N];
            long elsieTotal = totalSum - bessieTotal;

            System.out.println(bessieTotal + " " + elsieTotal);
        }
    }
}
