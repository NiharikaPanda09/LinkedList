import java.util.*;
public class ReturnMiddle {


    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);

        head.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        printList(middleNode(head));

        ListNode middle = middleNode(head);
        printList(middle);
    }

    public static ListNode middleNode(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }

    public static void printList(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        ListNode middle = null;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            middle = slow;
            slow = slow.next;
        }
        if (middle != null) {
            System.out.println("Middle Node Value: " + middle.val);
        } else {
            System.out.println("No middle node found.");

        }
    }
}
