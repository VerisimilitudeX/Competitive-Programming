import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        int T = Integer.parseInt(br.readLine().trim());
        for (int _case = 0; _case < T; _case++) {
            int N = Integer.parseInt(br.readLine().trim());
            String[] parts = br.readLine().trim().split(" ");
            long[] cakes = new long[N];
            long totalSum = 0;
            for (int i = 0; i < N; i++) {
                cakes[i] = Long.parseLong(parts[i]);
                totalSum += cakes[i];
            }

            int L = 0;
            int R = N - 1;
            int ElsiePicks = N / 2 - 1;
            long ElsieSum = 0;
            for (int turn = 0; turn < ElsiePicks; turn++) {
                if (cakes[L] >= cakes[R]) {
                    ElsieSum += cakes[L];
                    L++;
                } else {
                    ElsieSum += cakes[R];
                    R--;
                }
            }

            long BessieSum = totalSum - ElsieSum;
            pw.println(BessieSum + " " + ElsieSum);
        }

        pw.flush();
        pw.close();
        br.close();
    }
}
