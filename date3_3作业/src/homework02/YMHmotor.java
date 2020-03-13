package homework02;

public class YMHmotor extends Motor {
    public YMHmotor() {

        this.setBrand("雅马哈摩托");
        this.setPrice(20);
    }
    public void show(){
        System.out.println(this.getBrand());
        System.out.println(this.getPrice());
        System.out.println(this.getLeibie());
    }

}
