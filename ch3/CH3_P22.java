public class CH3_P22 {
    public static void main(String[] args) {
        Car car = new Car();
        car.setCar(1234, 20.5);
        car.show();
        car.setCar(2345, -10.0);
        car.show();
    }

    private static class Car {
        private int number;
        private double fuel;

        public void setCar(int number, double fuel) {
            if (!(fuel > 0 && fuel < 100)) {
                System.out.println(fuel + " 不是正確的汽油量，保留原設定");
                return;
            }
            this.number = number;
            this.fuel = fuel;
        }

        public void show() {
            System.out.println("車號是" + number);
            System.out.println("汽油量是" + fuel);
        }
    }
}
