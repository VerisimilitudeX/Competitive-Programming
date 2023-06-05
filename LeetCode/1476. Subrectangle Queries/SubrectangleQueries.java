import java.util.*;

class SubrectangleQueries {
  private int[][] rect;
  private List<int[]> updates;

  public SubrectangleQueries(int[][] rectangle) {
    rect = rectangle;
    updates = new ArrayList<>();
  }

  public void updateSubrectangle(int row1, int col1, int row2, int col2, int newValue) {
    updates.add(new int[] {row1, col1, row2, col2, newValue});
  }

  public int getValue(int row, int col) {
    for (int i = updates.size() - 1; i >= 0; i--) {
      int[] update = updates.get(i);
      if (row >= update[0] && row <= update[2] && col >= update[1] && col <= update[3]) {
        return update[4];
      }
    }
    return rect[row][col];
  }
}
