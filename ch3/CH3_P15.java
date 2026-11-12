public class CH3_P15 {
    public static void main(String[] args) {
        Car car = new Car();
        int number = 1234;
        double fuel = 20.5;
        car.setCar(number, fuel);
    }

    private static class Car {
        int number;
        double fuel;

        void setCar(int number, double fuel) {
            this.number = number;
            this.fuel = fuel;
            System.out.println("將車號設為" + number + "，汽油量設為" + fuel);
        }
    }
}
