/**
 * [237. 删除链表中的节点](https://leetcode-cn.com/problems/delete-node-in-a-linked-list/)
 * 这题是用脚翻译的吗？
 */
public class DeleteNodeInALinkedList237 {

      class ListNode {
          int val;
          ListNode next;
          ListNode(int x) { val = x; }
      }
    
    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }

}
