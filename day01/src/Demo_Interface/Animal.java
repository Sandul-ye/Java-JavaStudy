package Demo_Interface;

public interface Animal {
    public default void eat(){
        System.out.println("吃");
    }

    public static void sleep(){
        System.out.println("睡");
    }

}
class Dog implements Animal{
//    @Override
//    public  void eat(){
//
//        System.out.println("吃狗粮！");
//    }


//    public void sleep(){
//        System.out.println("睡狗棚");
//    }
        }
