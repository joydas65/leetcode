/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution{
    
    public int computeHeight(TreeNode root){
        
        if(root == null)
            return 0;
        int l = computeHeight(root.left);
        int r = computeHeight(root.right);
        
        return ((l == -1)||(r == -1)||Math.abs(l-r) >= 2) ? -1 : Math.max(l, r)+1;
    }
    
    public boolean isBalanced(TreeNode root){
        
        if(root == null)
            return true;
        
        if(computeHeight(root) == -1)
            return false;
        return true;
    }
}
