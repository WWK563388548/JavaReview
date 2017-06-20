package com.wwk.loop_1_5;

import java.util.Scanner;

/**
 * Created by wwk on 17/6/17.
 * 循环输入数字并输出，输入0便结束循环
 */
public class NumberInput {

    public static void main(String[] args) {

        // 从键盘接收数据
        System.out.println("请输入数字：");
        Scanner scanner = new Scanner(System.in);
        int mNumber;

        while (true){
            mNumber = scanner.nextInt();
            if (mNumber == 0){
                break;
            }
            System.out.println(mNumber);
        }

    }
}
