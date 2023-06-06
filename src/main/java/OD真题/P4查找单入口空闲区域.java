package OD真题;

import java.util.Scanner;

/**
 * 给定一个 M * N 的矩阵，由若干字符 “X” 和 “O”(o) 组成, “X”表示该处已被占用， “O” 表示该处空闲，
 * 请找到最大的单入口空闲区域
 *
 * 空闲区域是由连通的 “O” 组成的区域，位于边界的 “O” 可以构成入口，但入口空闲区域即有且只有一个位于边界
 * 的 “O” 作为入口的由 “O” 组成的区域
 * 如果两元素在垂直或水平方向相邻，则称他们联通的。
 * 若有多个符合要求的最大区域，只输出一个数字，代表区域大小 。没有输出NULL
 *
 * 示例1：                                  示例2：
 * 输入：
 *      4 4                                 4 5
 *      X X X X                             X X X X X
 *      X O O X                             O O O O X
 *      X O O X                             X O O O X
 *      X O X X                             X O X X O
 * 输出：
 *      3 1 5                               3 4 1       入口行 3， 列4， 大小 1
 * 说明：存在最大，入口行坐标为 3 ， 列坐标为 1 ，区域大小为 5
 *
 *示例3：
 *  输入：
 *  5 4                                     5 4
 *  X X X X                                 X X X X
 *  X O O O                                 X O O O
 *  X O O O                                 X X X X
 *  X O O X                                 X O O O
 *  X X X X                                 X X X X
 *
 *  输出：                                     3
 *      NULL
 * @since 2023-06-06
 */
public class P4查找单入口空闲区域 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int hang = s.nextInt();
        int lie = s.nextInt();
        s.nextLine(); // 回车
        int i = 0;
        String[][] arr = new String[hang][lie];

        while (i < hang) {
            arr[i] = s.nextLine().split(" ");
            i++;
        }


        System.out.println(arr);
    }
}
