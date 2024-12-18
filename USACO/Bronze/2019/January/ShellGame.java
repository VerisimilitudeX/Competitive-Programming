package 2019.january.bronze;

import java.io.*;
import java.util.*;

public class ShellGame {
    public static void main(String[] args) throws IOException {
        // Set up the input and output streams
        BufferedReader r = new BufferedReader(new FileReader("shell.in"));
        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("shell.out")));
        
        // Tokenize the first line of input
        StringTokenizer st = new StringTokenizer(r.readLine());
        int n = Integer.parseInt(st.nextToken());
        
        ArrayList<String> moves = new ArrayList<String>();

        for (int i = 0; i < n; i++) {
            moves.add(r.readLine());
        }

        ArrayList<Integer> order = new ArrayList<Integer>((Arrays.asList(1, 2, 3)));

        int og = 1;
        int score = 0;
        for (String move : moves) {
            ArrayList<Integer> intmove = new ArrayList<Integer>();
            for (String a : move.split(" ")) {
                intmove.add(Integer.parseInt(a));
            }

            order = switchNums(order, intmove.get(0), intmove.get(1));
            if (intmove.get(2) == )
        }
        
        // Close the input and output streams
        r.close();
        pw.close();
    }

    public static ArrayList<Integer> switchNums(ArrayList<Integer> order, int int1, int int2) {
            int pos1 = order.indexOf(int1);
            int pos2 = order.indexOf(int2);

            order.set(pos2, int1);
            order.set(pos1, int2);

            return order;
    }
}