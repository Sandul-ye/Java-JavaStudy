package homework02;

public class BMmotor extends Baoma {
    private String leibie;

    public String getLeibie() {
        return leibie;
    }

    public BMmotor() {
        this.leibie = "摩托车";
        this.setPrice(15.8);
    }
    public void show(){
        System.out.println(this.getLeibie());
        System.out.println(this.getBrand());
        System.out.println(this.getPrice());
        this.gpsFuntion();

    }
}
