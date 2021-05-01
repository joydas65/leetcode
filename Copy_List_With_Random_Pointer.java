class Solution {
    public Node copyRandomList(Node head) {
        if (head == null)
            return head;
        
        ArrayList<Node> arr = new ArrayList<Node>();
        
        HashMap<Node, Integer> hmap = new HashMap<Node, Integer>();
        
        Node ans = null, nd = null, node = head;
        
        int c = 0;
        
        while (head != null) {
            if (ans == null) {
                ans = new Node(head.val);
                ans.next = null;
                nd = ans;
                ans.random = null;
            } else {
                nd.next = new Node(head.val);
                nd = nd.next;
                nd.random = null;
            }
            
            hmap.put(head, c); c++;
            
            arr.add(nd);
            
            head = head.next;
        }
        
        nd.next = head;
        
        nd = ans;
        
        while (node != null) {
            
            if (node.random != null) {
                nd.random = arr.get(hmap.get(node.random));
            }
            
            nd = nd.next; node = node.next;
        }
        
        return ans;
    }
}
