package loop_1_5;

/**
 * Created by wwk on 17/6/15.
 * 求1到5的平方和
 */
public class SumOfSquares {

    public static void main(String[] args) {

        int mNumber = 1;
        int mSum = 0;

        while (mNumber <= 5) {

            mSum = mSum + mNumber * mNumber;
            mNumber ++;
        }

        System.out.println("1到5的平方和为: " + mSum);
    }
}
