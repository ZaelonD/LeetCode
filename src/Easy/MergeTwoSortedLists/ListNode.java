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
        if (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                list1.next = mergeTwoLists(list1.next, list2);
                return list1;
            } else {
                list2.next = mergeTwoLists(list1, list2.next);
                return list2;
            }
        }
        if (list1 == null)
            return list2;
        return list1;
    }

    @Override
    public String toString() {
        if (next != null) {
            return val + ", " + next;
        }
        return String.valueOf(val);
    }
}
