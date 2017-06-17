package loop;

/**
 * Created by wwk on 17/6/17.
 * 求阶乘的累加和(循环嵌套):
 * 求1! + 2! + 3! + .... + 10!
 */
public class SumOfFactorialNestLoop {

    public static void main(String[] args) {

        // 存放乘积
        int mProduct = 1;
        // 存放累加和
        int mSum = 0;

        for (int i = 1; i <= 10; i++) {

            mProduct = 1;
            for (int j = 1; j <= i; j++) {
                // mProduct存放阶乘结果
                mProduct = mProduct * j;
            }
            mSum = mSum + mProduct;
        }
        System.out.println("1! + 2! + 3! +...+ 10! = " + mSum);
    }
}
