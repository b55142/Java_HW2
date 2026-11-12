import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

public class CH2_P47 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in, "UTF-8");
        System.out.println("請輸入5個人的分數");
        Integer[] scores = new Integer[5];
        for (int i = 0; i < scores.length; i++) {
            scores[i] = input.nextInt();
        }
        Arrays.sort(scores, Collections.reverseOrder());
        for (int i = 0; i < scores.length; i++) {
            System.out.println("第" + (i + 1) + "名的分數是" + scores[i]);
        }
    }
}
