package com.wwk.method_1_7;

import java.util.Scanner;

/**
 * Created by wwk on 17/6/24.
 *
 * 查找数组元素的值
 * 参数为: 数组, 要查找的元素共两个参数
 */
public class MethodPractice7 {

    public boolean searchValue(int n, int[] arr) {

        // 默认没找到
        boolean flag = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == n) {
                // 找到要查找的值
                flag = true;
                break;
            }
        }
        return flag;
    }

    public static void main(String[] args) {

        int[] array1 = {40, 32, 60, 70, 11, 5};
        int mGetInput;
        boolean mFlag;

        MethodPractice7 methodPractice7 = new MethodPractice7();
        Scanner scanner = new Scanner(System.in);

        System.out.println("请输入要查找的数: ");
        mGetInput = scanner.nextInt();
        mFlag = methodPractice7.searchValue(mGetInput, array1);
        if (mFlag) {
            System.out.println();
            System.out.println("找到了");
        } else {
            System.out.println();
            System.out.println("没找到");
        }

    }
}
