import sun.misc.Unsafe;

import java.lang.reflect.Field;

/**
 * Unsafe对象直接操作内存
 * 更改MaxDirectMemorySize
 */
public class MaxDirectMemorySizeTest {

    private static final long _1MB = 1024 * 1024;

    public static void main(String[] args) throws IllegalAccessException {
//        Field unsafeField = Unsafe.class.getDeclaredField()[0];
//        unsafeField.setAccessible(true);
//        Unsafe unsafe = (Unsafe) unsafeField.get(null);
//        while (true) {
//            unsafe.allocateMemory(_1MB);
//        }
    }
}
