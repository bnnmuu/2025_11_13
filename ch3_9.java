public class ch3_9 {

    public static void main(String[] args) {
        Car myCar = new Car();

        myCar.carNumber = 3583;
        myCar.fuelLevel = 68.4;
    }
}

class Car {
    int carNumber;
    double fuelLevel;

    void showStatus() {
        System.out.println("車號是 " + carNumber);
        System.out.println("汽油量是 " + this.fuelLevel);
    }
}