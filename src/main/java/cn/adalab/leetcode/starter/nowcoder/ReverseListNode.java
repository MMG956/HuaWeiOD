package cn.adalab.leetcode.starter.nowcoder;

import cn.adalab.leetcode.helpers.SolutionRunner;
import cn.adalab.leetcode.helpers.ds.ListNode;

public class ReverseListNode extends SolutionRunner {
    @Override
    public void run() {
        ListNode listNode = toLinkedList("[1,2,3]");
        System.out.println(reverse(listNode));
    }

    public ListNode reverse(ListNode head){
        /*if (head.next == null || head == null){
            return head;
        }
        ListNode next = head.next;
        ListNode reverse = reverse(next);
        next.next = head;
        head.next =null;
        return reverse;*/
//        return recur(head,null);
        ListNode pre = null;
        ListNode cur = head;
        while (cur != null){
            ListNode next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        return pre;
    }
    private ListNode recur(ListNode head,ListNode pre){
        if (head == null){
            return pre;
        }
        ListNode next = head.next;
        head.next = pre;
        return recur(next,head);
    }
}
