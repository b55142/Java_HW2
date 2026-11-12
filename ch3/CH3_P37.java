import java.util.Scanner;
import java.util.Locale;

public class CH3_P37 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in, "UTF-8");
        System.out.println("請輸入英文字母");
        String word = input.nextLine();
        System.out.println("轉換成大寫時為" + word.toUpperCase(Locale.ROOT));
        System.out.println("轉換成小寫時為" + word.toLowerCase(Locale.ROOT));
    }
}
