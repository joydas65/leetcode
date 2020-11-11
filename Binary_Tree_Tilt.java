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
    int ans = 0;
    public int findAns(TreeNode root){
        if(root == null)
            return 0;
        
        int l = findAns(root.left);
        
        int r = findAns(root.right);
        
        ans += Math.abs(l - r);
        
        return l + r + root.val;
    }
    public int findTilt(TreeNode root) {
        ans = 0;
        
        int val = findAns(root);
        
        return ans;
    }
}
