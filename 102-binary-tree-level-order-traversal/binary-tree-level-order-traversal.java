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
    public List<List<Integer>> levelOrder(TreeNode root) {
       
        Queue<TreeNode> q =new LinkedList<>();

        List<List<Integer>> ans =new ArrayList<>();
          if(root==null)  return ans;
        q.offer(root);

        while(q.size()>0){
            int size=q.size();
            List<Integer> ad=new ArrayList<>();
              for(int i=0;i<size;i++){
                TreeNode n=q.poll();
                ad.add(n.val);
                if(n.left!=null) q.offer(n.left);
                  if(n.right!=null) q.offer(n.right);
              }
              ans.add(ad);
        }
        return ans;
    }
}