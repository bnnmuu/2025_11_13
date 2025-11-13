public class ch2_41 {

    public static void main(String[] args) {

        int[] scores;
        scores = new int[5];
        scores[0] = 73;
        scores[1] = 56;
        scores[2] = 90;
        scores[3] = 34;
        scores[4] = 76;

        // scores[5] = 39;(這一個分數不會被存入陣列，只能存五個;因為執行會錯誤所以先註解掉。)

        for (int i = 0; i < 5; i++) {
            System.out.println("第 " + (i + 1) + " 個人的分數是 " + scores[i] + " 分");
        }
    }
}