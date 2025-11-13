public class ch3_22 {

    public static void main(String[] args) {

        Car myCar = new Car();

        myCar.setCarData(2475, 36.6);
        myCar.showStatus();
        System.out.println("指定不正確的汽油量(-20.0)看看");
        myCar.setGasLevel(2475, -20.0);
        myCar.showStatus();
    }
}

class Car {
    private int carNumber;
    private double gasLevel;

    public void setCarData(int incomingNumber, double incomingGas) {
        if (incomingGas >= 0.0 && incomingGas <= 100.0) {
            carNumber = incomingNumber;
            gasLevel = incomingGas;
            System.out.println("車號為 " + carNumber + ", 汽油量為 " + gasLevel);
        } else {
            System.out.println(gasLevel + "非正確汽油量");
            System.out.println("無法變更汽油量");
        }
    }

    public void setGasLevel(double incomingGas) {
        if (incomingGas >= 0.0 && incomingGas <= 100.0) {
            gasLevel = incomingGas;
        } else {
            System.out.println("指定不正確的汽油量(" + incomingGas + ")看看");
            System.out.println("不正確的汽油量，無法變更汽油量");
        }
    }

    public void showStatus() {
        System.out.println("車號為 " + this.carNumber);
        System.out.println("汽油量為 " + this.gasLevel);
    }
}