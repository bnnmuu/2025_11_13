public class ch3_7 {

    public static void main(String[] args) {
        Car car1 = new Car();
        car1.carNumber = 4276;
        car1.fuelLevel = 13.6;

        Car car2 = new Car();
        car2.carNumber = 2486;
        car2.fuelLevel = 24.9;

        System.out.println("car1 車號是 " + car1.carNumber);
        System.out.println("car1 汽油量是 " + car1.fuelLevel);
        System.out.println("car2 車號是 " + car2.carNumber);
        System.out.println("car2 汽油量是 " + car2.fuelLevel);
    }
}

class Car {
    int carNumber;
    double fuelLevel;
}