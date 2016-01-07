/*
 * Question:
 * Given a binary tree and a sum, determine if the tree has a root-to-leaf path 
 * such that adding up all the values along the path equals the given sum.
 * 
 * For example:
 * Given the below binary tree and sum = 22,
 *            5
 *           / \
 *          4   8
 *         /   / \
 *        11  13  4
 *       /  \      \
 *      7    2      1
 * return true, as there exist a root-to-leaf path 5->4->11->2 which sum is 22.
 * 
 * Solution:
 * 只有是叶节点验证结果，否则就验证左右子节点
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
    private boolean isRoot = true;
    public boolean hasPathSum(TreeNode root, int sum) {
        if (root == null) {
            return false;
        }
        
        int needValue = sum - root.val;
        if (root.left == null && root.right == null) {
            return needValue == 0 ? true : false;
        }
        
        return hasPathSum(root.left, needValue) || hasPathSum(root.right, needValue);
    }
}