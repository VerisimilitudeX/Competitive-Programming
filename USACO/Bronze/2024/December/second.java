import java.io.*;
import java.util.*;

public class second {
    public static void main(String[] args) throws IOException {
        // Using buffered input for speed.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int Q = Integer.parseInt(st.nextToken());

        // Initialize count arrays
        // countX[y][z]: how many cubes remain along the line running in x-direction at (y,z)
        // countY[x][z]: how many cubes remain along the line running in y-direction at (x,z)
        // countZ[x][y]: how many cubes remain along the line running in z-direction at (x,y)
        int[][] countX = new int[N][N];
        int[][] countY = new int[N][N];
        int[][] countZ = new int[N][N];

        // Initially, all lines have N cubes since no carving is done.
        for (int i = 0; i < N; i++) {
            Arrays.fill(countX[i], N);
            Arrays.fill(countY[i], N);
            Arrays.fill(countZ[i], N);
        }

        // Track how many lines are fully empty in each orientation
        int emptyX = 0, emptyY = 0, emptyZ = 0;

        // Process each update
        // For each carved cube (x,y,z), it will affect one line in each orientation.
        // 1) The line along x at fixed (y,z)
        // 2) The line along y at fixed (x,z)
        // 3) The line along z at fixed (x,y)
        PrintWriter pw = new PrintWriter(new BufferedOutputStream(System.out));
        
        for (int q = 0; q < Q; q++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            int z = Integer.parseInt(st.nextToken());

            // Update the x-line: (y,z)
            countX[y][z]--;
            if (countX[y][z] == 0) {
                emptyX++;
            }

            // Update the y-line: (x,z)
            countY[x][z]--;
            if (countY[x][z] == 0) {
                emptyY++;
            }

            // Update the z-line: (x,y)
            countZ[x][y]--;
            if (countZ[x][y] == 0) {
                emptyZ++;
            }

            // Total valid placements is sum of all empty lines
            int result = emptyX + emptyY + emptyZ;
            pw.println(result);
        }

        pw.flush();
    }
}
