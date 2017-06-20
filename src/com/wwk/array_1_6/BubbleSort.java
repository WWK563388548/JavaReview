package com.wwk.array_1_6;

/**
 * Created by wwk on 17/6/20.
 * 冒泡排序(Bubble Sort):
 * 对一组整数按照由小到大的顺序进行排序
 */
public class BubbleSort {

    public static void main(String[] args) {

        int temp;
        int[] mIntArray = {34, 53, 12, 32, 56, 17};
        System.out.println("排序前的数组元素为: ");
        for (int n:mIntArray) {
            System.out.print(n + "  ");
        }
        System.out.println();
        // 外部循环控制排序的次数, 比元素个数少1
        for (int i = 0; i < mIntArray.length - 1; i++) {
            // 内部循环控制每次排序的操作
            for (int j = 0; j < mIntArray.length - i - 1; j++) {
                if (mIntArray[j] > mIntArray[j + 1]) {
                    temp = mIntArray[j];
                    mIntArray[j] = mIntArray[j + 1];
                    mIntArray[j + 1] = temp;
                }
            }
        }
        System.out.println("冒泡排序后的数组元素为: ");
        for (int n:mIntArray) {
            System.out.print(n + "  ");
        }
    }
}
