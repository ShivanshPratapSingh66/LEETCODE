/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root==null)
        return null;
       return solve(root,p,q);
        
    }
    public static TreeNode solve(TreeNode root,TreeNode p,TreeNode q){
         if(root==null || root==p || root==q)
        return root;
        TreeNode left = solve(root.left,p,q);
        TreeNode right = solve(root.right,p,q);
         if(right!=null && left!=null)
        return root;
         if(right==null && left!=null)
        return left;
       // if(left==null && right!=null )
        return right;
       
    
       

    }
}
