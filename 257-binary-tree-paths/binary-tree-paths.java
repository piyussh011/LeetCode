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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> ans=new ArrayList<>();
        helper(ans,root,"");
        return ans;
    }
    public void helper(List<String> ans, TreeNode root ,String path){
        if(root==null) return ;
         
           path+=root.val;

        if(root.left==null &&root.right==null) {
            ans.add(path);
            return;
        }
        path+="->";
         helper(ans,root.left,path);
          helper(ans,root.right,path);
          return;
    }
}