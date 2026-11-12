public class CH3_P27 {
    public static void main(String[] args) {
        new Car().show();
        new Car(1234, 25.0).show();
    }

    private static class Car {
        private int number;
        private double fuel;

        void show() {
            System.out.println("車號是" + number);
            System.out.println("汽油量是" + fuel);
        }

        Car() {
            System.out.println("生產了車子");
        }

        Car(int number, double fuel) {
            this.number = number;
            this.fuel = fuel;
            System.out.println("生產了車號為" + number + "，汽油量為" + fuel + "的車子");
        }
    }
}
