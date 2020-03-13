package jiaqiang.demo01;

public class Staff extends Person {
    public Staff(String name, String id, String department) {
        super(name, id, department);
    }

    @Override
    public void func() {
        System.out.println("他的职员是李小亮");
    }
}
