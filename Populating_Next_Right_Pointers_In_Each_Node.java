class Solution {
    public Node connect(Node root){
        if(root == null)
            return root;
        Queue<Node> q = new LinkedList<Node>();
        q.add(root);
        Node nd = null;
        while(!q.isEmpty()){
            ArrayList<Node> qu = new ArrayList<Node>();
            while(!q.isEmpty()){
                qu.add(q.poll());
            }
            int n = qu.size();
            for(int i = 1; i < n; i++){
                nd = qu.get(i-1);
                nd.next = qu.get(i);
            }
            nd = qu.get(n-1);
            nd.next = null;
            for(int i = 0; i < n; i++){
                nd = qu.get(i);
                if(nd.left != null)
                    q.add(nd.left);
                if(nd.right != null)
                    q.add(nd.right);
            }
        }
        return root;
    }
}
