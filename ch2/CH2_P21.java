import java.util.Scanner;

public class CH2_P21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in, "UTF-8");
        System.out.println("請問要選哪條路線？請輸入整數");
        char route = input.nextInt() == 1 ? 'A' : 'B';
        System.out.println("選擇了" + route + "路線");
    }
}
