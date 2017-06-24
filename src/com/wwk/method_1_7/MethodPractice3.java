package com.wwk.method_1_7;

/**
 * Created by wwk on 17/6/24.
 *
 * 带参无返回值的方法
 * 求两个double类型数据最大值的方法，
 * 在方法中将最大值打印输出
 */
public class MethodPractice3 {

    // 求最大值的方法
    public void maximumValue(double a, double b) {

        double maximum;
        if (a > b) {
            maximum = a;
        } else {
            maximum = b;
        }

        System.out.println("最大值为: " + maximum);
    }

    public static void main(String[] args) {

        MethodPractice3 methodPractice3 = new MethodPractice3();
        double a = 14.2, b = 7.9;
        methodPractice3.maximumValue(a, b);
        double m = 3.2, n = 4.5;
        methodPractice3.maximumValue(m, n);
        methodPractice3.maximumValue(6.0, 2.0);
    }
}
