import java.util.Scanner;

public class CH2_P08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in, "UTF-8");
        int n = input.nextInt();
        // 投影片的錯誤版本會無條件印出「選擇的是1」。
        if (n == 1) {
            System.out.println("輸入的是1");
            System.out.println("選擇的是1");
        }
        System.out.println("結束處理");
    }
}
