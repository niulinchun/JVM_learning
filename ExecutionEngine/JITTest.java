import java.util.ArrayList;

/**
 * 通过JVisual VM 查看JIT编译次数
 * 在界面左侧菜单栏打开该程序，然后在右边的Visual部分下面的Graphs
 * 可以看到Compile Time 编译的次数，以及编译花费的毫秒数
 * 或者用Jconsole
 */

public class JITTest {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        //每一秒钟往集合中放一个数据
        for (int i = 0; i < 1000; i++) {
            list.add("让天下没有难学的技术！");

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
