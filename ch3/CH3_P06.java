public class CH3_P06 {
    public static void main(String[] args) {
        Car car = new Car();
        car.number = 1234;
        car.fuel = 20.5;
        System.out.println("車號是" + car.number);
        System.out.println("汽油量是" + car.fuel);
    }

    private static class Car {
        int number;
        double fuel;
    }
}
