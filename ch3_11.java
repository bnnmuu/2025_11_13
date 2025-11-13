public class ch3_11 {

    public static void main(String[] args) {
        Car myCar = new Car();

        myCar.carNumber = 4263;
        myCar.fuelLevel = 83.5;

        myCar.showStatus();
        myCar.showStatus();
    }
}

class Car {
    int carNumber;
    double fuelLevel;

    void showStatus() {
        System.out.println("車號是 " + carNumber);
        System.out.println("汽油量是 " + fuelLevel);
    }
}