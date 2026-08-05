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
    TreeNode Search(TreeNode node,TreeNode p, TreeNode q){
        if(node==null) return null;
         if(node==p||node==q){
            return node;
         }
        TreeNode left=Search(node.left,p,q);
        TreeNode right=Search(node.right,p,q);

        if(left!=null && right!=null){
             return node;
        }else if(left!=null){
            return left;
        }
        else{
            return right;
        }
    }
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        return Search(root,p,q);
    }
}