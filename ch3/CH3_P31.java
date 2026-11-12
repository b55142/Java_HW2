public class CH3_P31 {
    public static void main(String[] args) {
        Car.showCount();
        Car first = new Car();
        first.setCar(1234, 20.5);
        Car.showCount();
        Car second = new Car();
        second.setCar(4567, 30.5);
        Car.showCount();
    }

    private static class Car {
        private int number;
        private double fuel;

        void setCar(int number, double fuel) {
            this.number = number;
            this.fuel = fuel;
            System.out.println("將車號設為" + number + "，汽油量設為" + fuel);
        }

        private static int count;

        Car() {
            count++;
            System.out.println("生產了車子");
        }

        static void showCount() {
            System.out.println("車子總共有" + count + "台");
        }
    }
}
