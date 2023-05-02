package run_time_data_area.stack.exception;

/**
 * 栈溢出示例
 * <p>
 * -Xss
 */
public class StackOverflowExceptionTest {

    static int count = 1;

    public static void main(String[] args) {
        System.out.println(count++);
        main(args);
    }
}
