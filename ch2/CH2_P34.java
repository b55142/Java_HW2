import java.util.Scanner;

public class CH2_P34 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in, "UTF-8");
        System.out.println("要跳過第幾次處理？(1–10)");
        int skip = input.nextInt();
        for (int i = 1; i <= 10; i++) {
            if (i == skip) {
                continue;
            }
            System.out.println("第" + i + "次的處理。");
        }
    }
}
