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
    public ListNode deleteMiddle(ListNode head) {
        if (head == null || head.next == null)
        return null;

        ListNode slow = head, fast = head, previous = head;

        while (fast != null && fast.next != null) {
            previous = slow;
            fast = fast.next.next;
            slow = slow.next;
        }

        previous.next = previous.next.next;

        return head;
    }
}
