import java.util.*;
public class LLCycle {
      class ListNode {
      int val;
      ListNode next;
      ListNode(int x) {
          val = x;
          next = null;
      }
  }

    public static void main(String[] args) {
        LLCycle solution = new LLCycle();

        // Create a linked list without a cycle
        LLCycle.ListNode headNoCycle = solution.new ListNode(1);
        headNoCycle.next = solution.new ListNode(2);
        headNoCycle.next.next = solution.new ListNode(3);
        headNoCycle.next.next.next = solution.new ListNode(4);

        // Check if the linked list has a cycle (should return false)
        boolean hasCycleNoCycle = solution.hasCycle(headNoCycle);
        System.out.println("Linked list has cycle: " + hasCycleNoCycle);

    }
    public boolean hasCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true;
            }
        }
        return false;
    }
}
