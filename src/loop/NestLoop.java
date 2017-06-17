package loop;

/**
 * Created by wwk on 17/6/17.
 * 使用嵌套while循环输出10行10列的星号
 */
public class NestLoop {

    public static void main(String[] args) {

        // 外部循环变量
        int mExternal = 1;
        // 内部循环变量
        int mInternal = 1;

        System.out.println("输出10行10列的星号：");
        // 外部循环控制输出几行
        while (mExternal <= 10) {
            mInternal = 1;
            // 内部循环控制每行输出几个星号
            while (mInternal <= mExternal) { // mInternal <= mExternal时，输出三角形，mInternal <= 10时，输出三角形
                System.out.print("*");
                mInternal++;
            }
            System.out.println();
            mExternal++;
        }
    }
}
