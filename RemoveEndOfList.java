import java.util.*;
import java.util.LinkedList;
public class RemoveEndOfList {
    public class ListNode {
     int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) {
          this.val = val;
      }
      ListNode(int val, ListNode next) {
          this.val = val;
          this.next = next;
      }
  }

          public static void main(String[] args) {
              RemoveEndOfList removeEnd = new RemoveEndOfList();

              // Create a linked list: 1 -> 2 -> 3 -> null
              ListNode head = removeEnd.new ListNode(1);
              ListNode node2 = removeEnd.new ListNode(2);
              ListNode node3 = removeEnd.new ListNode(3);
              ListNode node4 = removeEnd.new ListNode(4);
              ListNode node5 = removeEnd.new ListNode(5);

              head.next = node2;
              node2.next = node3;
              node3.next = node4;
              node4.next = node5;
              int n = 2; // Specify the position from the end to remove
              ListNode result = removeEnd.removeNthFromEnd(head, n);
              while (result != null) {
                  System.out.print(result.val + " ");
                  result = result.next;
              }

         }

        public  ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode res = new ListNode(0,head);
            ListNode dummy = res;

            for(int i=0;i<n;i++){
                head = head.next;

            }
            while(head!=null){
                head = head.next;
                dummy = dummy.next;
            }
            dummy.next = dummy.next.next;
            return res.next;
    }
}

