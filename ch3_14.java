public class ch3_14 {

    public static void main(String[] args) {
        Car myCar = new Car();

        int numberArgument = 3575;
        myCar.setCarNumber(numberArgument);

        double gasArgument = 27.5;
        myCar.setGasLevel(gasArgument);
    }
}

class Car {
    int carNumber;
    double fuelLevel;

    void setCarNumber(int incomingNumber) {
        carNumber = incomingNumber;
        System.out.println("車號為 " + carNumber);
    }

    void setGasLevel(double incomingGas) {
        fuelLevel = incomingGas;
        System.out.println("汽油量為 " + fuelLevel);
    }
}