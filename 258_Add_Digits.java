/**
 * Question:
 * Given a non-negative integer num, repeatedly add all its digits until the result has only one digit.
 * For example:
 * Given num = 38, the process is like: 3 + 8 = 11, 1 + 1 = 2. Since 2 has only one digit, return it.
 * Follow up:
 * Could you do it without any loop/recursion in O(1) runtime?
 *
 * Solution:
 * 假设 num 为 4 位数
 *     num = a * 1000 + b * 100 + c * 10 + d  
 * ==> num = (a + b + c + d) + (a * 999 + b * 99 + c * 9)
 * ==> num % 9 == (a + b + c + d) % 9
 * ==> num % 9 == (num - 1 + 1) % 9 == (num - 1) % 9 + 1
 */
public class Solution {
    public int addDigits(int num) {
        return (num - 1) % 9 + 1;
    }
}