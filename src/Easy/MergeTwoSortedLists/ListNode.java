package Easy.MergeTwoSortedLists;

//Input: list1 = [1,2,4], list2 = [1,3,4]
//        Output: [1,1,2,3,4,4]

//Input: list1 = [], list2 = []
//        Output: []

//Input: list1 = [], list2 = [0]
//        Output: [0]

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

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode result = new ListNode(0);
        ListNode l1 = list1, l2 = list2, curNode = result;
        int val1, val2, sum, dozenCarrier = 0;
        while (l1 != null || l2 != null) {
            if (l1 == null)
                return result;
            else
                val1 = l1.val;

            if (l2 == null)
                return result;
            else
                val2 = l1.val;

            if (val1 > val2){
                result = new ListNode(val2);
                result.next = new ListNode(val1);
            }
            else{
                result = new ListNode(val1);
                result.next = new ListNode(val2);
            }

        }
        return result;
    }

    @Override
    public String toString() {
        return "ListNode{" +
                "val=" + val +
                ", next=" + next +
                '}';
    }
}
