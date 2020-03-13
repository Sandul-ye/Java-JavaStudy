package homework02;

public class MotorVehicles {
    private String brand;
    private double price;

    public MotorVehicles() {
    }

    public MotorVehicles(String brand, double price) {
        this.brand = brand;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void func(){
        System.out.println("运行");
    }
}
