public class ch3_24 {

    public static void main(String[] args) {
        Car car1 = new Car();
        car1.setCarData(5274, 52.6);
        car1.showStatus();

        System.out.println("-----------------");

        Car car2 = new Car();
        car2.setCarData(4285);
        car2.setCarData(25.4);
        car2.showStatus();
    }
}

class Car {
    private int carNumber;
    private double gasLevel;

    public void setCarData(int incomingNumber) {
        carNumber = incomingNumber;
        System.out.println("車號為 " + carNumber);
    }

    public void setCarData(double incomingGas) {
        gasLevel = incomingGas;
        System.out.println("汽油量為 " + gasLevel);
    }

    public void setCarData(int incomingNumber, double incomingGas) {
        carNumber = incomingNumber;
        gasLevel = incomingGas;
        System.out.println("車號為 " + carNumber + ", 汽油量為 " + gasLevel);
    }

    public void showStatus() {
        System.out.println("車號是 " + this.carNumber);
        System.out.println("汽油量是 " + this.gasLevel);
    }
}