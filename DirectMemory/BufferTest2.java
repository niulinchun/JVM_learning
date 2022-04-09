import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;

/**
 * 可以用java VisualVM查看内存情况 或者JProfiler
 * 本地内存的OOM ：OutOfMemory: Direct buffer memory
 *
 * 当出现直接内存OOM时，我们导出其dump文件，但是dump文件看不出异常，因为直接内存不受JVM管理
 *
 * 缺点：
 *      分配回收成本较高
 *      不受JVM内存回收管理
 * 直接内存大小可以通过MaxDirectMemorySize设置
 * 如果不指定，默认与堆的最大值-Xmx参数值一致
 *
 */

public class BufferTest2 {
    private static final int BUFFER = 1024 * 1024 * 20; // 20MB

    public static void main(String[] args) {
        ArrayList<ByteBuffer> list = new ArrayList<>();
        int count = 0;
        try {
            while (true) {
                ByteBuffer byteBuffer = ByteBuffer.allocateDirect(BUFFER);
                list.add(byteBuffer);
                count++;
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        } finally {
            System.out.println(count);
        }
    }

}
