package homewor01;

public class UiTeacher extends Employee implements Drawing {
    @Override
    public void work() {
        System.out.println("UI讲师喜欢画画！");
    }

    @Override
    public void painting() {
        System.out.println("绘画非常厉害");
    }

    public UiTeacher() {
    }

    public UiTeacher(String name, String sex, int age) {
        super(name, sex, age);
    }
}
