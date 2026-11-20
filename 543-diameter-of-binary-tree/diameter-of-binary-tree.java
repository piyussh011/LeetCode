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
    int count=0;
    public int diameterOfBinaryTree(TreeNode root) {
        helper(root);
        return count;       
    }
    private int helper(TreeNode root){
        if(root==null) {
                return 0;
        }
        int x=  helper(root.left);
        int y=  helper(root.right);
        count=Math.max(count,x+y);

        return 1+Math.max(x,y);
    }
}