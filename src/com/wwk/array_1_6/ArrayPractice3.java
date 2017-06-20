package com.wwk.array_1_6;

import java.util.Scanner;

/**
 * Created by wwk on 17/6/20.
 *
 * 求数组中能被3整除的元素并打印输出
 * 两种方法: 1.用户输入想查询的数字
 *          2.初始化好数组的数值
 */
public class ArrayPractice3 {

    public static void main(String[] args) {

        int[] mIntArray = new int[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        // Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < mIntArray.length; i++) {
            // System.out.println("请输入整数: ");
            // mIntArray[i] = scanner.nextInt();

            if (mIntArray[i] % 3 == 0) {
                System.out.println("能被3整除的元素为: " + mIntArray[i]);
            } else {
                System.out.println(mIntArray[i] + "是不能被3整除的元素");
            }
        }
    }
}
