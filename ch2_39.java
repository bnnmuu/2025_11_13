public class ch2_39 {

    public static void main(String[] args) {

        int[] scores;
        scores = new int[5];

        scores[0] = 82;
        scores[1] = 60;
        scores[2] = 82;
        scores[3] = 59;
        scores[4] = 57;

        for (int i = 0; i < 5; i++) {
            System.out.println("第 " + (i + 1) + " 個人得 " + scores[i] + " 分");
        }
    }
}