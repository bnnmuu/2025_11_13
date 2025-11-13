public class ch3_51 {

    public static void main(String[] args) {
        Car[] carArray = new Car[3];

        for (int i = 0; i < carArray.length; i++) {
            carArray[i] = new Car();
        }

        carArray[0].setCarData(4567, 12.3);
        carArray[1].setCarData(8910, 45.6);
        carArray[2].setCarData(1112, 78.9);

        for (int i = 0; i < carArray.length; i++) {
            carArray[i].showStatus();
        }
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