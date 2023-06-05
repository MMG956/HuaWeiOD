package suiXiangLu.shuZu;

import cn.adalab.leetcode.helpers.SolutionRunner;

import java.util.*;


/**
 * 两个数的交集
 */
public class P349 extends SolutionRunner {
    @Override
    public void run() {
        intersection(new int[]{1,2,2,1}, new int[]{2,2});
    }

    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        List<Integer> result = new ArrayList<>();

        for (int num : nums1){
            set.add(num);
        }

        for (int num : nums2){
            if (set.contains(num)){
                result.add(num);
                set.remove(num);
            }
        }

        int[] ints = new int[result.size()];

        for (int i = 0; i < result.size(); i++) {
            ints[i] = result.get(i);
        }

        return ints;

    }

    /**
     * 350 两个数的交集2
     * @param nums1
     * @param nums2
     * @return
     */
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map = new HashMap<>();
        HashMap<Integer, Integer> map2 = new HashMap<>();

        for (int nums : nums1){
            if (map.containsKey(nums)){
                map.put(nums, map.get(nums) + 1);
            }else {
                map.put(nums, 1);
            }
        }

        for (int nums : nums2){
            if (map.containsKey(nums)){
                if (map2.containsKey(nums)){
                    map2.put(nums, map2.get(nums) + 1);
                }else {
                    map2.put(nums, 1);
                }
            }
        }

        Set<Integer> set = map2.keySet();

        //谁小用谁
        List<Integer> list = new ArrayList<>();

        for (int a : set){
            if (map.get(a) <= map2.get(a)){
                for (int i = 0; i < map.get(a); i++) {
                    list.add(a);
                }
            }else {
                for (int i = 0; i < map2.get(a); i++) {
                    list.add(a);
                }
            }
        }

        int [] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }

        return result;
    }
}
