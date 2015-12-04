/**
 * Question:
 * You are climbing a stair case. It takes n steps to reach to the top.
 * Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
 * 
 * Solution:
 * 可以看成先走 n-1 次再走1步， 或者先走 n-2 步再走2步，所以可以看成将这两总情况相加
 */
public class Solution {
    public int climbStairs(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        
        int pre = 1;
        int last = 1;
        
        int tmp = 0;
        for (int i=2; i<n; i++) {
            tmp = last;
            last = pre + last;
            pre = tmp;
        }
        
        return pre + last;
    }
}