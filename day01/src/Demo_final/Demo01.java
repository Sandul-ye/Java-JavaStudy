package Demo_final;

public class Demo01 {
    public static void main(String[] args) {
        final int a = 10;
        // a = 20;  报错，因为被final声明过的变量不能再重新赋值
        int b = 20;
        b = 30;
        System.out.println(a);
    }
}
