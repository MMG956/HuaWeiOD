package suiXiangLu.shuZu;

import cn.adalab.leetcode.helpers.SolutionRunner;

public class P704二分查找 extends SolutionRunner {
    @Override
    public void run() {
        System.out.println(search(new int[]{1,3}, 2));
    }

    public int search(int[] nums, int target) {
        if (target < nums[0] || target > nums[nums.length - 1]){
            return -1;
        }

        int left = 0;
        int right = nums.length - 1;

        while (left <= right){
            int mid = (left + right) / 2;

            if (nums[mid] > target){
                right = mid - 1;
            }
            if (nums[mid] < target){
                left = mid + 1;
            }

            if (nums[mid] == target){
                return mid;
            }
        }
        return -1;

    }





}
