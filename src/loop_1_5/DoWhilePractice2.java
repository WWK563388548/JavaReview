package loop_1_5;

/**
 * Created by wwk on 17/6/17.
 * 求1到5的累加和(do-while循环)
 */
public class DoWhilePractice2 {

    public static void main(String[] args) {

        int mNumber = 1;
        int mSum = 0;

        do {
            mSum = mSum + mNumber;
            mNumber++;
        } while (mNumber <= 5);

        System.out.println("1到5的累加和为：" + mSum);
    }
}
