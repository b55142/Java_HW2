public class CH3_P09 {
    public static void main(String[] args) {
        Car car = new Car();
        car.number = 1234;
        car.fuel = 20.5;
        car.show();
    }

    private static class Car {
        int number;
        double fuel;

        void show() {
            System.out.println("車號是" + this.number);
            System.out.println("汽油量是" + fuel);
        }
    }
}
