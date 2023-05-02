package run_time_data_area.heap;

/**
 * 查看堆空间大小与物理机内存大小的关系
 */
public class ShowHeapSpaceInitial {
    public static void main(String[] args) throws InterruptedException {
        // JVM 将尝试使用的最大内存量。 JVM 堆当前使用的内存总量，单位 M
        long initialMemory = Runtime.getRuntime().totalMemory() / 1024 / 1024;
        // JVM 中的内存总量。JVM 堆使用的最大内存总量，单位 M
        long maxMemory = Runtime.getRuntime().maxMemory() / 1024 / 1024;

        System.out.println("initialMemory: " + initialMemory + "MB");
        System.out.println("maxMemory: " + maxMemory + "MB");

        System.out.println("SystemMemory:" + initialMemory * 64.0 / 1024 + "G");
        System.out.println("SystemMemory:" + maxMemory * 4.0 / 1024 + "G");

        Thread.sleep(100000);
    }
}
