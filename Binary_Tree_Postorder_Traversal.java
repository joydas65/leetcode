class Solution {
    List<Integer> answer;
    public void postOrder(TreeNode root) {
        if (root == null) return;

        postOrder(root.left);
        postOrder(root.right);

        answer.add(root.val);
    }
    
    public List<Integer> postorderTraversal(TreeNode root) {
        answer = new ArrayList<>();

        postOrder(root);

        return answer;
    }
}
