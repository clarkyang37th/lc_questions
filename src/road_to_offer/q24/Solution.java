package road_to_offer.q24;
//https://leetcode.cn/problems/fan-zhuan-lian-biao-lcof/description/
public class Solution {
    public static void main(String[] args) {
        // 创建测试用例链表 [1, 2, 3, 4, 5]
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        // 输出原始链表
        System.out.println("Original List: " + listToString(head));

        // 逆转链表
        ListNode reversedHead = new Solution().trainningPlan(head);

        // 输出逆转后的链表
        System.out.println("Reversed List: " + listToString(reversedHead));
    }

    public ListNode trainningPlan(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode temp = trainningPlan(head.next);
        head.next.next = head;
        head.next = null;
        return temp;
    }


    // 辅助方法，用于将链表转换为字符串形式以便输出
    private static String listToString(ListNode head) {
        StringBuilder sb = new StringBuilder();
        ListNode current = head;
        while(current != null) {
            sb.append(current.val);
            if (current.next != null) {
                sb.append(" -> ");
            }
            current = current.next;
        }
        return sb.toString();
    }

    // Definition for singly-linked list.
    static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
}
