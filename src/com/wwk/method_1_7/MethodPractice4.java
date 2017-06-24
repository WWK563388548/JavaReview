package com.wwk.method_1_7;

import java.util.Scanner;

/**
 * Created by wwk on 17/6/24.
 *
 * 有参有返回值的方法
 * 求n!的方法,
 * 再求1! + 2! + 3! + 4! + 5!的和
 */
public class MethodPractice4 {

    // 求阶乘的方法
    public int getFactorial(int n) {

        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }

        return result;
    }

    public static void main(String[] args) {

        // 1! + 2! + 3! + 4! + 5!的和
        int mSum = 0;
        // 输入的整数
        int mGetInput;
        // 通过方法后得出的值
        int mResultOfFactorial;
        // 输入想要求阶乘的整数
        System.out.print("输入想要求阶乘的整数: ");
        Scanner scanner = new Scanner(System.in);
        mGetInput = scanner.nextInt();
        System.out.println("输入的值为: " + mGetInput);
        // 调用方法
        MethodPractice4 methodPractice4 = new MethodPractice4();
        mResultOfFactorial = methodPractice4.getFactorial(mGetInput);
        System.out.println();
        System.out.println(mGetInput + "的阶乘为: " + mResultOfFactorial);

        // 求1! + 2! + 3! + 4! + 5!的和
        for (int i = 1; i <= 5; i++) {
            mResultOfFactorial = methodPractice4.getFactorial(i);
            mSum = mSum + mResultOfFactorial;
        }
        System.out.println("1! + 2! + 3! + 4! + 5! = " + mSum);
    }
}
