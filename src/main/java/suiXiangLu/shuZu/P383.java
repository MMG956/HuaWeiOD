package suiXiangLu.shuZu;

import cn.adalab.leetcode.helpers.SolutionRunner;

import java.util.HashMap;
import java.util.Map;

public class P383 extends SolutionRunner {
    @Override
    public void run() {
    }

    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> map = new HashMap<>();

        for (Character c: magazine.toCharArray()){
            map.put(c, map.getOrDefault(c, 0)+1);
        }

        for (Character c : ransomNote.toCharArray()){
            if (map.containsKey(c)){
                map.put(c, map.get(c) - 1);
                if (map.get(c) == 0){
                    map.remove(c);
                }
            }else {
                return false;
            }
        }

        if (map.size() == 0){
            return true;
        }
        return false;
    }
}
