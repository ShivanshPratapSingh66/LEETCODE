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
    public boolean hasPathSum(TreeNode root, int tar) {
      
           if(root==null)
        return false;
       if(root.left==null && root.right==null)
             return (tar==root.val);
        
          return( hasPathSum(root.left,tar-root.val) || hasPathSum(root.right,tar-root.val));
     

    }
}
