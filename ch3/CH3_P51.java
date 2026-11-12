public class CH3_P51 {
    public static void main(String[] args) {
        Car[] cars = new Car[3];
        int[] numbers = {1234, 2345, 3456};
        double[] fuelLevels = {20.5, 30.5, 40.5};
        for (int i = 0; i < cars.length; i++) {
            cars[i] = new Car();
            cars[i].setCar(numbers[i], fuelLevels[i]);
        }
        for (Car car : cars) {
            car.show();
        }
    }

    private static class Car {
        private int number;
        private double fuel;

        void setCar(int number, double fuel) {
            this.number = number;
            this.fuel = fuel;
            System.out.println("將車號設為" + number + "，汽油量設為" + fuel);
        }

        void show() {
            System.out.println("車號是" + number);
            System.out.println("汽油量是" + fuel);
        }
    }
}
