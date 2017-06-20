package com.wwk.array_1_6;

/**
 * Created by wwk on 17/6/20.
 * 定义一个字符数组并初始化,
 * 统计字符’a’或’A’出现的次数。
 */
public class ArrayPractice5 {

    public static void main(String[] args) {

        int mSum = 0;
        char[] mCharArray = {'A', 'B', 'F', 'a', 'T', 'b', 'e'};

        System.out.println("统计字符数组中, 字符’a’或’A’出现的次数: ");
        for (int i = 0; i < mCharArray.length; i++) {
            if (mCharArray[i] == 'A' || mCharArray[i] == 'b') {
                mSum ++;
            }
        }
        System.out.println("数组中\'A\'或\'a\'的个数为" + mSum);
        System.out.println();
        System.out.println("数组元素为: ");
        for (char n:mCharArray) {
            System.out.print(n + "   ");
        }
    }
}
