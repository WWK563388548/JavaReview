package com.wwk.method_1_7;

/**
 * Created by wwk on 17/6/25.
 *
 * 参数的传递问题:
 * 对两个变量的值进行交换并打印输出
 *
 * 方法中值的改变, 并不会对主方法中的值造成影响
 */
public class MethodPractice8 {

    public void swap(int a, int b) {

        int temp;
        System.out.println("交换前: a = " + a + ", b = " + b);
        temp = a;
        a = b;
        b = temp;
        System.out.println("交换后: a = " + a + ", b = " + b);
    }

    public void swapTest() {

        int m = 4, n = 5;
        System.out.println("交换前: m = " + m + ", n = " + n);
        swap(m, n);
        System.out.println("交换后: m = " + m + ", n = " + n);


    }
    public static void main(String[] args) {

        MethodPractice8 methodPractice8 = new MethodPractice8();
        methodPractice8.swapTest();
    }
}
