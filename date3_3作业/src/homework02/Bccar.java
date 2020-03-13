package homework02;

public class Bccar extends Benchi {
    private String leibie;

    public String getLeibie() {
        return leibie;
    }

    public Bccar() {
        this.leibie = "汽车类";
        this.setPrice(99.6);

    }
    public void show(){
        System.out.println(this.getLeibie());
        System.out.println(this.getBrand());
        System.out.println(this.getPrice());
    }
}
