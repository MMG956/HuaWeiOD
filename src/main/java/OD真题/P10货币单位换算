package OD真题;

import java.util.Scanner;

/**
 * 记账本上记录了若干条多国货币金额，需要转换成人民币分（fen），汇总后输出
 * 每行记录一条金额，金额带有货币单位，格式为数字+单位，可能是单独元，可能是单独分，或者分元的组合
 * 需要将这些货币全部换算成人民币分（fen）后进行汇总，汇总结果仅保留整数，小数部分舍弃。
 * 元和分的换算关系是 1：100，如下：
 *  1CNY = 100fen
 *  1HKD = 100cents
 *  1JPY = 100sen
 *  1EUR = 100eurocents
 *  1GBP = 100pence
 *  汇率如下
 *          100CNY = 1825JPY = 123HKD = 14EUR = 12GBP
 *
 *  输入描述：
 *      第一行输入为 N ，N 表示记录数。 0 < N < 100
 *      之后输入N行，每一行记录一条货币，只会是一种
 *  输出描述：
 *      将每种货币转换为人民币fen汇总求和，只保留整数部分
 *      输出格式只有整数数字，不带任何小数，不带单位
 *
 *
 *  示例1：
 *     输入：
 *          1
 *          100CNY
 *     输出：
 *          10000
 *
 *  示例2：
 *      输入：
 *          1
 *          3000fen
 *      输出：
 *          3000
 *  示例3：
 *      输入：
 *          1
 *          123HKD
 *      输出：
 *          10000
 *
 *   示例4：
 *      输入：
 *          2
 *          20CNY53fen
 *          53HKD87cents
 *      输出：
 *          6432
 *
 * @since 2023-06-08
 */
public class P10货币单位换算 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int count = Integer.parseInt(in.nextLine());

        double sum = 0;
        for (int i = 0; i < count; i++) {
            String line = in.nextLine();
            // 正则表达式匹配数字
            String[] split = line.split("\\d");
            for (String type : split) {
                if (!type.isEmpty()) {
                    double one = Double.parseDouble(line.substring(0, line.indexOf(type)));
                    sum += huanSuan(type, one);
                    line = line.substring(line.indexOf(type) + type.length());
                }
            }
        }
        System.out.println((int)sum);
    }

    private static double huanSuan(String type, double one) {
        switch (type) {
            case "CNY":
                return one * 100;
            case "fen":
                return one;
            case "HKD":
                return (one / 123) * 10000;
            case "cents":
                return (one / 123) * 100;
            case "JPY":
                return (one / 1825) * 10000;
            case "sen":
                return (one / 1825) * 100;
            case "EUR":
                return (one / 14) * 10000;
            case "eurocents":
                return (one / 14) * 100;
            case "GBP":
                return (one / 12) * 10000;
            case "pence":
                return (one / 12) * 100;
        }
        return 0;
    }
}
