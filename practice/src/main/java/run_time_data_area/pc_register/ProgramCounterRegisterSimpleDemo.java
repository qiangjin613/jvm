package run_time_data_area.pc_register;

/**
 * 寄存器的在字节码中的位置（示例）
 * <p>
 * 使用 javap -v ProgramCounterRegisterSimpleDemo.class 看看哪些与 pc 寄存器相关
 */
public class ProgramCounterRegisterSimpleDemo {

    public static void main(String[] args) {
        int i = 10;
        int j = 20;
        int k = i + j;
    }
}
