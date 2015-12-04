/**
 * Question:
 * Related to question Excel Sheet Column Title
 * Given a column title as appear in an Excel sheet, return its corresponding column number.
 * For example:
 * 
 *  A -> 1
 *  B -> 2
 *  C -> 3
 *  ...
 *  Z -> 26
 *  AA -> 27
 *  AB -> 28 
 *
 * Solution:
 * 可以视为26进制，为了缓存每一位的权，可以从低位开始计算
 */
public class Solution {
    public int titleToNumber(String s) {
        int sum = 0;
        int cur = 1;
        for (int i=s.length() - 1; i>=0; i--) {
            sum += ((s.charAt(i) - 'A') + 1) * cur;
            cur *= 26;
        }
        
        return sum;
    }
}