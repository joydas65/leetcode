/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
    public Node connect(Node root) {
        if(root == null)
            return root;
        Node node = null;
        
        Queue<Node> q = new LinkedList<>();
        
        q.add(root);
        
        int c = 1, temp = 0;
        
        while(c >= 1){
            node = q.remove();
            
            c -= 1;
            
            if(node.left != null){
                temp++;
                q.add(node.left);
            }
            
            if(node.right != null){
                temp++;
                q.add(node.right);
            }
            
            if(c == 0){
                node.next = null;
                c = temp;
                temp = 0;
            }else{
                node.next = q.peek();
            }
        }
        
        return root;
    }
}
