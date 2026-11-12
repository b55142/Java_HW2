public class CH2_P41 {
    public static void main(String[] args) {
        int[] scores = {80, 60, 22, 50, 75};
        int index = 10;
        if (index >= 0 && index < scores.length) {
            scores[index] = 75;
        } else {
            System.out.println("索引 " + index + " 超出範圍");
        }
        printScores(scores);
    }

    private static void printScores(int[] scores) {
        for (int i = 0; i < scores.length; i++) {
            System.out.println("第" + (i + 1) + "個人的分數是" + scores[i] + "分");
        }
    }
}
