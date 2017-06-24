package com.wwk.method_1_7;

/**
 * Created by wwk on 17/6/23.
 *
 * 无参数无返回值的方法
 * 一行打印输出一串星号
 */
public class MethodPractice1 {

    // 打印星号的方法
    public void printStar() {
        System.out.println("**************************");
    }

    public static void main(String[] args) {

        System.out.println("**************************");
        System.out.println("欢迎进入java的世界!");
        System.out.println("**************************");
        System.out.println();

        // 调用方法
        // 创建一个MethodPractice1的对象methodPractice1
        MethodPractice1 methodPractice1 = new MethodPractice1();
        // 使用对象名.方法名()去调用方法
        methodPractice1.printStar();
        System.out.println("欢迎再次进入java的世界!");
        methodPractice1.printStar();
    }
}
