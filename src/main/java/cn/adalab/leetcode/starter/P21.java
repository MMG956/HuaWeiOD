package cn.adalab.leetcode.starter;

import cn.adalab.leetcode.helpers.SolutionRunner;
import cn.adalab.leetcode.helpers.ds.ListNode;

import java.util.ArrayList;
import java.util.Comparator;

public class P21 extends SolutionRunner {
    @Override
    public void run() {
        var head1 = toLinkedList("[1,2,4]");
        var head2 = toLinkedList("[1,3,4]");
        var merged = mergeTwoLists(head1, head2);
        System.out.println(merged);
        assertSameList(toLinkedList("[1,1,2,3,4,4]"), merged);
    }

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ArrayList<ListNode> array = new ArrayList<>();
        ListNode head = l1;
        while (head != null) {
            array.add(head);
            head = head.next;
        }
        head = l2;
        while (head != null) {
            array.add(head);
            head = head.next;
        }
        array.sort(Comparator.comparingInt(node -> node.val));
        if (array.isEmpty()) {
            return null;
        }
        ListNode curr = array.get(0);
        head = curr;
        for (int i = 1; i < array.size(); i++) {
            curr.next = array.get(i);
            curr = array.get(i);
        }
        curr.next = null;
        return head;
    }
}
