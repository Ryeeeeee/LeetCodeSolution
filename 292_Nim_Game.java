/**
 * Question:
 * You are playing the following Nim Game with your friend: There is a heap of stones on the table, 
 * each time one of you take turns to remove 1 to 3 stones. 
 * The one who removes the last stone will be the winner. 
 * You will take the first turn to remove the stones.
 * Both of you are very clever and have optimal strategies for the game. 
 * Write a function to determine whether you can win the game given the number of stones in the heap.
 * For example, if there are 4 stones in the heap, 
 * then you will never win the game: no matter 1, 2, or 3 stones you remove, 
 * the last stone will always be removed by your friend.
 *
 * Solution:
 * 1. [1, 3] 可以一次性拿完，必胜
 * 2. [4] 无论如何获取总会落入 [1, 3] 中的情况, 所以必负
 * 3. [5, 7] 可以使对手处于 [4], 所以必胜
 * 4. [8] 无论如何获取，将使对手处于 [5, 7] 中而必胜，所以必负
 * 5. [9, 11] 同理必胜
 * 6. ...
 */
public class Solution {
    public boolean canWinNim(int n) {
        return !(n % 4 == 0);
    }
}
