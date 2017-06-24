package com.wwk.method_1_7;

/**
 * Created by wwk on 17/6/24.
 *
 * 求数组元素的平均值
 */
public class MethodPractice6 {

    // 求数组元素的平均值的方法
    public void averageArray(double[] arr) {

        double mSum = 0;
        for (double n : arr) {
            mSum += n;
        }
        System.out.println("数组的平均值为: " + mSum / arr.length);
    }

    public static void main(String[] args) {

        double[] arrayOfDouble = {78.5, 98.5, 65.5, 32.5, 75.5};
        // 调用方法
        MethodPractice6 methodPractice6 = new MethodPractice6();
        methodPractice6.averageArray(arrayOfDouble);
    }
}
