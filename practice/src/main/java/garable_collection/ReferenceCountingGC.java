package garable_collection;

/**
 * 佐证 Java 没使用引用技术来判定对象是否“存活”
 * <p>
 * 在发生 GC 行为后，改对象被回收，间接说明 Java 没用引用技术算法来判定对象是否存货。
 */
public class ReferenceCountingGC {
    public Object obj;

    /** 占 20MB 的内存，方便在 GC 日志中看当前对象是否被回收 */
    private static final byte[] _10MB = new byte[50 * 1024 * 1024];

    public static void main(String[] args) {
        ReferenceCountingGC r1 = new ReferenceCountingGC();
        ReferenceCountingGC r2 = new ReferenceCountingGC();

        // 循环引用
        r1.obj = r2;
        r2.obj = r1;

        r1 = null;
        r2 = null;
        System.gc();
    }
}
