import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

class Node {
  int position;
  char value;
  int startPos;
  int endPos;
}

public class LeadersCow {
  static int numCows;
  static char[] cows;
  static int[] teamList;

  public static void main(String[] args) {
    Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    numCows = sc.nextInt();
    cows = sc.next().toCharArray();
    ArrayList<Node> nodes = new ArrayList<Node>(numCows + 1);
    teamList = new int[numCows + 1];
    for (int i = 1; i <= numCows; i++) {
      teamList[i] = sc.nextInt();
    }
    for (int i = 0; i < cows.length; i++) {
      Node node = new Node();
      node.position = i + 1;
      node.value = cows[i];
      node.startPos = i + 1;
      node.endPos = teamList[i + 1];
      nodes.add(node);
    }
    sc.close();

    // At this point, teamList has "2 4 3 4"
    ArrayList<Integer> leaderNodes = new ArrayList<Integer>(numCows);
    int leaderCount = 0;

    int GCowCount = 0;
    int HCowCount = 0;
    Node singleGCow = null;
    Node singleHCow = null;

    // Find leader nodes
    for (Node n : nodes) {
      if (n != null) {
        if (n.value == 'G') {
          GCowCount++;
          singleGCow = n;
        } else if (n.value == 'H') {
          HCowCount++;
          singleHCow = n;
        }

        if (n.startPos == n.endPos) // Start/stop of a node is on itself.
        {
          continue;
        }
        if (n.startPos > n.endPos) // Start can't be greater than stop of a node.
        {
          continue;
        }
        if (n.endPos <= numCows) {
          leaderNodes.add(n.position);
          leaderCount++;
        }
      }
    }

    // Only single node leaders are to be detected.
    if (HCowCount == 1) {
      leaderNodes.add(singleHCow.position);
      leaderCount++;
    } else if (GCowCount == 1) {
      leaderNodes.add(singleGCow.position);
      leaderCount++;
    }

    // At this point we know number of leaders and their positions.
    int validLeaderPairCount = 0;

    // Detect leader pairs
    for (Node n : nodes) {
      if (n != null) {
        // Below is a weird condition
        if (n.startPos == n.endPos) // Start/stop of a node is on itself.
        {
          continue;
        }

        // valid check
        if (leaderNodes.contains(n.startPos) && leaderNodes.contains(n.endPos)) {
          validLeaderPairCount++;
        }
      }
    }
    System.out.println(validLeaderPairCount);
  }
}
