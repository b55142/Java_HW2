public class CH2_P49 {
    public static void main(String[] args) {
        int[][] scores = new int[2][5];
        scores[0] = new int[]{80, 60, 22, 50, 75};
        int[] math = {90, 55, 68, 72};
        System.arraycopy(math, 0, scores[1], 0, math.length);
        String[] subjects = {"國語", "數學"};
        for (int student = 0; student < scores[0].length; student++) {
            for (int subject = 0; subject < subjects.length; subject++) {
                System.out.println("第" + (student + 1) + "個人的" + subjects[subject]
                        + "分數是" + scores[subject][student] + "分");
            }
        }
    }
}
