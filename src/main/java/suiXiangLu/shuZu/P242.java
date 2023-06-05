package suiXiangLu.shuZu;

import cn.adalab.leetcode.helpers.SolutionRunner;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class P242 extends SolutionRunner {
    @Override
    public void run() {

    }

    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()){
            return false;
        }

        int [] tables = new int[26];

        for (int i = 0; i < s.length(); i++) {
            tables[s.charAt(i) - 'a']++;
            tables[t.charAt(i) - 'a']--;
        }

        for (int i = 0; i < 26; i++) {
            if (tables[i] != 0){
                return false;
            }
        }
        return true;
    }
}
