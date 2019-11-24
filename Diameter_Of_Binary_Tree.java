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
    static class A{
        int ans = Integer.MIN_VALUE;
    }
    
    public static int height(TreeNode root, A a){
        if(root == null)
            return 0;
        
        int lheight = height(root.left, a);
        
        int rheight = height(root.right, a);
        
        a.ans = Math.max(a.ans, lheight + rheight);
        
        return 1 + Math.max(lheight, rheight);
    }
    
    public int diameterOfBinaryTree(TreeNode root) {
        if(root == null)
            return 0;
        
        if(root.left == null && root.right == null)
            return 0;
        
        A a = new A();
        
        int x = height(root, a);
        
        return a.ans;
    }
}
