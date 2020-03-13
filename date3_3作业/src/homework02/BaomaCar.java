package homework02;

public class BaomaCar extends Baoma {
    private String leibie;

    public String getLeibie() {
        return leibie;
    }
    public BaomaCar(){
        this.leibie = "汽车类";
        this.setPrice(88.2);
    }
    public void show(){
        System.out.println(this.getLeibie());
        System.out.println(this.getBrand());
        System.out.println(this.getPrice());
        this.gpsFuntion();
    }
}
