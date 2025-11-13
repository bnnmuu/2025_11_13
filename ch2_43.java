public class ch2_43 {

    public static void main(String[] args) {

        int[] scores = { 75, 84, 34, 82, 92 };
        for (int i = 0; i < scores.length; i++) {
            System.out.println("第 " + (i + 1) + " 個人得 " + scores[i] + " 分");
        }

        System.out.println("考試人數總共有 " + scores.length + " 人");
    }
}