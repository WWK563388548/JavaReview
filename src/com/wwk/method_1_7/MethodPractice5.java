package com.wwk.method_1_7;

/**
 * Created by wwk on 17/6/24.
 *
 * 数组作为方法参数
 * 打印输出数组元素的值
 */
public class MethodPractice5 {

    public void printArray(int[] arr) {

        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        int[] array = {10, 20, 35, 40, 55};
        MethodPractice5 methodPractice5 = new MethodPractice5();
        methodPractice5.printArray(array);
    }
}
