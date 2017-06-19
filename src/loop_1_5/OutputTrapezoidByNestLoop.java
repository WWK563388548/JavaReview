package loop_1_5;

import java.util.Scanner;

/**
 * Created by wwk on 17/6/17.
 * 用星号输出一个梯形（使用嵌套for循环完成）
 */
public class OutputTrapezoidByNestLoop {

    public static void main(String[] args) {

        // 输入想要打印的行数
        System.out.println("请输入想要输出的行数：");
        Scanner scanner = new Scanner(System.in);
        int mRow = scanner.nextInt();
        // int mRow = 5;
        // 每行的星数
        int j;

        for (int i = 1; i <= mRow; i++) {

            j = 0;
            for (j = 0; j < 21; j++) {
                if (j < (mRow - i)) {
                    System.out.print(" ");
                } else if (j < (mRow + i + 1)) {
                    System.out.print(" * ");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
}
