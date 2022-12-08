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

    public TreeNode inorder(TreeNode node, List<Integer> leaves) {
        if (node == null)
        return node;

        TreeNode left = inorder(node.left, leaves);

        TreeNode right = inorder(node.right, leaves);

        if (left == null && right == null) {
            leaves.add(node.val);
        }

        return node;
    }
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> leaves1 = new ArrayList<>();

        List<Integer> leaves2 = new ArrayList<>();

        inorder(root1, leaves1); inorder(root2, leaves2);

        int i = 0, j = 0, m = leaves1.size(), n = leaves2.size();

        if (m != n) {
            return false;
        }

        while (i < m && j < n) {
            if (leaves1.get(i) != leaves2.get(j)) {
                return false;
            }
            i++; j++;
        }

        return true;
    }
}
