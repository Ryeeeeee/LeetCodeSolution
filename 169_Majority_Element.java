/**
 * Question:
 * Given an array of size n, find the majority element. 
 * The majority element is the element that appears more than ⌊ n/2 ⌋ times.
 * You may assume that the array is non-empty and the majority element always exist in the array.
 * 
 * Solution:
 * 统计数组数据，使用哈希表
 */
public class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        int major = 0;
        int max = 0;
        for (int i : nums) {
            int count = map.get(i) == null ? 1: map.get(i) + 1;
            if (count > max) {
                major = i;
                max = count;
            }
            if (max > nums.length / 2) {
                return major;
            }
            map.put(Integer.valueOf(i), Integer.valueOf(count));
            
        }
        return major;
    }
}