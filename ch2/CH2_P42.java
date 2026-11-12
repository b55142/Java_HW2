import java.util.Arrays;

public class CH2_P42 {
    public static void main(String[] args) {
        int[] scores = {80, 60, 22, 50, 75};
        printScores(scores);
        System.out.println("新建 int[10]：" + Arrays.toString(new int[10]));
    }

    private static void printScores(int[] scores) {
        for (int i = 0; i < scores.length; i++) {
            System.out.println("第" + (i + 1) + "個人的分數是" + scores[i] + "分");
        }
    }
}
