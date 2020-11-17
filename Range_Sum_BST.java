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
    
    public void compute(TreeNode root, int lo, int hi){
        if(root == null)
            return;
        
        if(!(root.val < lo || root.val > hi))
            ans += root.val;
        
        if(root.val <= lo){
            compute(root.right, lo, hi);
        }
        
        else if(root.val >= hi){
            compute(root.left, lo, hi);
        }
        
        else if(root.val >= lo && root.val <= hi){
            compute(root.left, lo, hi);
            compute(root.right, lo, hi);
        }
    }
    public int rangeSumBST(TreeNode root, int low, int high) {
        ans = 0;
        
        compute(root, low, high);
        
        return ans;
    }
}
