public class CH3_P20 {
    public static void main(String[] args) {
        Car car = new Car();
        car.number = 1234;
        // 示範未封裝的欄位可以被設為不合法的值。
        car.fuel = -10.0;
        car.show();
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
