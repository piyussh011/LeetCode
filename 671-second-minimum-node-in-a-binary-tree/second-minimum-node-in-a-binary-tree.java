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
    long ans = Long.MAX_VALUE;
    public int findSecondMinimumValue(TreeNode root) {

        int max=root.val;
        // int smax=max;
        helper(root,max);
        return ans == Long.MAX_VALUE ? -1 : (int)ans;
    }
    void helper(TreeNode root,int max){
        if(root==null) return;

        if(root.val>max){
            ans=Math.min(ans,root.val);
             return;
            // smax=max;
            // if(smax<max && max>smax){
            //     smax=max;
            // }
        }
         helper(root.left,max);
         helper(root.right,max);
    }
}