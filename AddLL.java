import java.util.*;
public class AddLL {

         public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }


    public static void main(String[] args) {

             AddLL add = new AddLL();
       ListNode list1 = add.new ListNode(1);
        list1.next = add.new ListNode(3);
        list1.next.next = add.new ListNode(5);

        // Create linked list 2: 2 -> 4 -> 6
     ListNode list2 = add.new ListNode(1);
        list2.next = add.new ListNode(4);
        list2.next.next = add.new ListNode(6);

        // Merge the two lists
        ListNode mergedList = add.addTwoNumbers(list1, list2);

        // Print the merged list
        while (mergedList != null) {
            System.out.print(mergedList.val + " ");
            mergedList = mergedList.next;
        }
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
             ListNode dummy = new ListNode();
             ListNode res = dummy;

             int total =0;
             int carry = 0;

             while(l1 != null || l2 != null || carry !=0 ){
                 total = carry;
                 if(l1!= null){
                     total += l1.val;
                     l1 = l1.next;

                 }
                 if(l2 != null){
                     total += l2.val;
                     l2 = l2.next;
                 }
                 int num = total%10;
                 carry = total/10;
                 dummy.next = new ListNode(num);
                 dummy = dummy.next;
             }
             return res.next;
    }
}
