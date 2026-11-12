import java.util.Scanner;

public class CH2_P15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in, "UTF-8");
        int n = input.nextInt();
        // 投影片的錯誤版本漏寫 break，輸入 1 會跑到 case 2 和 default。
        switch (n) {
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
