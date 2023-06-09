package OD真题;

import java.util.Scanner;

/**
 * 第一个字符串：R
 * 第二个字符串：BR
 * 第三个字符串：RBBR
 * 第四个字符串：BRRBRBBR
 * 第五个字符串：RBBRBRRBBRRBRBBR
 * 规律就是： 第i个字符串 = 第 i-1 个字符串的取反 + 第 i-1 个字符串； （取反 R -> B, B -> R）
 * 现在告诉你 n 和 k，让你求得第 n 个字符串的第 k 个字符是多少 （ k 的编号从0开始）
 *
 * 输入描述：
 *  第一行输入一个T，表示有T组用例
 *  接下来输入T行，每行输入两个数字，表示 n和 k
 *  1 <= T <= 100;     1 <= n <= 64;      1 <= k <= 2^(n-1)
 *
 * 输出描述
 *  输出T行表示答案
 *  输出“blue” 表示字符是B
 *  输出“red” 表示字符是R
 *
 *  示例1：
 *  输入：
 *      5
 *      1 0
 *      2 1
 *      3 2
 *      4 6
 *      5 8
 *  输出：
 *      red
 *      blue
 *      blue
 *      blue
 *      blue
 *
 *  示例2：
 *  输入：
 *      1
 *      64 73709551616
 *  输出：
 *      red
 * @since 2023-06-07
 */
public class P7对称字符串 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int count = in.nextInt();
        int n;
        double k;
        double length;

        for (int i = 0; i < count; i++) {
            n = in.nextInt();
            k = in.nextDouble();

            length = Math.pow(2, n-1);

            int number = fanZhuanCiShu(k,length,0);
            System.out.println(fanZhuan(number));

        }

        // 每一行的字母数量为 2^(n-1).  如果k 在 前一半就要反转一次  在后一半 不用反转， 直到为 1.

    }

    public static int fanZhuanCiShu(double k, double length, int count) {
        if (length == 1) {
            return count;
        }
        if (k > length / 2) {
            k = k - length / 2;
            length = length / 2;
        }
        if (k <= length / 2) {
            count++;
            length = length / 2;
        }
        return fanZhuanCiShu(k, length, count);
    }

    public static String fanZhuan(int count) {
        if ((count % 2) == 0) {
            return "red";
        }else {
            return "blue";
        }
    }
}

