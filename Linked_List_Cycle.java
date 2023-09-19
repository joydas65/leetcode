public class Solution {
    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) return false;

        ListNode fast = head, slow = head;

        while (fast != null) {
            fast = fast.next;
            if (fast != null) fast = fast.next;
            else break;

            slow = slow.next;

            if (slow == fast || (fast != null && fast.next == slow)) return true;
        }

        return false;
    }
}
