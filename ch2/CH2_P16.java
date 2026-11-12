import java.util.Scanner;

public class CH2_P16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in, "UTF-8");
        switch (firstChar(input.nextLine())) {
            case 'a':
                System.out.println("輸入的是a");
                break;
            case 'b':
                System.out.println("輸入的是b");
                break;
            default:
                System.out.println("請輸入a或b");
        }
    }

    private static char firstChar(String line) {
        return line.isEmpty() ? '\0' : line.charAt(0);
    }
}
