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
    public ListNode insertionSortList(ListNode head) {
        if(head == null)
            return head;
        
        ListNode newHead = new ListNode(head.val);
        
        newHead.next = null;
        
        ListNode point = newHead;
        
        ListNode temp = null;
        
        ListNode prev = null, nextNode = null;
        
        head = head.next;
        
        while(head != null){
            temp = new ListNode(head.val);
            nextNode = point;
            while(point != null){
                if(temp.val < point.val){
                    if(prev == null){
                        temp.next = point;
                        newHead = temp;
                    }else{
                        prev.next = temp;
                        temp.next = nextNode;
                    }
                    break;
                }
                
                point = point.next;
                
                prev = nextNode;
                
                nextNode = nextNode.next;
            }
            
            if(point == null){
                prev.next = temp;
                temp.next = null;
            }
            
            point = newHead; prev = null;
            
            head = head.next;
        }
        
        return newHead;
    }
}
