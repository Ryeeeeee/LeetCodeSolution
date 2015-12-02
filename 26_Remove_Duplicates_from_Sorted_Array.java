/**
 * Question:
 * Given a sorted array, remove the duplicates in place such that each element appear only once and return the new length.
 * Do not allocate extra space for another array, you must do this in place with constant memory.
 *
 * Solution:
 * 因为是排过序的，所以只要和前一个元素比较是否相等就可以了
 */
public class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int length = 1;
        for (int i=0, j=1; j < nums.length; j++) {
            if (nums[i] != nums[j]) {
                nums[++i] = nums[j];
                length++;
            }
        }
        return length;
    }
}