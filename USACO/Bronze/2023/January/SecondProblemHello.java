import java.io.*;
import java.util.*;

class AC {
  int a, b, p, m;
}

class Cow {
  int s, t, c;
}

public class SecondProblemHello {
  static int n, m;
  static Cow[] cows = new Cow[25];
  static AC[] acs = new AC[15];
  static int[][] dp = new int[25][15];

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] line = br.readLine().split(" ");
    n = Integer.parseInt(line[0]);
    m = Integer.parseInt(line[1]);
    for (int i = 1; i <= n; i++) {
      line = br.readLine().split(" ");
      cows[i] = new Cow();
      cows[i].s = Integer.parseInt(line[0]);
      cows[i].t = Integer.parseInt(line[1]);
      cows[i].c = Integer.parseInt(line[2]);
    }
    for (int i = 1; i <= m; i++) {
      line = br.readLine().split(" ");
      acs[i] = new AC();
      acs[i].a = Integer.parseInt(line[0]);
      acs[i].b = Integer.parseInt(line[1]);
      acs[i].p = Integer.parseInt(line[2]);
      acs[i].m = Integer.parseInt(line[3]);
    }
    for (int i = 0; i <= n; i++) {
      Arrays.fill(dp[i], Integer.MAX_VALUE);
    }
    dp[0][0] = 0;
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= m; j++) {
        for (int k = 0; k < j; k++) {
          if (cows[i].s >= acs[j].a && cows[i].t <= acs[j].b && cows[i].c <= acs[j].p) {
            if (cows[i].s >= acs[k].a && cows[i].t <= acs[k].b && cows[i].c <= acs[k].p) {
              dp[i][j] = Math.min(dp[i][j], dp[i - 1][k] + acs[j].m);
            }
          }
        }
      }
    }
    int ans = Integer.MAX_VALUE;
    for (int i = 1; i <= m; i++) {
      ans = Math.min(ans, dp[n][i]);
    }
    System.out.println(ans);
  }
}
