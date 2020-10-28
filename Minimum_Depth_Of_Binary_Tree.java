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
    public int calc(TreeNode root, int d){
        int leftD = -1,rightD = -1;
        
        if(root != null && root.left == null && root.right == null)
            return d;
        
        if(root.left != null)
            leftD = calc(root.left, d+1);
        
        if(root.right != null)
            rightD = calc(root.right, d+1);
        
        if(leftD != -1 && rightD == -1)
            return leftD;
        
        if(leftD == -1 && rightD != -1)
            return rightD;
        
        if(leftD == -1 && rightD == -1)
            return 1;
        
        return Math.min(leftD, rightD);
    }
    public int minDepth(TreeNode root) {
        if(root == null)
            return 0;
        if(root != null && root.left == null && root.right == null)
            return 1;
        return calc(root, 1);
    }
}
