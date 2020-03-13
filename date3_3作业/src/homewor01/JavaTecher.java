package homewor01;

public class JavaTecher extends Employee {
    @Override
    public void work() {
        System.out.println("java讲师讲课！");
    }

    public JavaTecher() {
    }

    public JavaTecher(String name, String sex, int age) {
        super(name, sex, age);
    }
}
