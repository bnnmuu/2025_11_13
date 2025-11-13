public class ch3_12 {

    public static void main(String[] args) {
        Car myCar = new Car();

        myCar.carNumber = 4726;
        myCar.fuelLevel = 48.3;

        myCar.showInfo();
    }
}

class Car {
    int carNumber;
    double fuelLevel;

    void showStatus() {
        System.out.println("車號是 " + this.carNumber);
        System.out.println("汽油量是 " + this.fuelLevel);
    }

    void showInfo() {
        System.out.println("顯示車子資料");
        this.showStatus();
    }
}