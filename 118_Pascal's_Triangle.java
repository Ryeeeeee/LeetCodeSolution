/**
 * Question:
 * Given numRows, generate the first numRows of Pascal's triangle.
 *
 * For example, given numRows = 5,
 * Return
 * 
 * [
 *     [1],
 *    [1,1],
 *   [1,2,1],
 *  [1,3,3,1],
 * [1,4,6,4,1]
 * ]
 */
public class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        List<Integer> prev = null;

        for (int i = 1; i <= numRows; i++) {
            List<Integer> row = new ArrayList<Integer>();
            row.add(0, 1);
            for (int j = 1; j < i - 1; j++) {
                row.add(j, prev.get(j - 1) + prev. get(j));
            }
            if (i != 1) {
                row.add(i - 1, 1);
            }
            result.add(i - 1, row);
            prev = row;
        }
        return result;
    }
}