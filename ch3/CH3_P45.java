public class CH3_P45 {
    public static void main(String[] args) {
        Car first = new Car();
        first.setCar(1234, 20.5);
        Car second = first;
        System.out.println("兩個變數指向同一個物件：" + (first == second));
        first.show();
        second.show();
        first.setCar(2345, 30.5);
        first.show();
        second.show();
    }

    private static class Car {
        private int number;
        private double fuel;

        void setCar(int number, double fuel) {
            this.number = number;
            this.fuel = fuel;
            System.out.println("將車號設為" + number + "，汽油量設為" + fuel);
        }

        void show() {
            System.out.println("車號是" + number);
            System.out.println("汽油量是" + fuel);
        }
    }
}
