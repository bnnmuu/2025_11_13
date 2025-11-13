public class ch2_49 {

    public static void main(String[] args) {
        int[][] scores = new int[2][5];
        scores[0][0] = 63;
        scores[0][1] = 83;
        scores[0][2] = 41;
        scores[0][3] = 47;
        scores[0][4] = 94;

        scores[1][0] = 74;
        scores[1][1] = 52;
        scores[1][2] = 73;
        scores[1][3] = 94;
        scores[1][4] = 2;

        for (int i = 0; i < scores[0].length; i++) {
            System.out.println("第 " + (i + 1) + " 個人的國語得 " + scores[0][i] + " 分");
            System.out.println("第 " + (i + 1) + " 個人的數學得 " + scores[1][i] + " 分");
        }
    }
}