/**
 * Questions: 
 * Write a function that takes an unsigned integer and returns the number of ’1' bits it has (also known as the Hamming weight).
 * For example, the 32-bit integer ’11' has binary representation 00000000000000000000000000001011, so the function should return 3.
 * Solution:
 * 使用一个数字1，循环左移，获取每个位置上的数，判断是否是1
 */
public class Solution {
    // you need to treat n as an unsigned value
     public int hammingWeight(int n) {
        int num = 0;
        for (int i = 1; i != 0; i <<= 1) {
            if ((n & i) == i) {
                num++;
            }
        }
        return num;
    }
}