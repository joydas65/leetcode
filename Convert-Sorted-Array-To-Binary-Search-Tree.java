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
    
    TreeNode node;
    
    public TreeNode segregate(int[] nums, int startIndex, int endIndex, int n) {
        
        if (startIndex > endIndex)
            return null;
        
        int mid = (startIndex + endIndex)/2;
        
        TreeNode treenode = new TreeNode(nums[mid]);
        treenode.left = segregate(nums, startIndex, mid-1, n);
        treenode.right = segregate(nums, mid + 1, endIndex, n);
        
        return treenode;
    }
    
    public TreeNode sortedArrayToBST(int[] nums) {
        
        node = segregate(nums, 0, nums.length-1, nums.length);
        
        return node;
    }
}
