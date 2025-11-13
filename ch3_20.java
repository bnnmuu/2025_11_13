public class ch3_20 {

    public static void main(String[] args) {
        Car myCar = new Car();

        myCar.carNumber = 5285;
        myCar.gasLevel = -25.7;

        myCar.showStatus();
    }
}

class Car {
    int carNumber;
    double gasLevel;

    void showStatus() {
        System.out.println("車號為 " + this.carNumber);
        System.out.println("汽油量為 " + this.gasLevel);
    }
}