package suiXiangLu.shuZu;

import cn.adalab.leetcode.helpers.SolutionRunner;

import java.util.HashMap;
import java.util.Map;

public class P1 extends SolutionRunner {
    @Override
    public void run() {

    }

    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<>();
        int[] results = new int[2];

        for (int i = 0; i < nums.length; i++) {
            int b = target - nums[i];
            if (map.containsKey(b)){
                results[0] = i;
                results[1] = map.get(b);

            }
            map.put(nums[i],i);
        }
        return results;
    }
}
