package Medium.AddTwoNumbers;

import java.util.Arrays;
import java.util.LinkedList;

public class Solution {
    public static void main(String[] args) {

        ListNode list1 = new ListNode(2, new ListNode(4, new ListNode(3)));
        ListNode list2 = new ListNode(5, new ListNode(6, new ListNode(4)));

        System.out.println(ListNode.addTwoNumbers(list1, list2).toString());
    }
}
