package homework02;

public class Baoma extends MotorVehicles implements GPSfunction{
    public Baoma() {
        this.setBrand("宝马");
    }

    @Override
    public void gpsFuntion() {
        System.out.println("我是GPS功能");
    }
}
