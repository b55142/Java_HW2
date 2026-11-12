public class CH3_P07 {
    public static void main(String[] args) {
        Car first = new Car();
        first.number = 1234;
        first.fuel = 20.5;
        Car second = new Car();
        second.number = 2345;
        second.fuel = 30.5;
        first.show();
        second.show();
    }

    private static class Car {
        int number;
        double fuel;

        void show() {
            System.out.println("車號是" + number);
            System.out.println("汽油量是" + fuel);
        }
    }
}
