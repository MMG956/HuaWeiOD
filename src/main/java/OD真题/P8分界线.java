package OD真题;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 第一行输入 1~N 个字符串，用空格分开
 * 第二行输入 1~N 个字符串，用空格分开
 * 第二行的字符串需要全匹配第一行中的字符串（顺序可以打乱），字符串只能匹配一次
 * 如果能匹配则返回true，否则返回false
 *
 * 示例1：
 *  输入：
 *      ab cd
 *      ab
 *  输出：
 *      true
 *
 * 示例2：
 *  输入：
 *      ab ef
 *      aef
 *  输出：
 *      false
 *
 * 示例3：
 *  输入：
 *      ab bcd ef
 *      cbd fe
 *  输出：
 *      true
 *
 * 示例4：
 *  输入：
 *      ab bcd ef
 *      cd ef
 *  输出：
 *      false
 *
 * @since 2023-06-07
 */
public class P8分界线  {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String[] str1 = in.nextLine().split(" ");
        String[] str2 = in.nextLine().split(" ");

        for (int i = 0; i < str2.length; i++) {
            char[] chars = str2[i].toCharArray();
            Arrays.sort(chars);

            Boolean is = false;
            for (int j = 0; j < str1.length; j++) {
                char[] chars1 = str1[j].toCharArray();
                Arrays.sort(chars1);

                if (Arrays.equals(chars, chars1)){
                    is = true;
                    break;
                }
            }
            if (!is){
                System.out.println(false);
                System.exit(0);
            }
        }
        System.out.println(true);
    }
}
