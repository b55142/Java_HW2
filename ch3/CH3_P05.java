public class CH3_P05 {
    public static void main(String[] args) {
        Car car = new Car();
        System.out.println("建立 Car 物件：" + (car != null));
    }

    private static class Car {}
}
