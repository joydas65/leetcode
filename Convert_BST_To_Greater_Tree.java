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
    static ArrayList<Integer> arr;
    public static void populateList(TreeNode root){
        if(root == null)
            return;
        populateList(root.left);
        
        arr.add(root.val);
        
        populateList(root.right);
    }
    public static void inorderTraversal(TreeNode root, HashMap<Integer, Integer> d){
        if(root == null)
            return;
        
        inorderTraversal(root.left, d);
        
        root.val = d.get(root.val);
        
        inorderTraversal(root.right, d);
    }
    public TreeNode convertBST(TreeNode root) {
        arr = new ArrayList<Integer>();
        populateList(root);
        HashMap<Integer, Integer> dict = new HashMap<Integer, Integer>();
        int n = arr.size();
        if(n == 0)
            return root;
        dict.put(arr.get(n-1),arr.get(n-1));
        for(int i = n-2; i >= 0; i--){
            dict.put(arr.get(i),arr.get(i+1)+arr.get(i));
            arr.set(i, arr.get(i+1)+arr.get(i));
        }
        inorderTraversal(root,dict);
        
        return root;
    }
}
