/**
 * Question:
 * Given two strings s and t, write a function to determine if t is an anagram of s.
 * For example,
 * s = "anagram", t = "nagaram", return true.
 * s = "rat", t = "car", return false.
 *
 * Note:
 * You may assume the string contains only lowercase alphabets.
 * 
 * Follow up:
 * What if the inputs contain unicode characters? How would you adapt your solution to such case?
 * 
 * Solution:
 * 统计两者各个字符的个数
 */
public class Solution {
    public boolean isAnagram(String s, String t) {
        if (s == null || t == null || s.length() != t.length()) {
            return false;
        }

        if (s.equals(t)) {
            return true;
        }

        Map<Character, Integer> sMap = new HashMap<Character, Integer>(26);
        Map<Character, Integer> tMap = new HashMap<Character, Integer>(26);

        for (char a : s.toCharArray()) {
            sMap.put(a, sMap.get(a) == null ? 1 : sMap.get(a) + 1);
        }

        for (char b : t.toCharArray()) {
            tMap.put(b, tMap.get(b) == null ? 1 : tMap.get(b) + 1);
        }

        Iterator<Character> iterator = sMap.keySet().iterator();
        Character c;
        while (iterator.hasNext()) {
            c = iterator.next();
            if (!sMap.get(c).equals(tMap.get(c))) {
                return false;
            }
        }
        return true;
    }
}