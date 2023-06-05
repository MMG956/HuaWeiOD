package suiXiangLu.shuZu;

import cn.adalab.leetcode.helpers.SolutionRunner;

import java.util.HashMap;
import java.util.Map;

public class P454 extends SolutionRunner {
    @Override
    public void run() {
        fourSumCount(new int[]{1,2}, new int[]{-2,-1}, new int[]{-1,2}, new int[]{0,2});
    }

    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        Map<Integer,Integer> map1 = new HashMap<>();


        for (int a : nums1){
            for (int b : nums2){
                map1.put(a + b, map1.getOrDefault(a+b, 0)+1);
            }
        }

        int sum = 0;
        for (int i : nums3){
            for (int j : nums4){
                if (map1.containsKey(-i-j)){
                    sum += map1.get(-i-j);
                }
            }
        }
        return sum;
    }
}
