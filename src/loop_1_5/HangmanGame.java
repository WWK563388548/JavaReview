package loop_1_5;

/**
 * Created by wwk on 17/6/17.
 *
 * 猜字游戏：
 * 猜一个介于1到10之间的数字，将猜测的数值与实际值比较，
 * 给出提示，以便更接近真实值，直到猜中为止(do-while循环)
 */

import java.util.Scanner;

/**
 * 实现逻辑：
 * 1.给定要猜测的数字
 * 2.使用循环结构
 * 3.循环进行的条件：猜测数据与实际值不相等
 * 4.循环体内容：输入实际值，并进行判断
 * 5.输出猜到的值
 */
public class HangmanGame {

    public static void main(String[] args) {
        // 设置要猜的数

        /**
         * 使用随机数生成1到10之间的数
         * 设置随机数：
         * Math.random()返回double类型,既[0,1)大于0小于1的小数
         * Math.random() * 10返回double类型, 既[0,10)大于0小于10的小数
         * Math.random() * 10 + 1返回double类型, 既[1,11)大于1小于11的小数
         * (int)(Math.random() * 10 + 1);强制转换类,返回int类型的值,既[1,11)大于1小于11的整数.
         */

        int mRealNumber = (int)(Math.random() * 10 + 1);
        int mGuess;
        System.out.println("你需要去猜一个1到10之间的数字");

        do {
            System.out.println("请输入你猜测的数字：");

            // 输入数字
            Scanner scanner = new Scanner(System.in);
            mGuess = scanner.nextInt();

            if (mGuess < mRealNumber) {
                System.out.println("猜的数字有点小。");
            } else if (mGuess > mRealNumber) {
                System.out.println("猜的数字有点大。");
            }

        } while (mGuess != mRealNumber);
        System.out.println("恭喜！你猜到了答案，它是：" + mRealNumber);
    }
}
