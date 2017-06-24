package com.wwk.method_1_7;

import java.util.Scanner;

/**
 * Created by wwk on 17/6/24.
 *
 * 定义一个方法，根据商品总价，计算出对应的折扣并输出。
 * 总价<100，不打折,
 * 总价在100到199之间，打9.5折,
 * 总价在200以上，打8.5折。
 */
public class MethodOfShopping {

    public double discountOfSale(double mPrice) {

        double result;
        if (mPrice >= 200) {
            result = mPrice * 0.85;
        } else if (mPrice < 200 && mPrice >= 100) {
            result = mPrice * 0.95;
        } else {
            result = mPrice;
        }

        return result;
    }

    public static void main(String[] args) {

        double thePrice;
        double resultOfDiscount;
        // 输入商品价格
        System.out.println("请输入商品价格: ");
        Scanner scanner = new Scanner(System.in);
        thePrice = scanner.nextDouble();

        // 调用方法
        MethodOfShopping methodOfShopping = new MethodOfShopping();
        resultOfDiscount = methodOfShopping.discountOfSale(thePrice);
        System.out.println("折扣后的价格为: " + resultOfDiscount);
    }
}
