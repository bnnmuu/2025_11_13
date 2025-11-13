public class ch3_15 {

    public static void main(String[] args) {
        Car myCar = new Car();

        int carNumber = 3573;
        double gasLevel = 36.4;

        myCar.setNumGas(carNumber, gasLevel);
    }
}

class Car {
    int carNumber;
    double fuelLevel;

    void setNumGas(int incomingNumber, double incomingGas) {
        carNumber = incomingNumber;
        fuelLevel = incomingGas;
        System.out.println("車號為 " + carNumber + ", 汽油量為 " + fuelLevel + " 公升");
    }

    void showStatus() {
        System.out.println("車號是 " + carNumber);
        System.out.println("汽油量是 " + fuelLevel);
    }
}