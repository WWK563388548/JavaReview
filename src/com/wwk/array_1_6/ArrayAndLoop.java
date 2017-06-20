package com.wwk.array_1_6;

import java.util.Scanner;

/**
 * Created by wwk on 17/6/20.
 * 增强型for循环: foreach循环
 * 循环终止条件: 将数组遍历一遍后终止
 * int arr = {1, 2, 3, 4, 5};
 * for(int n: arr) {
 *     System.out.println(n);
 * }
 */
public class ArrayAndLoop {

    public static void main(String[] args) {

        System.out.println("使用foreach循环输出数组内容: ");
        int[] mIntArray = new int[5];
        Scanner scanner = new Scanner(System.in);

        // 输入整数并给数组元素赋值
        for (int i = 0; i < mIntArray.length; i++) {
            System.out.println("请输入第" + (i + 1) + "个元素: ");
            mIntArray[i] = scanner.nextInt();
        }

        for (int n:mIntArray){
            System.out.print(n + "  ");
        }
    }
}
