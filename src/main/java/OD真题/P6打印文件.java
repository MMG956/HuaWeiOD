package OD真题;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * 有5台打印机打印文件，每台打印机有自己的打印队列，因为打印有轻重缓急之分，所以队列中的文件有1~10的优先级，
 * 数字越大优先级越高，打印机会从自己的队列中选择优先级高的文件来打印。如果存在优先级一样的文件，则选择最早进入队列的那个文件
 *
 * 输入描述：
 *          第一行为发生事件的数量
 *          “IN P NUM” 为 将优先级为 NUM 的文件放入 P 号打印机
 *          “OUT P” 表示 P 打印机进行一次文件打印，并将文件取出
 *
 * 输出描述：
 *          每次 OUT P 事件发生时，都会输出文件标号，如果此时没有文件可以打印，就输出 “NULL”, 编号为 IN P NUM 事件发生的第 X 次。编号从1开始
 *
 * 示例1：
 *       输入：
 *              7
 *              IN 1 1
 *              IN 1 2
 *              IN 1 3
 *              IN 2 1
 *              OUT 1
 *              OUT 2
 *              OUT 2
 *       输出：  3
 *              4
 *              NULL
 *              
 * 示例2：
 *      5
 * IN 1 1
 * IN 1 3
 * IN 1 1
 * IN 1 3
 * OUT 1
 *
 * @since 2023-06-06
 */
public class P6打印文件 {
    public static void main(String[] args) {

        // key 为第几台打印机  value为文件队列
        Map<String, List<MyFile>> map = new HashMap<>();

        Scanner s = new Scanner(System.in);
        int n = Integer.parseInt(s.nextLine());

        for (int i = 0; i < n; i++) {
            String[] str = s.nextLine().split(" ");

            if (str[0].equals("IN")) {
                if (map.containsKey(str[1])) {
                    map.get(str[1]).add(new MyFile(Integer.parseInt(str[2]), i + 1));
                }else {
                    List<MyFile> list = new ArrayList<>();
                    list.add(new MyFile(Integer.parseInt(str[2]), i + 1));
                    map.put(str[1], list);
                }
            }else if (str[0].equals("OUT")) {
                if (map.containsKey(str[1])) {
                    List<MyFile> list = map.get(str[1]);
                    if (list != null && list.size() > 0) {
                        // 对list 根据 优先级 排序
                        list = list.stream().sorted(Comparator.comparing(MyFile::getYouXianJi).reversed().thenComparing(MyFile::getBianHao)).collect(Collectors.toList());
                        System.out.println(list.get(0).getBianHao());
                        list.remove(list.get(0));
                        map.put(str[1], list);
                    }else {
                        System.out.println("NULL");
                    }

                }else {
                    System.out.println("NULL");
                }
            }
        }

    }
}

class MyFile {
    private int youXianJi;
    private int bianHao;

    public MyFile(int youXianJi, int bianHao){
        this.youXianJi = youXianJi;
        this.bianHao = bianHao;
    }

    public int getYouXianJi() {
        return youXianJi;
    }

    public void setYouXianJi(int youXianJi) {
        this.youXianJi = youXianJi;
    }

    public int getBianHao() {
        return bianHao;
    }

    public void setBianHao(int bianHao) {
        this.bianHao = bianHao;
    }
}
