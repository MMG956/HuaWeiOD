package OD真题;

/**
 * 木板
 * 小明有n块木板，第i（1<i<n）块木板的长度为ai，
 * 小明买了一块长度为m的木料，这块材料可以切割成任意块，拼接到已有的木板上，用来加长木板
 * 小明想让最短的木板尽量长，
 * 请问小明加长木板后，最短木板的长度最大可为多少？
 *
 * 输入描述
 * 输入的第一行包含两个正整数，n（11n1103），m（11m1106）-----n表示木板数，m表示木料长度
 * 输入的第二行包含n个正整数，a1，a2......an(1<=ai<=106)
 *
 * 输出描述
 * 输出的唯一一行包含一个正整数，表示加长木板后，最短木板的最大长度可以为多少？
 *
 * 示例1：
 * 输入：
 *   5 3
 *   4 5 3 5 5
 * 输出：
 *   5
 * 说明：
 * 给第一块木板长度增加1，给第三块木板长度增加2，5块木板的长度为 【5，5，5，5，5】，最短木板的长度为5
 *
 * 示例2：
 * 输入：
 *   5 2
 *   4 5 3 5 5
 * 输出：
 *   4
 *   最短木板长为4
 */
public class 木板 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int number = s.nextInt(); // 木板的数量
        int length = s.nextInt(); // 木料的长度

        // 木板的数组
        int[] muBan = new int[number];
        int k = 0;
        while (s.hasNext() && k < number){
            muBan[k] = s.nextInt();
            k++;
        }

        Arrays.sort(muBan); // 把木板的数组排序

        while (length > 0) { // 当木料长度等于 0 的时候终止循环
            for (int i = 0; i < number; i++) {
                // 如果前一根木板的长度
                if ( i + 1 < number && muBan[i]+1 <= muBan[i + 1]) {
                    muBan[i] += 1;
                    length--;
                    break;
                }
            }
        }
        System.out.println(muBan[0]);
    }

}
