public class ch3_17 {

    public static void main(String[] args) {
        Car myCar = new Car();

        myCar.setNumGas(3575, 47.3);

        int carNumber = myCar.getCarNumber();
        double gasoline = myCar.getGasLevel();

        System.out.println("經過調查後得知:");
        System.out.println("車號是 " + carNumber + ", 汽油量是 " + gasoline);
    }
}

class Car {
    int carNumber;
    double fuelLevel;

    int getCarNumber() {
        System.out.println("調查車號...");
        return carNumber;
    }

    double getGasLevel() {
        System.out.println("調查汽油量...");
        return fuelLevel;
    }

    void setNumGas(int incomingNumber, double incomingGas) {
        carNumber = incomingNumber;
        fuelLevel = incomingGas;
        System.out.println("車輛為 " + carNumber + ", 汽油量為 " + fuelLevel + " 公升");
    }
}