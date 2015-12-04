/**
 * Question:
 * Given a linked list, remove the nth node from the end of list and return its head.
 *
 * For example,
 * Given linked list: 1->2->3->4->5, and n = 2.
 * After removing the second node from the end, the linked list becomes 1->2->3->5.
 *
 * Note:
 * Given n will always be valid.
 * Try to do this in one pass.
 * 
 * Solution:
 * 涉及查找链表中的某个特定位置，用两个指针
 */

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null) {
            return head;
        }
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode cur = dummy;
        ListNode iter = dummy;
        while (n-- > 0) {
            iter = iter.next;
        }
        
        while (iter.next != null) {
            iter = iter.next;
            cur = cur.next;
        }
        
        if (cur.next != null) {
            cur.next = cur.next.next;
        }
        return dummy.next;
    }
}