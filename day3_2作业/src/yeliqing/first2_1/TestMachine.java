package yeliqing.first2_1;

public class TestMachine {
    public static void main(String[] args) {
        Freezer f = new Freezer();
        Washer w = new Washer();
        TV t = new TV();
        System.out.println(f.brand);
        System.out.println(f.price);
        System.out.println(f.color);
        System.out.println(f.func);
        System.out.println(f.door);

    }
}
