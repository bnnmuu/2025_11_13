public class ch3_31 {

    public static void main(String[] args) {
        Car.showCarCount();

        Car car1 = new Car();
        car1.setCarData(2672, 36.9);
        Car.showCarCount();

        Car car2 = new Car();
        car2.setCarData(4862, 25.7);
        Car.showCarCount();
    }
}

class Car {
    public static int carCount = 0;
    private int carNumber;
    private double gasLevel;

    public Car() {
        carNumber = 0;
        gasLevel = 0.0;
        carCount++;
        System.out.println("生產車");
    }

    public void setCarData(int incomingNumber, double incomingGas) {
        carNumber = incomingNumber;
        gasLevel = incomingGas;
        System.out.println("車號為 " + carNumber + ", 汽油量為 " + gasLevel);
    }

    public static void showCarCount() {
        System.out.println("總共有 " + carCount + " 台車");
    }

    public void showStatus() {
        System.out.println("車號: " + carNumber);
        System.out.println("汽油量: " + gasLevel);
    }
}