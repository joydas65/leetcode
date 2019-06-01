/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution{
    public ListNode mergeTwoLists(ListNode l1, ListNode l2){
        if(l1 == null)
            return l2;
        
        if(l2 == null)
            return l1;
        
        if(l1 == null && l2 == null)
            return null;
        
        ListNode t1 = null, t2 = null, t3 = null, t4 = null, prev = null, ans = null;
        
        if(l1.val > l2.val){
            ans = l2;
            prev = ans;
            l2 = l2.next;
        }else if(l1.val < l2.val){
            ans = l1;
            prev = ans;
            l1 = l1.next;
        }else{
            ans = prev = l1;
            t3 = l1; t4 = l2;
            l1 = l1.next;
            l2 = l2.next;
            t3.next = t4;
            t4.next = l1;
            prev = prev.next;
        }
        //ListNode t1 = null, t2 = null, t3 = null, t4 = null, prev = null;
        
        t1 = l1; t2 = l2;
        
        while(t1 != null && t2 != null){
            if(t1.val == t2.val){
                t3 = t1; t4 = t2;
                t1 = t1.next;
                t2 = t2.next;
                prev.next = t3;
                t3.next = t4;
                t4.next = t1;
                prev = prev.next.next;
            }else if(t1.val < t2.val){
                prev.next = t1;
                t1 = t1.next;
                prev = prev.next;
            }else{
                t4 = t2;
                t2 = t2.next;
                prev.next = t4;
                t4.next = t1;
                prev = prev.next;
            }
        }
        if(t1 == null && t2 == null)
            return ans;
        else if(t1 == null){
            while(t2 != null){
                prev.next = t2;
                t2 = t2.next;
                prev = prev.next;
            }
            prev.next = null;
        }else if(t2 == null){
            while(t1 != null){
                prev.next = t1;
                t1 = t1.next;
                prev = prev.next;
            }
            prev.next = null;
        }
        return ans;
    }
}
