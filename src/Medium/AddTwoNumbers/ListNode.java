package Medium.AddTwoNumbers;

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

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(0);
        ListNode list1 = l1, list2 = l2, curNode = result;

        int val1, val2, sum, dozenCarrier = 0;
        while (list1 != null || list2 != null) {
            if (list1 == null) {
                val1 = 0;
            } else {
                val1 = list1.val;
            }

            if (list2 == null) {
                val2 = 0;
            } else {
                val2 = list2.val;
            }

            sum = val1 + val2 + dozenCarrier;
            dozenCarrier = sum / 10;
            curNode.next = new ListNode(sum % 10);
            curNode = curNode.next;

            if (list1 != null)
                list1 = list1.next;
            if (list2 != null)
                list2 = list2.next;
        }
        if (dozenCarrier > 0)
            curNode.next = new ListNode(dozenCarrier);
        return result.next;
    }

    @Override
    public String toString() {
        return "ListNode{" +
                "val=" + val +
                ", next=" + next +
                '}';
    }
}
