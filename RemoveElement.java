import java.util.*;
public class RemoveElement {
    public class ListNode {
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
        RemoveElement removeElement = new RemoveElement();
        ListNode head = removeElement.new ListNode(4);
        head.next = removeElement.new ListNode(1);
        head.next.next = removeElement.new ListNode(8);
        head.next.next.next = removeElement.new ListNode(4);
        head.next.next.next.next = removeElement.new ListNode(5);

        int val = 8;

        ListNode result = removeElement.removeElements(head, val);
        printList(result);


    }
    public ListNode removeElements(ListNode head, int val) {
        ListNode temp = new ListNode(0), curr = temp;
        temp.next = head;
        while(curr.next != null){
            if(curr.next.val == val){
                curr.next = curr.next.next;
            }else{
                curr = curr.next;
            }
        }
        return temp.next;

    }
    public static void printList(ListNode head) {
        ListNode curr = head;
        while (curr != null) {
            System.out.print(curr.val + " ");
            curr = curr.next;
        }
        System.out.println();
    }
}
