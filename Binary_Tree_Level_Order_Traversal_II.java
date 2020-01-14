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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        if(root == null)
            return ans;
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        q.add(root);
        //ans.add(f);
        while(!q.isEmpty()){
            int n = q.size();
            List<Integer> f = new ArrayList<Integer>();
            while(n-- > 0){
                TreeNode node = q.poll();
                if(node.left != null)
                    q.add(node.left);
                if(node.right != null)
                    q.add(node.right);
                f.add(node.val);
            }
            ans.add(f);
        }
        Collections.reverse(ans);
        return ans;
    }
}
