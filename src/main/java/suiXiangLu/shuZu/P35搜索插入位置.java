package suiXiangLu.shuZu;

import cn.adalab.leetcode.helpers.SolutionRunner;

public class P35搜索插入位置 extends SolutionRunner {
    @Override
    public void run() {
        System.out.println(searchInsert(new int[]{1,3, 5, 6}, 7));
    }

    public int searchInsert(int[] nums, int target) {

        if (nums.length < 1){
            return 0;
        }

        int left = 0;
        int right = nums.length -1;

        return erFen(left, right, nums, target);

    }

    private int erFen(int left, int right, int[] nums, int target) {

        if ((left == right) || ((right - left) == 1)){
            if (nums[left] < target){
                return left + 1;
            }else if (nums[left] > target){
                if ((left - 1) < 0){
                    return 0;
                }else {
                    return left - 1;
                }
            }else {
                return left;
            }
        }


        int mid = (left + right) / 2;

        if (nums[mid] > target){
            right = mid - 1;
            return erFen(left, right, nums, target);
        }
        if (nums[mid] < target){
            left = mid + 1;
            return erFen(left, right, nums, target);
        }

        return mid;

    }
}
