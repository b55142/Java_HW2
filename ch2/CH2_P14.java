import java.util.Scanner;

public class CH2_P14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in, "UTF-8");
        switch (input.nextInt()) {
            case 1:
                System.out.println("輸入的是1");
                break;
            case 2:
                System.out.println("輸入的是2");
                break;
            default:
                System.out.println("請輸入1或2");
        }
    }
}
