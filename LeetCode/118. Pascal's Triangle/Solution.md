# Pascal's Triangle - Extremely Simple Logic Solution Beats 96% of Java Solutions in Memory & Runtime

# Intuition
The problem is to generate the first n rows of Pascal’s triangle, where each element is the sum of the two elements above it. One possible way to solve this problem is to use a list of lists (or in other words, a 2D array) to store the rows, and iterate from the first row to the nth row, adding new elements based on the previous row.

# Approach
- Initialize an empty list of lists to store the rows.
- Add the first row, which is a list containing only 1, to the list of rows.
- For each row from 1 to n-1, do the following:
    - Initialize an empty list to store the current row.
    - Add 1 to the beginning and end of the current row.
    - For each element from 1 to i-1, where i is the index of the  current row, do the following:
        - Get the previous row from the list of rows.
        - Add the element at index j-1 and j from the previous row, and append it to the current row.
    - Add the current row to the list of rows.
- Return the list of rows.

# Complexity
- Time complexity: $$O(n^2)$$

We need to iterate over n rows, and for each row i, we need to iterate over i elements. The total number of elements is $$n(n+1) / 2​$$, which is $$O(n^2)$$ in asymptotic notation.

- Space complexity: $$O(n^2)$$

We need to store n rows, and each row i has i elements. The total space required is $$n(n+1) / 2​$$, which is $$O(n^2)$$ in asymptotic notation.

# Code
```java
public class Solution {
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> allRows = new ArrayList<>(numRows);
        List<Integer> firstRow = new ArrayList<>();
        firstRow.add(1);
        allRows.add(firstRow);
        for (int i = 1; i < numRows; i++) {
            List<Integer> row = new ArrayList<>(i + 1);
            row.add(1);
            List<Integer> prevRow = allRows.get(i - 1);
            for (int j = 1; j < i; j++) {
                int sum = 0;
                if (j - 1 >= 0 && j - 1 < prevRow.size()) {
                    sum += prevRow.get(j - 1);
                }
                if (j >= 0 && j < prevRow.size()) {
                    sum += prevRow.get(j);
                }
                row.add(sum);
            }
            row.add(1);
            allRows.add(row);
        }
        return allRows;
    }
}

```