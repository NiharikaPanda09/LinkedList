import java.util.*;
import java.util.LinkedList;
public class mergeLL {
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


        mergeLL mergeLists = new mergeLL();

        // Create linked list 1: 1 -> 3 -> 5
        ListNode list1 = mergeLists.new ListNode(1);
        list1.next = mergeLists.new ListNode(3);
        list1.next.next = mergeLists.new ListNode(5);

        // Create linked list 2: 2 -> 4 -> 6
        ListNode list2 = mergeLists.new ListNode(1);
        list2.next = mergeLists.new ListNode(4);
        list2.next.next = mergeLists.new ListNode(6);

        // Merge the two lists
        ListNode mergedList = mergeLists.mergeTwoLists(list1, list2);

        // Print the merged list
        while (mergedList != null) {
            System.out.print(mergedList.val + " ");
            mergedList = mergedList.next;
        }
    }

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode temp_node = new ListNode(0);
        ListNode curr_node = temp_node;

        while (list1 != null && list2 != null) {

            if (list1.val < list2.val) {
                curr_node.next = list1;
                list1 = list1.next;
            } else {
                curr_node.next = list2;
                list2 = list2.next;

            }
            curr_node = curr_node.next;
        }
        if (list1 != null) {
            curr_node.next = list1;
            list1 = list1.next;
        }
        if (list2 != null) {
            curr_node.next = list2;
            list2 = list2.next;
        }
        return temp_node.next;
    }
}