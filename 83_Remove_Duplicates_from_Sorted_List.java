/**
 * Question:
 * Given a sorted linked list, delete all duplicates such that each element appear only once.
 * For example,
 * Given 1->1->2, return 1->2.
 * Given 1->1->2->3->3, return 1->2->3.
 *
 * Solution:
 * 两个指针，注意边界值, 新加入节点的 next 指针置空
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
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        
        ListNode index = head;
        
        for (ListNode iter = head.next; iter != null; iter = iter.next) {
            if (index.val != iter.val) {
                index.next = iter;
                index = index.next;
            } else {
                index.next = null;
            }
        }
        
        return head;
    }
}