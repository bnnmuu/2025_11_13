public class ch2_42 {

    public static void main(String[] args) {
        int[] scores = { 54, 86, 53, 99, 85 };
        for (int i = 0; i < 5; i++) {
            System.out.println("第 " + (i + 1) + " 個人得 " + scores[i] + " 分");
        }
    }
}