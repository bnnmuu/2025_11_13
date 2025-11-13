public class ch3_47 {

    public static void main(String[] args) {
        Car car1 = new Car();
        car1.showStatus();

        int carNumber = 1234;
        double gasoline = 20.5;
        String licensePlate = "1號車";

        car1.setCarData(carNumber, gasoline);
        car1.setLicensePlate(licensePlate);
        car1.showStatus();
    }
}

class Car {
    private int carNumber;
    private double gasLevel;
    private String plateName;

    public Car() {
        carNumber = 0;
        gasLevel = 0.0;
        plateName = "沒有名稱";
        System.out.println("生產車");
    }

    public void setCarData(int incomingNumber, double incomingGas) {
        carNumber = incomingNumber;
        gasLevel = incomingGas;
        System.out.println("車號為 " + carNumber + ", 汽油量為 " + gasLevel);
    }

    public void setLicensePlate(String plateString) {
        plateName = plateString;
        System.out.println("車牌名為 " + plateName);
    }

    public void showStatus() {
        System.out.println("車號是 " + carNumber);
        System.out.println("汽油量是 " + gasLevel);
        System.out.println("車牌名是 " + plateName);
    }
}