package run_time_data_area.heap.exception;

import java.util.ArrayList;
import java.util.List;

/**
 * 堆溢出示例
 * <p>
 * -Xmx5M
 * -XX:+PrintGCApplicationStoppedTime
 */
public class OutOfMemoryErrorTest {

    private byte[] _1M = new byte[1024 * 1024];

    public static void main(String[] args) throws InterruptedException {
        List<OutOfMemoryErrorTest> runTimeData = new ArrayList<OutOfMemoryErrorTest>();
        while (true) {
            Thread.sleep(10);
            runTimeData.add(new OutOfMemoryErrorTest());
        }
    }
}
