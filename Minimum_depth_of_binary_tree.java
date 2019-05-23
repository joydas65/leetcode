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
    public int minDepth(TreeNode root) {
        if(root == null)
            return 0;
        int l = minDepth(root.left);
        int r = minDepth(root.right);
        if(root.right == null && root.left == null)
            return 1;
        else if(root.right == null)
            return l+1;
        else if(root.left == null)
            return r+1;
        else
            return Math.min(l,r)+1;
    }
}
