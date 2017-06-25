package com.wwk.method_1_7;

/**
 * Created by wwk on 17/6/25.
 *
 * 方法重载:
 * 定义三个方法, 实现int, double和数组类型和的问题
 */
public class MethodOverloading1 {

    // 求两个int类型数的和
    public int getValueOfPlus(int a, int b) {

        return a + b;
    }

    // 求两个double类型数的和
    public double getValueOfPlus(double a, double b) {

        return a + b;
    }

    // 求数组元素的累加和
    public int getValueOfPlus(int[] arr) {

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        return sum;
    }

    public static void main(String[] args) {

        int m = 5, n = 10;
        int[] array = {1, 2, 3, 4, 5, 6};
        MethodOverloading1 methodOverloading1 = new MethodOverloading1();
        System.out.println("int类型数的和: " + methodOverloading1.getValueOfPlus(m, n));
        System.out.println("double类型数的和: " + methodOverloading1.getValueOfPlus(5.9, 3.1));
        System.out.println("数组元素的累加和: " + methodOverloading1.getValueOfPlus(array));
    }
}
