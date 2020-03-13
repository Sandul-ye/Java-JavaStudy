package homewor01;

public class Test01 {
    public static void main(String[] args) {
        JavaTecher jt = new JavaTecher("java讲师","男",35);
        UiTeacher ut = new UiTeacher("UI讲师","女",30);
        jt.work();
        System.out.println(jt.getName());
        System.out.println(jt.getSex());
        System.out.println(jt.getAge());
        ut.work();
        ut.painting();
        System.out.println(ut.getName());
        System.out.println(ut.getSex());
        System.out.println(ut.getAge());


    }
}
