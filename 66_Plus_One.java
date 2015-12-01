/**
 * Quesiton: 
 * Given a non-negative number represented as an array of digits, plus one to the number.
 * The digits are stored such that the most significant digit is at the head of the list.
 * 
 * Solution:
 * 从尾部开始加，注意进位
 */
public class Solution {
    public int[] plusOne(int[] digits) {
        int carry = 1;
        for (int i = digits.length - 1; i >=0; i--) {
            int bit = digits[i] + carry;
            digits[i] = bit % 10;
            carry = bit / 10;
        }
        
        if (carry != 0) {
            int[] newDigits = new int[digits.length + 1];
            newDigits[0] = 1;
            for (int j = 0; j < digits.length; j++) {
                newDigits[j + 1] = digits[j];
            }
            return newDigits;
        } else {
            return digits;
        }
    }
}