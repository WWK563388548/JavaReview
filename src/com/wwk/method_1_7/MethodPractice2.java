package com.wwk.method_1_7;

/**
 * Created by wwk on 17/6/24.
 *
 * 无参数有返回值的方法
 * 求长方形的面积
 */
public class MethodPractice2 {

    public int areaOfRectangle() {

        int length = 10;
        int width = 5;
        int getArea = length * width;

        return getArea;
    }

    public static void main(String[] args) {

        MethodPractice2 methodPractice2 = new MethodPractice2();
        System.out.println("长方形的面积为: " + methodPractice2.areaOfRectangle());
    }
}
