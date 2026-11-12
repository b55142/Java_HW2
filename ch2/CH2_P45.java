import java.util.Scanner;

public class CH2_P45 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in, "UTF-8");
        System.out.println("請輸入5個人的分數");
        int[] scores = new int[5];
        for (int i = 0; i < scores.length; i++) {
            scores[i] = input.nextInt();
        }
        for (int end = scores.length - 1; end > 0; end--) {
            boolean swapped = false;
            for (int i = 0; i < end; i++) {
                if (scores[i] < scores[i + 1]) {
                    int temp = scores[i];
                    scores[i] = scores[i + 1];
                    scores[i + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
        for (int i = 0; i < scores.length; i++) {
            System.out.println("第" + (i + 1) + "名的分數是" + scores[i]);
        }
    }
}
