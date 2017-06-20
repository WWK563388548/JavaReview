package com.wwk.array_1_6;

/**
 * Created by wwk on 17/6/20.
 * 数组拥有默认值
 */
public class ArrayPractice1 {

    public static void main(String[] args) {

        // 声明数组
        int[] mIntArray;
        String[] mStrArray;
        mIntArray = new int[5];
        mStrArray = new String[10];

        // 声明数组的同时进行创建
        double[] mDoubleArray = new double[5];
        // 初始化数组
        char[] mcharArray = {'a', 'b', 'c', 'd'};

        System.out.println("mIntArray的第二个元素为: " + mIntArray[1]);
        System.out.println("mStrArray的第五个元素为: " + mStrArray[4]);
        System.out.println("mDoubleArray的最后一个元素为: " + mDoubleArray[mDoubleArray.length - 1]);
        System.out.println("mcharArray数组的长度 ＝ " + mcharArray.length);

        // 循环为整形数组赋值
        for (int i = 0; i < 5; i++) {
            mIntArray[i] = i + 1;
        }
        // 循环输出整形数组中的值
        /**
         *
         * 小心数组下标越界: java.lang.ArrayIndexOutOfBoundsException
         * for (int i = 0; i <= 5; i++) {
         *     System.out.print(mIntArray[i] + " ");
         * }
         *
         */
        System.out.println("整形数组mIntArray的元素为: ");
        for (int i = 0; i < 5; i++) {
            System.out.print(mIntArray[i] + " ");
        }
    }
}
