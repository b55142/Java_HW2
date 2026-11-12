import java.util.Scanner;

public class CH2_P10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in, "UTF-8");
        int n = input.nextInt();
        if (n == 1) {
            System.out.println("輸入的是1");
        } else {
            System.out.println("選擇的是1以外的數字");
        }
    }
}
