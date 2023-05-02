package direct_memory;

import java.nio.ByteBuffer;
import java.util.Scanner;

/**
 * 直接内存示例
 */
public class DirectMemoryDemo {
    public static void main(String[] args) {
        // 申请分配 1G 的直接内存
        ByteBuffer byteBuffer = ByteBuffer.allocateDirect(1024 * 1024 * 1024);
        System.out.println("内存分配完毕");
        /*
         * 这时使用 jps 查看服务的进程号，然后到任务管理器查看该进程占用的内存
         */

        // 等待输入然后进行垃圾回收
        new Scanner(System.in).next();
        byteBuffer = null;
        System.gc();
        System.out.println("直接内存释放");
        /*
        这时再次查看进程占用的内存，已经远小于 1G
         */

        new Scanner(System.in).next();
    }
}
