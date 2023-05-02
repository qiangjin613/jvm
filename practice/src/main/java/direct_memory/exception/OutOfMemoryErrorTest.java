package direct_memory.exception;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 直接内存 OOM 测试
 * <p>
 * -XX:+PrintGC -XX:MaxDirectMemorySize=5G
 */
public class OutOfMemoryErrorTest {
    public static void main(String[] args) throws InterruptedException {
        new Scanner(System.in).next();
        System.out.println("开始申请直接内存");

        List<ByteBuffer> directBuffers = new ArrayList<ByteBuffer>();
        while (true) {
            Thread.sleep(1000);
            directBuffers.add(ByteBuffer.allocateDirect(1024 * 1024 * 1024));
        }
    }
}
