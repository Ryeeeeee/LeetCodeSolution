/**
 * Question:
 * Reverse a singly linked list.
 *
 * Solution:
 * 记录原链表的前一个节点，然后将这个节点作为当前节点的 next 节点，遍历链表实现反转
 */
public class Solution {
    public ListNode reverseList(ListNode head) {
        if (head == null) {
            return null;
        }
        
        ListNode prev = null;
        ListNode cur = null;
        while (head != null) {
            cur = head;
            head = head.next;
            cur.next = prev;
            prev = cur;
        }
        
        return cur;
    }

    /**
     * Definition for singly-linked list.
     * public class ListNode {
     *     int val;
     *     ListNode next;
     *     ListNode(int x) { val = x; }
     * }
     */
}