public class CH3_P24 {
    public static void main(String[] args) {
        Car car = new Car();
        car.setCar(1234, 20.5);
        car.show();
        car.setCar(2345);
        car.show();
        car.setCar(30.5);
        car.show();
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

        void setCar(int number) {
            this.number = number;
        }

        void setCar(double fuel) {
            this.fuel = fuel;
        }
    }
}
