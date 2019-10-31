import java.util.HashMap;

//相交链表
public class test160 {
    //例子
//            8
//            [4,1,8,4,5]
//            [5,0,1,8,4,5]
//            2
//            3
//
//            2
//            [0,9,1,2,4]
//            [3,2,4]
//            3
//            1
//
//            0
//            [2,6,4]
//            [1,5]
//            3
//            2


//    //暴力法
//    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
//        ListNode p1 = headA;
//        ListNode p2 = headB;
//
//        if (p1 == null || p2 == null) return null;
//
//        while (p1 != null && p2 != null) {
//
//            while (p2 != null) {
//                if (p1 != p2) {
//                    p2 = p2.next;
//                } else {
//                    return p1;
//                }
//            }
//
//            p1 = p1.next;
//            p2 = headB;
//        }
//
//
//        return p1;
//    }

//    //哈希表法
//    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
//        if (headA == null || headB == null) return null;
//
//        ListNode p1 = headA;
//        ListNode p2 = headB;
//        HashMap<ListNode, Integer> map = new HashMap<>();
//
//        while (p1 != null) {
//            map.put(p1, p1.val);
//            p1 = p1.next;
//        }
//        while (p2 != null) {
//            if (map.containsKey(p2)) {
//                return p2;
//            }
//            p2 = p2.next;
//        }
//
//        return null;
//
//    }

//    //双指针法
//    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
//        if (headA == null || headB == null) return null;
//        ListNode p1 = headA;
//        ListNode p2 = headB;
//
//        //整个循环为链表A和链表B加起来的长度
//        while (p1 != null && p2 != null && p1 != p2) {
//            p1 = p1.next;
//            p2 = p2.next;
//
//            if (p1 == p2) return p1;
//
//            if (p1 == null) p1 = headB;
//            if (p2 == null) p2 = headA;
//        }
//        return p1;
//    }

    //双指针法（优化）
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) return null;
        ListNode p1 = headA;
        ListNode p2 = headB;

        //整个循环为链表A和链表B加起来的长度
        while (p1 != null && p2 != null && p1 != p2) {
            p1 = p1.next;
            p2 = p2.next;

            if (p1 == p2) return p1;

            if (p1 == null) p1 = headB;
            if (p2 == null) p2 = headA;
        }
        return p1;
    }
}
