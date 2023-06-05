package cn.adalab.leetcode.starter.nowcoder;

import cn.adalab.leetcode.helpers.SolutionRunner;
import cn.adalab.leetcode.helpers.ds.ListNode;

public class ReverseRange extends SolutionRunner {
    @Override
    public void run() {
        System.out.println(reverseBetween(toLinkedList("[3,5]"),1,2));
    }

    public ListNode reverseBetween (ListNode head, int m, int n) {
        ListNode res = head;
        ListNode cur = head;
        ListNode pre = null;
        ListNode recurHead = head;
        ListNode beforeM = null;
        ListNode afterN= null;
        int count = 1;
        while (count <= n){
            if (count==m){
                beforeM = pre;
                recurHead = cur;
            }
            count++;
            pre = cur;
            cur = cur.next;
        }

        pre.next = null;
        afterN = cur;
        if (beforeM!=null){
            beforeM.next = recur(recurHead, null);
        }else {
            res = recur(recurHead, null);
        }
        ListNode temp = res;
        while (temp.next!=null){
            temp = temp.next;
        }
        temp.next = afterN;

        return res;
        // write code here
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
