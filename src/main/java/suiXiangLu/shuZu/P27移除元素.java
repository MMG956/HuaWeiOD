package suiXiangLu.shuZu;

import cn.adalab.leetcode.helpers.SolutionRunner;

public class P27移除元素 extends SolutionRunner {
    @Override
    public void run() {


    }

    public int removeElement(int[] nums, int val) {
        int quick = 0;
        int slow;
        for (slow = 0; quick < nums.length; quick++){
            if (nums[slow] != val){
                nums[slow] = nums[quick];
                slow++;
            }
        }
        return slow;
    }
}
