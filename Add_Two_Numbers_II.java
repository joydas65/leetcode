/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ArrayList<Integer> ar1 = new ArrayList<Integer>();
        
        ListNode h = l1;
        
        int i=0,j=0;
        
        while(h != null){
            ar1.add(h.val);
            h = h.next;
            i++;
        }
        
        h = l2;
        
        ArrayList<Integer> ar2 = new ArrayList<Integer>();
        
        while(h != null){
            ar2.add(h.val);
            h = h.next;
            j++;
        }
        
        int c = 0, flag = 0;
        
        ListNode node = null;
        
        ListNode x = null;
        
        while(i > 0 && j > 0){
            c = ar1.get(i-1) + ar2.get(j-1) + flag;
            
            if(c >= 10)
                flag = 1;
            else
                flag = 0;
            
            x = new ListNode(c % 10, node);
            
            node = x;
            
            i--;
            j--;
        }
        
        if(i >= 1 && j <= 0){
            while(i > 0){
                c = ar1.get(i-1) + flag;
                
                if(c >= 10)
                    flag = 1;
                else
                    flag = 0;
                
                x = new ListNode(c % 10, node);
                
                node = x;
                
                i--;
            }
        }else if(j >= 1 && i <= 0){
            while(j > 0){
                c = ar2.get(j - 1) + flag;
                
                if(c >= 10)
                    flag = 1;
                else
                    flag = 0;
                
                x = new ListNode(c % 10, node);
                
                node = x;
                
                j--;
            }
        }
        if(flag == 1){
            x = new ListNode(1, node);
            
            node = x;
        }
        return node;
    }
}
