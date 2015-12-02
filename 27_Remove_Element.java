/**
 * Question:
 * Given an array and a value, remove all instances of that value in place and return the new length.
 * The order of elements can be changed. It doesn't matter what you leave beyond the new length.
 * 
 * Solution:
 * 两个指针，一个负责遍历，一个负责存储变量
 */
public class Solution {
    public int removeElement(int[] nums, int val) {
        int length = 0;
        for (int i = 0, j = 0; j < nums.length; j++) {
            if (nums[j] != val) {
                nums[i] = nums[j];
                i++;
                length++;
            }
        }
        return length;
    }
}