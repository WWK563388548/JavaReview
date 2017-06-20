package com.wwk.loop_1_5;

/**
 * Created by wwk on 17/6/17.
 * 使用for循环来求1到5的累加和
 */
public class ForPractice1 {

    public static void main(String[] args) {

        int mSum = 0;
        for (int n = 1; n <= 5; n++) {
            mSum = mSum + n;
        }
        System.out.println("1到5的累加和为：" + mSum);
    }
}
