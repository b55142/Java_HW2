import java.util.Scanner;

public class CH3_P43 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in, "UTF-8");
        System.out.println("請輸入兩個整數");
        int first = input.nextInt();
        int second = input.nextInt();
        System.out.println(first + "與" + second + "中較大的是" + Math.max(first, second));
    }
}
