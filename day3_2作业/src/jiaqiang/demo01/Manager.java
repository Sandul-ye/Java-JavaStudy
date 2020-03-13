package jiaqiang.demo01;

public class Manager extends Person {
    public Manager(String name, String id, String department) {
        super(name, id, department);
    }

    @Override
    public void func() {

        System.out.println("他的职员是张小强");
    }
}
