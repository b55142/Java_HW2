import java.util.Scanner;

public class CH2_P32 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in, "UTF-8");
        System.out.println("要在第幾次處理結束迴圈？(1–10)");
        int stopAt = input.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println("第" + i + "次的處理。");
            if (i == stopAt) {
                break;
            }
        }
    }
}
