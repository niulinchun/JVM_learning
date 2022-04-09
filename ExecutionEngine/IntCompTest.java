


/**
 * 打开Run -> Edit Configuration -> Modify options -> Add VM options
 * 设置 -Xint 为纯解释器执行  执行时间： 4956
 * 设置 -Xcomp 为纯JIT编译执行  执行时间： 519
 * 设置 -Xmixed 为解释器与JIT混合执行 执行时间： 529
 * 可以看到纯编译器执行时间明显缩短
 *  默认是混合模式 HOtspot虚拟机默认是Server模式，还有Client模式 在cmd下java -version可以看到server
 *  (JVM官网提到)64位操作系统就是server模式，因此设置了参数也会被忽略 -client  or -server
 */
public class IntCompTest {

    public static void main(String[] args) {
        long start = System.currentTimeMillis();

        testPrimeNumber(1000000);

        long end = System.currentTimeMillis();

        System.out.println("花费的时间为："+ (end-start));
    }

    private static void testPrimeNumber(int count) {
        for (int i = 0; i < count; i++) {
            label:for (int j = 2; j <= 100; j++) {
                for (int k = 2; k <= Math.sqrt(j); k++) {
                    if (j % k == 0) {
                        continue label;
                    }
                }
            }
        }
    }
}
