import java.io.*;
import java.util.*;

public class Template {
    public static void main(String[] args) throws IOException {
        // Set up the input and output streams
        BufferedReader r = new BufferedReader(new FileReader("template.in"));
        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("template.out")));
        
        // Tokenize the first line of input
        StringTokenizer st = new StringTokenizer(r.readLine());
        int n = Integer.parseInt(st.nextToken());
        
        // Close the input and output streams
        r.close();
        pw.close();
    }
}