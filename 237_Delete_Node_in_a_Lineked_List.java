/**
 * Question:
 * Write a function to delete a node (except the tail) in a singly linked list, given only access to that node.
 * Supposed the linked list is 1 -> 2 -> 3 -> 4 and you are given the third node with value 3,
 * the linked list should become 1 -> 2 -> 4 after calling your function.
 *
 * Solution:
 * 由题目得知, 传入的待删除的为非末尾节点，所以不需要考虑 next 为空的问题
 * 因为无法获取前一个节点，所以不能使用正常的方式删除节点
 * 解法是将下一个节点的数据覆盖本节点，然后删除下一个节点
 */
public class Solution {
    /**
    * Definition for singly-linked list.
    * public class ListNode {
    *     int val;
    *     ListNode next;
    *     ListNode(int x) { val = x; }
    * }
    */
    public void deleteNode(ListNode node) {
        if (node == null) {
            return;
        }
        
        node.val = node.next.val;
        node.next = node.next.next;
    }
}
