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
    static ArrayList<Integer> arr = new ArrayList<Integer>();
    static int x = 0;
    static int ans = 10000000;
    public static void Inorder(TreeNode t){
        if(t.left != null)
            Inorder(t.left);
        arr.add(t.val);
        ++x;
        if(x >= 2){
            ans = Math.min(ans, arr.get(x-1)-arr.get(x-2));
        }
        if(t.right != null)
            Inorder(t.right);
    }
    public int getMinimumDifference(TreeNode root){
        ans = 10000000;
        x = 0;
        arr = new ArrayList<Integer>();
        Inorder(root);
        return ans;
    }
}
