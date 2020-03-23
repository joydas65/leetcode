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
    static int h = 0;
    public void findSumLeft(TreeNode root){
        if(root == null)
            return;
        
        if(root.left != null && root.left.left == null && root.left.right == null)
            h += root.left.val;
        
        findSumLeft(root.left);
        
        findSumLeft(root.right);
    }
    public int sumOfLeftLeaves(TreeNode root) {
        h = 0;
        new Solution().findSumLeft(root);
        return h;
    }
}
