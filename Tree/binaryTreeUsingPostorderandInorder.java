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
    int postIndx;
    HashMap<Integer,Integer> map=new HashMap<>();
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        postIndx=postorder.length-1;
        for(int i=0;i<inorder.length;i++){
            map.put(inorder[i],i);
        }
        return build(postorder,0,inorder.length-1);
    }
    TreeNode build(int[] postorder,int left,int right){
        if(left>right){
            return null;
        }
        int rootnode=postorder[postIndx--];
        TreeNode root=new TreeNode(rootnode);

        int mid=map.get(rootnode);
        root.right=build(postorder,mid+1,right);
        root.left=build(postorder,left,mid-1);
        return root;
    }
}