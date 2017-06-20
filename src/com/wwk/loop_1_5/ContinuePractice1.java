package com.wwk.loop_1_5;

/**
 * Created by wwk on 17/6/18.
 * Continue语句：1 + 3 + 5 + 7 + 9的和
 */
public class ContinuePractice1 {

    public static void main(String[] args) {

        int mSum = 0;
        for (int i = 1; i <= 9; i++) {
            if (i % 2 == 0) {
                continue; // i为偶数时直接开始下次循环
            }
            mSum = mSum + i;
        }
        System.out.println("Sum = " + mSum);
    }
}
