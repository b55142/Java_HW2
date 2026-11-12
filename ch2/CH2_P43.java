public class CH2_P43 {
    public static void main(String[] args) {
        int[] scores = {80, 60, 22, 50, 75};
        printScores(scores);
        System.out.println("考試人數為" + scores.length + "人");
    }

    private static void printScores(int[] scores) {
        for (int i = 0; i < scores.length; i++) {
            System.out.println("第" + (i + 1) + "個人的分數是" + scores[i] + "分");
        }
    }
}
