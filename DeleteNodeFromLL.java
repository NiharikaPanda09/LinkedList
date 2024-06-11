import java.util.*;
import java.util.LinkedList;
public class DeleteNodeFromLL {
      public class ListNode {
          int val;
          ListNode next;
          ListNode(int x) { val = x; }
      }

    public static void main(String[] args) {
        DeleteNodeFromLL delete = new DeleteNodeFromLL();
        ListNode head = delete.new ListNode(4);
        head.next = delete.new ListNode(5);
        head.next.next = delete.new ListNode(1);
        head.next.next.next = delete.new ListNode(9);

        ListNode nodeToDelete = head.next.next; // Node to be deleted, in this case, node with value 1
        delete.deleteNode(nodeToDelete);
        // Print the modified list
        printList(head);


    }
    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
    public static void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }

}
