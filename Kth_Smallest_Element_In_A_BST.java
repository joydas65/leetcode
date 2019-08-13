/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution{
    static int c = 0;
    static int ans = -1;
    public void Inorder(TreeNode nd, int k){
        //System.out.print(nd.val+" ");
        if(nd == null)
            return;
        if(ans != -1)
            return;
        if(nd.left != null)
            Inorder(nd.left, k);
        if(c >= k)
            return;
        //System.out.println("HI\nRO");
        c += 1;
        if(c == k){
            ans = nd.val;
            return;
        }
        if(nd.right != null)
            Inorder(nd.right, k);
    }
    public int kthSmallest(TreeNode root, int k) {
        //arr = new ArrayList<Integer>();
        c = 0;ans = -1;
        new Solution().Inorder(root, k);
        return ans;
    }
}
