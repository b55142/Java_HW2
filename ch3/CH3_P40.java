import java.util.Scanner;

public class CH3_P40 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in, "UTF-8");
        System.out.println("請輸入字串");
        String text = input.nextLine();
        System.out.println("請輸入要新增的字串");
        String extra = input.nextLine();
        StringBuffer buffer = new StringBuffer(text);
        buffer.append(extra);
        System.out.println("在「" + text + "」後新增「" + extra + "」會變成「" + buffer + "」");
    }
}
