/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode removeElements(ListNode head, int val) {
        
        while(head != null && head.val == val){
            head = head.next;
        }
        
        if(head == null)
            return head;
        
        ListNode prev = head,temp = head.next;
        
        while(temp != null){
            if(temp.val == val){
                prev.next = temp.next;
            }else{
                prev = prev.next;
            }
            temp = temp.next;
        }
        return head;
    }
}
