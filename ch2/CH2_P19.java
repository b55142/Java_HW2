import java.util.Scanner;

public class CH2_P19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in, "UTF-8");
        System.out.println("請問你是男生嗎？請輸入Y或N");
        char answer = firstChar(input.nextLine());
        if (answer == 'Y' || answer == 'y') {
            System.out.println("你是男生啊！");
        } else if (answer == 'N' || answer == 'n') {
            System.out.println("你是女生啊！");
        } else {
            System.out.println("請輸入Y或N");
        }
    }

    private static char firstChar(String line) {
        return line.isEmpty() ? '\0' : line.charAt(0);
    }
}
