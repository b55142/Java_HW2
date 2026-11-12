public class CH3_P12 {
    public static void main(String[] args) {
        Car car = new Car();
        car.number = 1234;
        car.fuel = 20.5;
        car.showCar();
    }

    private static class Car {
        int number;
        double fuel;

        void show() {
            System.out.println("車號是" + number);
            System.out.println("汽油量是" + fuel);
        }

        void showCar() {
            System.out.println("開始顯示車子資料");
            this.show();
        }
    }
}
