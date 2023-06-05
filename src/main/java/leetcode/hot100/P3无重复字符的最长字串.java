package leetcode.hot100;
import cn.adalab.leetcode.helpers.SolutionRunner;
import java.util.HashMap;
import java.util.Map;


/**
 *    滑动窗口，双指针动
 */
public class P3无重复字符的最长字串 extends SolutionRunner {
    @Override
    public void run(){

    }

    public int lengthOfLongestSubstring(String s) {

        int length = s.length();
        int max = 0;

        Map<Character, Integer> map = new HashMap<>();

        for(int left = 0, right = 0 ; right < length; right++){
            char element = s.charAt(right);

            if (map.containsKey(element)){
                left = Math.max(map.get(element) + 1, left) ;
            }

            max = Math.max(max, right - left + 1);
            map.put(element, right);
        }

        return max;
    }
}
