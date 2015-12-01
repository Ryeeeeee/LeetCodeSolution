/**
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