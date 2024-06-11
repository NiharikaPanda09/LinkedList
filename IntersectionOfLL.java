import java.util.*;
import java.util.LinkedList;
public class IntersectionOfLL {
      public class ListNode {
      int val;
      ListNode next;
      ListNode(int x) {
          val = x;
          next = null;
      }
  }

    public static void main(String[] args) {
        IntersectionOfLL intersection = new IntersectionOfLL();
        ListNode head = intersection.new ListNode(4);
        head.next = intersection.new ListNode(1);
        head.next.next = intersection.new ListNode(8);
        head.next.next.next = intersection.new ListNode(4);
        head.next.next.next.next = intersection.new ListNode(5);

        ListNode head2 = intersection.new ListNode(5);
        head2.next = intersection.new ListNode(6);
        head2.next.next = intersection.new ListNode(1);
        head2.next.next.next = head.next.next;

        ListNode inter = getIntersectionNode(head, head2);
        while (inter != null) {
            System.out.print(inter.val + " ");
            inter = inter.next;

        }
    }
    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
       if(headA == null || headB == null){
           return null;
       }
       ListNode a = headA;
       ListNode b = headB;

       while(a!=b){
           a = a == null ? headB : a.next;
           b=b == null ? headA: b.next;
       }
       return a;
    }
}
