package suiXiangLu.shuZu;

import cn.adalab.leetcode.helpers.SolutionRunner;

public class P209 extends SolutionRunner {
    @Override
    public void run() {
        int result = minSubArrayLen(7, new int[]{2,3,1,2,4,3});
        System.out.println(result);
    }

    public int minSubArrayLen(int target, int[] nums) {

        if (nums.length < 1){
            return 0;
        }

        int result = 0;
        int sum = 0;

        int left = 0;
        int right;

        for (right = left; right < nums.length ;right++){
            sum += nums[right];
            if (sum >= target){
                if (result == 0){
                    result = right - left + 1;
                }else if ((right - left + 1) < result) {
                    result = right - left + 1;
                }

                if (left < nums.length){
                    sum = sum - nums[left] - nums[right];
                    left ++;
                    right = right - 1 ;
                }

            }
        }
        return result;
    }
}
