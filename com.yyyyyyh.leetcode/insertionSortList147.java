/**
 * [147. 对链表进行插入排序](https://leetcode-cn.com/problems/insertion-sort-list/)
 */
public class insertionSortList147 {

    static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public static ListNode insertionSortList(ListNode head) {
        ListNode dummyHead = new ListNode(0);
        dummyHead.next = head;
        ListNode lastSorted = head;
        ListNode curr = head.next;
        while (curr != null) {
            // 上一次的值小于等于这次的值时，使用下一个节点
            if (lastSorted.val <= curr.val) {
                lastSorted = lastSorted.next;
            } else {
                // 从链头开始
                ListNode prev = dummyHead;
                // 循环链表，依次与当前值比较找到比当前值小的节点
                while (prev.next.val <= curr.val) {
                    prev = prev.next;
                }
                // 使用下一个节点
                lastSorted.next = curr.next;
                //
                curr.next = prev.next;
                prev.next = curr;
            }
            // 继续下一个节点
            curr = lastSorted.next;
        }
        return dummyHead.next;
    }

}
