package leetcode.hot100;

import cn.adalab.leetcode.helpers.SolutionRunner;
import cn.adalab.leetcode.helpers.ds.ListNode;

public class P2两数相加 extends SolutionRunner {
    @Override
    public void run(){

    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode newFirst = new ListNode(0);
        int carry = 0;
        ListNode cur = newFirst;

        while (l1 != null || l2 != null){
            int x = l1 == null ? 0 : l1.val;
            int y = l2 == null ? 0 : l2.val;

            int sum = x + y + carry;
            carry = sum / 10;
            sum = sum % 10;
            cur.next = new ListNode(sum);
            cur = cur.next;

            if (l1 != null){
                l1 = l1.next;
            }

            if (l2 != null){
                l2 = l2.next;
            }
        }

        if (carry == 1){
            cur.next = new ListNode(carry);
        }

        return newFirst.next;
    }
}
