/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/
class Solution {
    static List<Integer> arr;
    
    public static void func(Node root){
        if(root == null)
            return;
        arr.add(root.val);
        
        for(int i = 0; i < root.children.size(); i++){
            func(root.children.get(i));
        }
    }
    
    public List<Integer> preorder(Node root) {
        arr = new ArrayList<Integer>();
        
        func(root);
        
        return arr;
    }
}
