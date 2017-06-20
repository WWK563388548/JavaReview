package com.wwk.array_1_6;

/**
 * Created by wwk on 17/6/20.
 * 求数组元素的最大值与最小值
 */
public class ArrayPractice4 {

    public static void main(String[] args) {

        int[] mIntArray = {34, 55, 78, 95, 21, 43, 1, 67};
        int max = mIntArray[0];
        int min = mIntArray[0];
        for (int i = 0; i < mIntArray.length; i++) {
            if (max < mIntArray[i]) {
                max = mIntArray[i];
            }
            if (min > mIntArray[i]) {
                min = mIntArray[i];
            }
        }
        System.out.println("数组元素的最大值为: " + max);
        System.out.println("数组元素的最小值为: " + min);
    }
}
