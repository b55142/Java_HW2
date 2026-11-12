public class CH3_P14 {
    public static void main(String[] args) {
        Car car = new Car();
        car.setNumber(1234);
        car.setFuel(20.5);
    }

    private static class Car {
        int number;
        double fuel;

        void setNumber(int number) {
            this.number = number;
            System.out.println("將車號設為" + number);
        }

        void setFuel(double fuel) {
            this.fuel = fuel;
            System.out.println("將汽油量設為" + fuel);
        }
    }
}
