package com.wwk.method_1_7;

import java.util.Scanner;

/**
 * Created by wwk on 17/6/25.
 *
 * 方法重载:
 * 两个重载的方法，分别求圆和长方形的面积。
 * 圆周率可以用Math.PI表示
 * 圆的半径为4.5
 * 长方形周长分别为8和5
 *
 * 圆的面积公式(S=πr²)
 * 长方形的面积公式(S=length*width)
 */
public class MethodOverloading2 {

    // 求圆的面积的方法
    public double getArea(double radius) {

        double mArea = 0;
        mArea = Math.PI * radius * radius;
        return mArea;
    }

    // 求长方型面积的方法
    public double getArea(double length, double width) {
        double mArea = 0;
        mArea = length * width;
        return mArea;
    }

    public static void main(String[] args) {

        double mRadiusOfCircle;
        double mLengthOfRectangle;
        double mWidthOfRectangle;
        double mAreaOfCircle;
        double mAreaOfRectangle;
        Scanner scanner = new Scanner(System.in);
        MethodOverloading2 methodOverloading2 = new MethodOverloading2();

        System.out.println("请输入圆的半径,以便获取圆的面积: ");
        mRadiusOfCircle = scanner.nextDouble();
        System.out.println("请输入长方形的长度,以便获取长方形的面积: ");
        mLengthOfRectangle = scanner.nextDouble();
        System.out.println("请输入长方形的宽度,以便获取长方形的面积: ");
        mWidthOfRectangle = scanner.nextDouble();

        // 调用方法求圆的面积
        mAreaOfCircle = methodOverloading2.getArea(mRadiusOfCircle);
        System.out.println("圆的面积为: " + mAreaOfCircle);
        // 调用方法求长方形的面积
        mAreaOfRectangle = methodOverloading2.getArea(mLengthOfRectangle, mWidthOfRectangle);
        System.out.println("长方形的面积为: " + mAreaOfRectangle);

    }
}
