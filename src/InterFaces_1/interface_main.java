package InterFaces_1;
class Tesla implements Vehicle,Electric{
    @Override
    public void startEngine(){
        System.out.println("Start Engine");
    }

    @Override
    public void stopEngine() {
        System.out.println("Stop Engine");
    }

    @Override
    public void accelearate() {
        System.out.println("Acellerate");
    }

    @Override
    public void chargeBattery() {
        System.out.println("Charge Battery");
    }
}
public class interface_main {
    public static void main(String[] args) {
        Tesla car_1 = new Tesla();
        car_1.accelearate();
        car_1.chargeBattery();
    }
}
