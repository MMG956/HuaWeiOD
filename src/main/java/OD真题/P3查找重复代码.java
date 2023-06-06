package OD真题;

import java.util.Scanner;

/**
 * 查找重复代码
 * 重复代码查找方案：以字符串形式给定两串代码（字符串长度 1 < length <= 100，由英文字母、数字和空格组成）
 * 找出两行代码中的 最长公共子串
 * 如果不存在公共子串，请返回空字符串
 *
 * 示例1
 *  输入：
 *  hello123world
 *  hello123abc4
 *  输出：
 *  hello123
 *
 *  示例2：
 *   输入：
 *   private_void_method
 *   public_void_method
 *   输出：
 *   _void_method
 *
 *  示例3：
 *    输入：
 *    hiworld
 *    hiweb
 *    输出:
 *    hiw
 *
 * @since 2023-06-06
 */
public class P3查找重复代码 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String text1 = s.nextLine();
        String text2 = s.nextLine();

        if (text1.length() >= text2.length()) {
            System.out.println( sub(text1, text2));
        }else {
            System.out.println(sub(text2, text1));
        }
    }

    public static String sub(String longString, String shortString) {
        String result = "";
        int start = 0;
        int end = 1;

        while (end <= shortString.length()) {
            String a = shortString.substring(start, end);
            if (longString.contains(a)) {
                result = a;
            }else {
                start++;
            }
            end++;
        }
        return result;
    }

}
