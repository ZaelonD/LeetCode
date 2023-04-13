package Easy.MergeTwoSortedLists;

/*Input: list1 = [1,2,4], list2 = [1,3,4]
        Output: [1,1,2,3,4,4]*/

public class Solution {
    public static void main(String[] args) {
        ListNode list1 = new ListNode(1, new ListNode(2, new ListNode(4)));
        ListNode list2 = new ListNode(1, new ListNode(3, new ListNode(5)));

        System.out.println("[" + ListNode.mergeTwoLists(list1, list2).toString() + "]");
    }
}
