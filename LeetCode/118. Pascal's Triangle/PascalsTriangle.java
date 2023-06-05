import java.util.List;
import java.util.ArrayList;

public class PascalsTriangle {
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

    public static void main(String[] args) {
        System.out.println(PascalsTriangle.generate(6));
    }
}
