/**
 * Question:
 * Given an array of integers, find if the array contains any duplicates.
 * Your function should return true if any value appears at least twice in the array,
 * and it should return false if every element is distinct.
 * 
 * Solution:
 * 涉及个数统计，用哈希表
 */
public class Solution {
    public boolean containsDuplicate(int[] nums) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>(nums.length);
        for (int i : nums) {
            if (map.get(i) == null) {
                map.put(Integer.valueOf(i), Integer.valueOf(1));
            } else {
                return true;
            }
        }
        return false;
    }
}