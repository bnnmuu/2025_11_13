public class ch3_26 {

    public static void main(String[] args) {
        Car car1 = new Car();
        car1.showStatus();
    }
}

class Car {
    private int carNumber;
    private double gasLevel;

    public Car() {
        carNumber = 2684;
        gasLevel = 49.4;
        System.out.println("生產車");
    }

    public void showStatus() {
        System.out.println("車號為 " + carNumber);
        System.out.println("汽油量為 " + gasLevel);
    }
}