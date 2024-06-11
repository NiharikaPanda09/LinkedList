public class LLCycleII {
    class ListNode {
      int val;
      ListNode next;
      ListNode(int x) {
          val = x;
          next = null;
      }
  }

    public static void main(String[] args) {
        LLCycleII solution = new LLCycleII();

        // Create a linked list with a cycle
        LLCycleII.ListNode head = solution.new ListNode(1);
        head.next = solution.new ListNode(2);
        head.next.next = solution.new ListNode(3);
        head.next.next.next = solution.new ListNode(4);
        head.next.next.next.next = head.next; // creating a cycle from node with value 4 to node with value 2

        // Check if the linked list has a cycle
        LLCycleII.ListNode cycleStart = solution.detectCycle(head);
        if (cycleStart != null) {
            System.out.println("Linked list has a cycle. Cycle starts at node with value: " + cycleStart.val);
        } else {
            System.out.println("Linked list does not have a cycle.");
        }
    }
    public ListNode detectCycle(ListNode head) {
      ListNode slow = head;
      ListNode fast = head;
      while(fast != null && fast.next != null){
          slow = slow.next;
          fast = fast.next.next;
          if (slow == fast) break;



      }
      if(fast == null || fast.next == null) return null;
       while(head!= slow){
           head = head.next;
           slow = slow.next;
       }
       return head;


    }
}
