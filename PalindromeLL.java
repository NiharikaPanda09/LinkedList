import java.util.*;
import java.util.LinkedList;
public class PalindromeLL {

public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }




    public static void main(String[] args) {
            PalindromeLL palin = new PalindromeLL();
            ListNode head =  palin. new ListNode(1);
            head.next = palin.new ListNode(2);
            head.next.next = palin.new ListNode(2);
            head.next.next.next = palin.new ListNode(1);

            boolean Pal = palin.isPalindrome(head);
        System.out.println("is it palin??" + Pal);

    }
    public boolean isPalindrome(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        // Find the middle of the linked list
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Reverse the second half of the linked list
        ListNode prev = null;
        ListNode current = slow;
        ListNode next;

        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        // Compare the first half with the reversed second half
        ListNode firstHalf = head;
        ListNode secondHalf = prev;

        while (secondHalf != null) {
            if (firstHalf.val != secondHalf.val) {
                return false;
            }
            firstHalf = firstHalf.next;
            secondHalf = secondHalf.next;
        }

        return true;
    }
}
