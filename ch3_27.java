public class ch3_27 {

    public static void main(String[] args) {
        Car car1 = new Car();
        car1.showStatus();

        System.out.println("-----------------");

        Car car2 = new Car(2548, 94.6);
        car2.showStatus();
    }
}

class Car {
    private int carNumber;
    private double gasLevel;

    public Car() {
        carNumber = 0;
        gasLevel = 0.0;
        System.out.println("生產車");
    }

    public Car(int incomingNumber, double incomingGas) {
        carNumber = incomingNumber;
        gasLevel = incomingGas;
        System.out.println("生產了車號為 " + carNumber + ", 汽油量為 " + gasLevel + " 的車");
    }

    public void showStatus() {
        System.out.println("車號: " + carNumber);
        System.out.println("汽油量: " + gasLevel);
    }
}