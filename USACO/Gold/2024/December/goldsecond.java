
import java.io.*;
import java.util.*;

public class goldsecond {

    public static void main(String[] a) throws IOException {
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter o = new PrintWriter(System.out);
        int T = Integer.parseInt(b.readLine().trim());
        while (T-- > 0) {
            StringTokenizer s = new StringTokenizer(b.readLine());
            int N = Integer.parseInt(s.nextToken()), K = Integer.parseInt(s.nextToken()), p[] = new int[N];
            s = new StringTokenizer(b.readLine());
            for (int i = 0; i < N; i++) {
                p[i] = Integer.parseInt(s.nextToken());
            
            }int[][] r = new int[K][3];
            for (int i = 0; i < K; i++) {
                s = new StringTokenizer(b.readLine());
                r[i][0] = Integer.parseInt(s.nextToken());
                r[i][1] = Integer.parseInt(s.nextToken());
                r[i][2] = Integer.parseInt(s.nextToken());
            }
            Map<Integer, Integer> m = c(p);
            int[] c = new int[N];
            for (int i = 0; i < N; i++) {
                c[i] = m.get(p[i]);
            
            }int l = 0, e = N, mc = 0;
            while (l <= e) {
                int d = (l + e) / 2;
                if (t(c, r, d, N, m)) {
                    mc = d;
                    l = d + 1;
                } else {
                    e = d - 1;
            
                }}
            o.println(mc);
        }
        o.close();
    }

    static Map<Integer, Integer> c(int[] p) {
        TreeSet<Integer> t = new TreeSet<>();
        for (int x : p) {
            t.add(x);
        
        }Map<Integer, Integer> m = new HashMap<>();
        int i = 0;
        for (int x : t) {
            m.put(x, i++);
        
        }return m;
    }

    static boolean t(int[] c, int[][] r, int cc, int N, Map<Integer, Integer> m) {
        int[] ps = new int[N + 1];
        for (int i = 0; i < N; i++) {
            ps[i + 1] = ps[i] + (i < cc ? 0 : 1);
        
        }for (int[] x : r) {
            int l = m.getOrDefault(x[0], -1), e = m.getOrDefault(x[1], -1);
            if (l == -1 || e == -1) {
                continue;
            
            }if (ps[e + 1] - ps[l] < x[2]) {
                return false;
        
            }}
        return true;
    }
}
