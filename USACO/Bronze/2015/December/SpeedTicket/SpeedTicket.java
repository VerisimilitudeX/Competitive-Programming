import java.io.*;
import java.util.*;

public class SpeedTicket {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    String input = br.readLine();
    String[] firstLine = input.split(" ");

    int n = Integer.parseInt(firstLine[0]);
    int m = Integer.parseInt(firstLine[1]);

    HashMap<Integer, Integer> limit = new HashMap<>();
    for (int i = 0; i < n; i++) {
      String lineInput = br.readLine();
      String[] lineList = lineInput.split(" ");

      int length = Integer.parseInt(lineList[0]);
      int speedLimit = Integer.parseInt(lineList[1]);

      limit.put(length, speedLimit);
    }

    HashMap<Integer, Integer> actual = new HashMap<>();
    for (int i = 0; i < m; i++) {
      String lineInput = br.readLine();
      String[] lineList = lineInput.split(" ");

      int length = Integer.parseInt(lineList[0]);
      int speedActual = Integer.parseInt(lineList[1]);

      actual.put(length, speedActual);
    }

    ArrayList<Integer> differences = new ArrayList<>();
    for (int length : actual.keySet()) {
      int speedLimit = limit.get(length);
      int actualSpeed = actual.get(length);

      int difference = actualSpeed - speedLimit;
      differences.add(difference);
    }

    // find greatest overspeed
    int max = Integer.MIN_VALUE;
    for (int i = 0; i < differences.size(); i++) {
      if (differences.get(i) > max) {
        max = differences.get(i);
      }
    }

    System.out.println(max);
  }
}
