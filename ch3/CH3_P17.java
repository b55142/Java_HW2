public class CH3_P17 {
    public static void main(String[] args) {
        Car car = new Car();
        car.setCar(1234, 20.5);
        int number = car.getNumber();
        double fuel = car.getFuel();
        System.out.println("車號是" + number + "，汽油量是" + fuel);
    }

    private static class Car {
        int number;
        double fuel;

        void setCar(int number, double fuel) {
            this.number = number;
            this.fuel = fuel;
            System.out.println("將車號設為" + number + "，汽油量設為" + fuel);
        }

        int getNumber() {
            return number;
        }

        double getFuel() {
            return fuel;
        }
    }
}
