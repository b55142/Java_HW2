import java.util.Scanner;

public class CH2_P12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in, "UTF-8");
        int n = input.nextInt();
        if (n == 1) {
            System.out.println("輸入的是1");
        } else if (n == 2) {
            System.out.println("輸入的是2");
        } else {
            System.out.println("請輸入1或2");
        }
    }
}
