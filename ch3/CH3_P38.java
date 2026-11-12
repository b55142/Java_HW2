import java.util.Scanner;

public class CH3_P38 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in, "UTF-8");
        System.out.println("請輸入字串");
        String text = input.nextLine();
        System.out.println("請輸入要檢索的文字");
        String query = input.nextLine();
        if (query.isEmpty()) {
            System.out.println("請輸入至少一個字元");
            return;
        }
        char target = query.charAt(0);
        int index = text.indexOf(target);
        if (index >= 0) {
            System.out.println(text + "的第" + (index + 1) + "個字元是「" + target + "」");
        } else {
            System.out.println(text + "中沒有「" + target + "」這個字元");
        }
    }
}
