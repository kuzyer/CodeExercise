//两数相加
public class test002 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode t1 = l1;
        ListNode t2 = l2;
        ListNode result = new ListNode(0);
        ListNode r1 = result;
        int sum = 0;
        while (t1 != null || t2 != null || sum != 0) {

            if (t1 != null) {
                sum += t1.val;
                t1 = t1.next;
            }
            if (t2 != null) {
                sum += t2.val;
                t2 = t2.next;
            }
            r1.next = new ListNode(sum % 10);
            r1 = r1.next;
            sum /= 10;
        }
        return result.next;
    }
}
