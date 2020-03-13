package jiaqiang.demo01;

public abstract class Person {
    public String name;
    public String id;
    public String department;

    public Person(String name, String id, String department) {
        this.name = name;
        this.id = id;
        this.department = department;
    }

    public abstract void func();
}
