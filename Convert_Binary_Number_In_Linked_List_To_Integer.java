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
    public int getDecimalValue(ListNode head) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        
        while(head != null){
            arr.add(head.val);
            head = head.next;
        }
        
        long ans = 0, p = 1;
        
        for(int i = arr.size()-1; i >= 0; i--){
            ans += arr.get(i)*p;
            p *= 2;
        }
        
        return (int)ans;
    }
}
