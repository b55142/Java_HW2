public class CH3_P47 {
    public static void main(String[] args) {
        Car car = new Car();
        car.show();
        car.setCar(1234, 20.5);
        String name = "1號車";
        car.setName(name);
        car.show();
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
            System.out.println("車名是" + name);
        }

        private String name = "沒有名稱";

        void setName(String name) {
            this.name = name;
        }
    }
}
