public class CH3_P26 {
    public static void main(String[] args) {
        Car car = new Car();
        car.show();
    }

    private static class Car {
        private int number;
        private double fuel;

        void show() {
            System.out.println("車號是" + number);
            System.out.println("汽油量是" + fuel);
        }

        Car() {
            number = 0;
            fuel = 0.0;
            System.out.println("生產了車子");
        }
    }
}
