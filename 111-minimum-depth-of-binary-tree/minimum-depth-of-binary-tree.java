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
    // static int min;
    public int minDepth(TreeNode root) {
        if(root==null)return 0;
        // min=1;
        return minimum(root);
        // return min;
    }
     int minimum(TreeNode root){

        if(root==null) return 10000000;
        if(root.left==null && root.right==null) return 1;



        int leftlen=minimum(root.left);
        int rightlen=minimum(root.right);

        // min=1+Math.min(leftlen,rightlen);
        
        return 1+Math.min(leftlen,rightlen);
    }
}