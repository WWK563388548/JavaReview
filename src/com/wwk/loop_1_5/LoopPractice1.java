package com.wwk.loop_1_5;

/**
 * Created by wwk on 17/6/17.
 * 求出200到300之间的数，且满足条件：它们三个数字之积为42，三个数字之和为12。
 */
public class LoopPractice1 {

    public static void main(String[] args){

        int mGeWei;
        int mShiWei;
        int mBaiWei;
        int mProduct;
        int mSum;

        for (int n = 200; n <= 300; n++) {
            mGeWei = n % 10;
            mShiWei = n / 10 % 10;
            mBaiWei = n / 100 % 10;
            mProduct = mGeWei * mBaiWei * mShiWei;
            mSum = mBaiWei + mGeWei + mShiWei;

            if (mProduct == 42 & mSum == 12) {
                System.out.println(n);
            }
        }
    }
}
