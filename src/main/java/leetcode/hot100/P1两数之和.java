package leetcode.hot100;

import cn.adalab.leetcode.helpers.SolutionRunner;

import java.util.HashMap;
import java.util.Map;

public class P1两数之和 extends SolutionRunner {
    @Override
    public void run(){

    }

    public int[] twoSum(int[] nums, int target) {

        int [] res = new int[2];

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int temp = target - nums[i];
            if (map.containsKey(temp)){
                res[0] = map.get(temp);
                res[1] = i;
            }
            map.put(nums[i],i);
        }

        return res;
    }
}
