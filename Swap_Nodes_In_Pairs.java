/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode swapPairs(ListNode head){
        int c = 0;
        if(head == null || head.next == null)
            return head;
        ListNode x = head,temp = head,k = head,v = head;
        while(x != null){
            k = x.next;
            if(x.next != null){
                temp = x.next.next;
            }else{
                break;
            }
            x.next = temp;
            k.next = x;
            if(c == 0)
                head = k;
            else
                v.next = k;
            v = x;
            x = temp;
            c++;
        }
        return head;
    }
}
