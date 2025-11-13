public class ch3_6 {

    public static void main(String[] args) {
        Car myCar = new Car();

        myCar.carNumber = 3575;
        myCar.fuelLevel = 35.75;

        System.out.println("車號是 " + myCar.carNumber);
        System.out.println("汽油量是 " + myCar.fuelLevel);
    }
}

class Car {
    int carNumber;
    double fuelLevel;
}