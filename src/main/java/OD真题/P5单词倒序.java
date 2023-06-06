package OD真题;

import java.util.Scanner;

/**
 * 输入单行英文句子，里面包含英文字母，空格以及,.?三种，请将句子中每个单词进行倒序，并输出倒序后的语句
 * 标点符号左右空格 >= 0, 单词间空格 > 0
 *
 * 示例1：
 *      输入： yM eman si boB.
 *      输出： My name is Bob.
 *
 * 示例2：
 *      输入： woh era uoy ? I ma enif.
 *      输出： how are you ? I ma fine.
 *
 * @since 2023-06-06
 */
public class P5单词倒序 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String str = s.nextLine();
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            if (c == ' ' || c == '?' || c == ',') {

            }

        }
    }
}
