/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    int sum=0;
    public boolean hasPathSum(TreeNode root, int targetSum) {
        return inorder(root,targetSum);
    }
    public boolean inorder(TreeNode root, int target)
    {
         if (root == null) {
            return false;
        }
        sum += root.val;
        if (root.left == null && root.right == null) {
            boolean ans = (sum == target);
            sum -= root.val; 
            return ans;
        }
        boolean left = inorder(root.left, target);
        boolean right = inorder(root.right, target);
        sum -= root.val;   

        return left || right;
    }
}