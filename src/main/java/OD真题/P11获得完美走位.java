package OD真题;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * 在第一人称射击游戏中，玩家通过键盘的A、S、W、D控制游戏人物分别向左、后、右、前进行移动
 * 从而完成走位，玩家每按动一次键盘，游戏人物向对应方向移动一步，如果玩家在操作一定次数的键盘并且各个方向
 * 的步数相同时，此时玩家必定会回到原点，则称此次走位成为完美走位
 *
 * 现给定玩家的走位（例如：ASDA）请通过更换其中一段连续走位的方式使得原走位变成一个完美走位。其中待更换的
 * 连续走位可以是相同长度的任何走位
 * 请返回待更换的连续走位的最小可能长度
 * 如果原走位本身是一个完美走位，请返回0
 *
 * 输入描述：   输入为键盘字母表示的走位
 * 输出描述：   待更换的连续走位的最小长度
 * 补充说明：   走位长度 1 <= s.length <= 10^5       s.length 是 4 的倍数        s中只含有 A\W\S\D
 *
 * 示例1：
 *  输入： ASDW
 *  输出： 0
 *
 * 示例2：
 *  输入： AASW
 *  输出： 1
 *
 *  说明：需要把一个A换成D。
 *
 * 示例3：
 *  输入： AAAA
 *  输出： 3
 *
 *  需要替换3个
 *  @since 2023-06-08
 */
public class P11获得完美走位 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String line = in.nextLine();

        int length = line.length();
        int number = length / 4; // 每个字母所需要的数量

        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < length; i++) {
            map.put(line.charAt(i), map.getOrDefault(line.charAt(i), -number) + 1);
        }

        int min = length;
        for (int i = 0; i < length; i++) {
            HashMap<Character, Integer> copy = new HashMap<>(map);
            int len = 0;
            if (copy.get(line.charAt(i)) > 0){
                for (int j = i; j < length; j++) {
                    char c = line.charAt(j);
                    copy.put(c,copy.get(c) - 1);
                    len++;
                    if (allClear(copy)) {
                        break;
                    }
                }
            }
            if (allClear(copy)){
                min = Math.min(min, len);
            }
        }

        System.out.println(min);
    }

    private static boolean allClear(HashMap<Character, Integer> copy) {
        Collection<Integer> values = copy.values();
        for (Integer value : values) {
            if (value > 0){
                return false;
            }
        }
        return true;
    }
}
