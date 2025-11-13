public class ch3_45 {

    public static void main(String[] args) {
        System.out.println("宣告 car1");
        Car car1 = new Car();
        car1.setCarData(3557, 25.8);
        car1.showStatus();

        System.out.println("宣告 car2");
        Car car2;

        System.out.println("將 car1 給 car2");
        car2 = car1;

        car2.showStatus();

        System.out.println("改變 car1 的相關資料");
        car1.setCarData(6522, 58.3);

        System.out.println("car1 的資料:");
        car1.showStatus();

        System.out.println("car2 的資料:");
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

    public void setCarData(int incomingNumber, double incomingGas) {
        carNumber = incomingNumber;
        gasLevel = incomingGas;
        System.out.println("車號為 " + carNumber + ", 汽油量為 " + gasLevel);
    }

    public void showStatus() {
        System.out.println("車號是 " + carNumber);
        System.out.println("汽油量是 " + gasLevel);
    }
}