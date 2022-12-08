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
    public ListNode oddEvenList(ListNode head) {
        if (head == null || head.next == null)
        return head;

        ListNode oddHead = head;

        ListNode evenHead = head.next;

        ListNode oddnode = head, evennode = head.next, odd = null, even = null;

        while (oddnode != null && evennode != null) {

            odd = oddnode; even = evennode;

            if (oddnode.next == null || evennode.next == null)
                break;

            odd = odd.next.next;
            even = even.next.next;

            oddnode.next = odd;
            evennode.next = even;

            oddnode = odd;
            evennode = even;
        }

        oddnode.next = evenHead;

        if (evennode != null) {
            evennode.next = null;
        }

        return oddHead;
    }
}
