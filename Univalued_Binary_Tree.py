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
    public boolean isUnivalTree(TreeNode root) {
        boolean v1=true,v2=true;
        if(root.left != null){
            if(root.val != root.left.val)
                return false;
            v1 = isUnivalTree(root.left);
        }
        
        if(v1 == false)
            return false;
        
        if(root.right != null){
            if(root.val != root.right.val)
                return false;
            v2 = isUnivalTree(root.right);
        }
        
        return v1 && v2;
    }
}
