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
    static TreeNode previousNode = null, ans = null;
    public static void inorder(TreeNode root){
        if(root == null)
            return;
        
        inorder(root.left);
        
        if(previousNode != null){
            previousNode.right = root;
            root.left = null;
        }else{
            ans = root;
        }
        
        previousNode = root;
        
        inorder(root.right);
    }
    public TreeNode increasingBST(TreeNode root) {
        previousNode = null; ans = null;
        inorder(root);
        return ans;
    }
}
