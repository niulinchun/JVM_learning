import java.nio.ByteBuffer;
import java.util.Scanner;

/**
 * IO                   NIO (New IO / Non-Blocking IO)
 * byte[] / char[]      Buffer
 * stream               Channel
 *
 * 查看直接内存的分配和释放
 * 访问直接内存效率要比访问堆效率高， 即读写性能更高
 */
public class BufferTest {

    private static final int BUFFER = 1024 * 1024 * 1024; //1GB

    public static void main(String[] args) {
        // 该方法内存调用了new DirectBuffer 可以通过以下交互在任务管理器中看具体占用的大小
        ByteBuffer byteBuffer = ByteBuffer.allocateDirect(BUFFER);
        System.out.println("直接内存分配完毕，请求指示!");

        Scanner scanner = new Scanner(System.in);
        scanner.next();

        System.out.println("直接内存开始释放");
        byteBuffer = null;
        System.gc();
        scanner.next();
    }
}
