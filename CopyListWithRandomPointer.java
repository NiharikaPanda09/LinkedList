import java.util.*;
public class CopyListWithRandomPointer {
    class Node {
        int val;
        Node next;
        Node random;

        public Node(int val) {
            this.val = val;
            this.next = null;
            this.random = null;
        }
    }

    public static void main(String[] args) {
        CopyListWithRandomPointer listProcessor = new CopyListWithRandomPointer();
        Node head = listProcessor.createLinkedList(5); // Assuming a method to create a linked list
        System.out.println("Original List:");
        listProcessor.printList(head); // Assuming a method to print the list

        Node copiedHead = listProcessor.copyRandomList(head);
        System.out.println("\nCopied List:");
        listProcessor.printList(copiedHead); // Pr
    }
    public Node copyRandomList(Node head) {
        //1.) base case
        if (head == null) {
            return null;
        }
        Map<Node, Node> oldToCopy = new HashMap<>() ;
        Node cur = head;
        while(cur != null){
            oldToCopy.put(cur, new Node(cur.val));
            cur = cur.next;
        }
        cur = head;
        while(cur != null){
            Node copy = oldToCopy.get(cur);
            if(cur.next != null){
                copy.next = oldToCopy.get(cur.next);

            }
            if(cur.random != null){
                copy.random = oldToCopy.get(cur.random);
            }
            cur = cur.next;
        }

        return oldToCopy.get(head);


    }
    private Node createLinkedList(int size) {
        Node dummy = new Node(0);
        Node tail = dummy;
        Random rand = new Random();

        for (int i = 1; i <= size; i++) {
            tail.next = new Node(rand.nextInt(100)); // Generate random values
            tail = tail.next;
        }

        // Set random pointers
        tail = dummy.next;
        for (int i = 1; i < size; i++) {
            tail.random = tail.next;
            tail = tail.next;
        }

        return dummy.next;
    }

    private void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}
