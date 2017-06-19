package loop_1_5;

/**
 * Created by wwk on 17/6/17.
 * 输出小于15的值(使用do－while循环)
 */
public class DoWhilePractice1 {

    public static void main(String[] args) {

        int n = 1;

        do {
            System.out.println("n = " + n);
            n++;
        }while (n < 15);
    }
}
