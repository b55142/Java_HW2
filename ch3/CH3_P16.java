public class CH3_P16 {
    public static void main(String[] args) {
        Car car = new Car();
        car.number = 1234;
        int number = car.getNumber();
        System.out.println("車號是" + number);
    }

    private static class Car {
        int number;
        double fuel;

        int getNumber() {
            return number;
        }
    }
}
