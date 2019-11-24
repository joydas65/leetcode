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
    static int ans = 0;
    public static void inorder(TreeNode root, int L, int R){
        //System.out.println("Hello Im Joy");
        if(root == null)
            return;
        
        inorder(root.left, L, R);
        
        if(root.val >= L && root.val <= R){
            ans += root.val;
        }
        
        inorder(root.right, L, R);
    }
    public int rangeSumBST(TreeNode root, int L, int R) {
        ans = 0;
        inorder(root, L, R);
        return ans;
    }
}
