# 🔥Simple LOGICAL Java Solution - Beats 66%

# Intuition
The problem is to implement a class that can update and query a subrectangle of a given rectangle. A subrectangle is defined by its four corners (row1, col1, row2, col2). One way to solve this problem is to store the original rectangle and a list of updates in the class. Each update contains the coordinates of the subrectangle and the new value to fill it with. To query a value at a given position (row, col), we can iterate through the updates in reverse order and check if the position falls within any subrectangle. If yes, we return the corresponding value. If no, we return the original value from the rectangle.

# Approach
To implement this approach, we need two data structures: a 2D array to store the original rectangle and a list to store the updates. The constructor takes the rectangle as input and initializes the array and the list. The updateSubrectangle method appends a new update to the list with the given parameters. The getValue method iterates through the list from the end and checks if the given position is within any update. If yes, it returns the value from that update. If no, it returns the value from the array.

# Complexity
- Time complexity:
The time complexity of the constructor is $$O(mn)$$ where $$m$$ and $$n$$ are the number of rows and columns of the rectangle respectively. The time complexity of the updateSubrectangle method is $$O(1)$$ since it only appends to the list. The time complexity of the getValue method is $$O(k)$$ where $$k$$ is the number of updates in the list.

- Space complexity:
The space complexity of the class is $$O(mn + k)$$ where $$m$$, $$n$$ and $$k$$ are defined as above. We need $$O(mn)$$ space to store the array and $$O(k)$$ space to store the list.

# Code
```java
import java.util.*;

class SubrectangleQueries {
 private int[][] rect;
 private List<int[]> updates;

 public SubrectangleQueries(int[][] rectangle) {
 rect = rectangle;
 updates = new ArrayList<>();
 }

 public void updateSubrectangle(int row1, int col1, int row2, int col2, int newValue) {
 updates.add(new int[]{row1, col1, row2, col2, newValue});
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
```