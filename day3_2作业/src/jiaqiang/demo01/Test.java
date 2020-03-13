package jiaqiang.demo01;

public class Test {
    public static void main(String[] args) {
        Staff s = new Staff("张小强","M001","销售部的");
        Manager m = new Manager("李小亮","C001","销售部的：");
        System.out.println(s.department + s.name + "员工编号" + s.id);
        s.func();
        System.out.println(m.department + m.name + "员工编号" + m.id);
        m.func();
    }

}
