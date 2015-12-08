/**
 * Question:
 * Given two binary trees, write a function to check if they are equal or not.
 * Two binary trees are considered equal if they are structurally identical and the nodes have the same value.
 *
 * Solution:
 * 当前节点是否相同需要依赖于子节点是否都相同
 * 如果两个节点都为空，表示当前比较的两个节点都是相同的
 * 如果两个节点一个为空，一个不是，则两个节点肯定不相同
 * 如果两个节点都不为空，若值不同，则两个节点肯定不相同，如果值也相同则还需依赖子节点是否相同
 */

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        } else if (p != null && q != null) {
            if (p.val != q.val) {
                return false;
            } else {
                return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
            }
        } else {
            return false;
        }
    }
}