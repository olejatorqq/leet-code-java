import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ListNode node1_1 = new ListNode(1);
        ListNode node2_1 = new ListNode(2, node1_1);
        ListNode node3_1 = new ListNode(3, node2_1);

        ListNode list1 = new ListNode(node3_1.val);

        ListNode node1_2 = new ListNode(3);
        ListNode node2_2 = new ListNode(2, node1_2);
        ListNode node3_2 = new ListNode(1, node2_2);

        ListNode list2 = new ListNode(node3_2.val);

        //System.out.println(Solution.mergeTwoLists(list1,list2).val);
    }
}