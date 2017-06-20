package com.wwk.array_1_6;

import java.util.Scanner;

/**
 * Created by wwk on 17/6/20.
 * 求整形数组的累加和
 */
public class ArrayPractice2 {

    public static void main(String[] args) {

        int mSum = 0;
        int[] mIntArray = new int[5];
        Scanner scanner = new Scanner(System.in);
        // 从键盘接收数据，为数组元素赋值
        for (int i = 0; i < mIntArray.length; i++) {
            System.out.println("请输入第" + (i + 1) + "个元素: ");
            mIntArray[i] = scanner.nextInt();
        }

        // 展示赋完值之后的数组内容
        System.out.println("数组元素的内容为: ");
        for (int i = 0; i < mIntArray.length; i++ ) {
            System.out.print(mIntArray[i] + "   ");
        }

        // 求整形数组的累加和
        for (int i = 0; i < mIntArray.length; i++) {
            mSum = mSum + mIntArray[i];
        }
        System.out.println();
        System.out.println("整形数组的累加和为: " + mSum);
    }
}
