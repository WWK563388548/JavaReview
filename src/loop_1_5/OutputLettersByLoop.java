package loop_1_5;

/**
 * Created by wwk on 17/6/15.
 * 循环输出26个英文小写字母，分两行输出
 */
public class OutputLettersByLoop {

    public static void main(String[] args) {

        char mChar = 'a';
        int mCount = 1; // 控制换行

        while (mChar <= 'z') {
            System.out.println(mChar + " ");

            if (mCount % 13 == 0) {
                System.out.println();
            }

            mCount ++;
            mChar ++;
        }
    }
}
