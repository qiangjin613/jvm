package run_time_data_area.stack;

/**
 * 局部变量表中<b>变量槽复用</b>对 GC 的影响
 */
public class LocalVariablesTableForGC {

//    public static void main(String[] args) {
//        byte[] placeholder = new byte[64 * 1024 * 1024];
//        System.gc();
//    }

//    public static void main(String[] args) {
//        {
//            byte[] placeholder = new byte[64 * 1024 * 1024];
//        }
//        System.gc();
//    }

    public static void main(String[] args) {
        {
            byte[] placeholder = new byte[64 * 1024 * 1024];
        }
        int a = 0;
        System.gc();
    }
}
