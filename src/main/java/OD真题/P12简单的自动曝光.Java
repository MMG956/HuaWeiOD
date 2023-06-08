package OD真题;

import java.util.Scanner;

/**
 * 一个图像有 n 个像素点，存储在一个长度为 n 的数组 img 里面，每个像素点的取值范围在[0, 255]的正整数
 * 请你给图像每个像素点值加上一个整数 k （可以是负数），得到新图 newlmg ,使得新图 newlmg 的所有像素 平均值最接近中位数 128
 * 请输出这个整数 k
 *
 * 输入描述：
 *  n个整数，中间用空格隔开
 *  例如：     0 0 0 0
 * 输出描述：
 *  一个整数 k
 *
 *  1 <= n <= 100       若有多个 k 满足，则输出最小的那个 k 。  新图的像素值会自动截取到 [0,255].当新像素值 <0, 值会改为0， 若大于 255，会改为 255
 *
 *  示例1：
 *      输入：
 *          0 0 0 0
 *      输出：
 *          128
 *
 *  示例2：
 *      输入：
 *          129 130 129 130
 *      输出：
 *          -2
 *
 * @since 2023-06-08
 */
public class P12简单的自动曝光 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String[] line = in.nextLine().split(" ");
        int[] ints = new int[line.length];

        int sum = 0;
        for (int i = 0; i < line.length; i++) {
            ints[i] = Integer.parseInt(line[i]);
            sum += ints[i];
        }

        double chaZhi = Math.abs(sum / (double)line.length - 128);
        int relChaZhi = (int)chaZhi;
        if (chaZhi >= (double) (relChaZhi) + 0.5) {
            relChaZhi = relChaZhi + 1;
        }

        System.out.println(relChaZhi);

    }
}
